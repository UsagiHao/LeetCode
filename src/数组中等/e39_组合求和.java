package 数组中等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e39_组合求和 {

    /**
     * “递归回溯！！！”
     * 首先对数组进行排序，以便比较：由于数组中的元素均为正整数，如果前i个元素总和已经大于target，则之后的的元素就无需考虑。
     * 然后考虑对于数组中的一个元素candidates[i]，有两种情况：
     * 第一种情况：符合要求的组合中包含candidate[i]，这种情况下等同于求解在原数组中求所有和为target-candidate[i]的组合，然后每一个组合中添加元素candidate[i]，也就是target规模缩小。
     * 第二种情况：符合要求的组合中不包含candidate[i]，这种情况下等同于在去除了candiate[i]的原数组中求所有和为target的组合，也就是数组的规模缩小。
     * 综上，原问题可以拆解为规模更小的子问题解决。
     */
    /*class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target){
            Arrays.sort(candidates);
            return combinationSum(candidates,target,0,candidates.length-1);
        }

        private List<List<Integer>> combinationSum(int[] candidates,int target,int begin,int end){
            List<List<Integer>> list = new ArrayList<>();

            if(begin <= end){
                int cur = candidates[begin];

                if(cur==target){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(cur);
                    list.add(list1);
                }

                if(cur < target){
                    for(List<Integer> list1 : combinationSum(candidates,target-cur,begin,end)){
                        list1.add(cur);
                        list.add(list1);
                    }
                    list.addAll(combinationSum(candidates, target, begin + 1, end));
                }
            }
            return list;
        }
    }*/

    /**
     * 经典深度优先搜索+回溯问题。
     * 因为candidates数组是没有重复的，且每个数字都可以用无限次，代表每次搜索的时候都要从自己开始。
     * 而当所有从自己出发的路径考虑完毕后，要把自己剔除出去（即回溯）进而搜索下一个数值。
     * 如果用有向图的思想，把每个数组下标都想成一个节点，节点之间的权值是从这个节点下标出发时对应的数组元素（即出权值），那么问题转化为寻找权值为target的路径。
     * 每一个节点都可以连通到其他节点，且每个节点又都有自环。模型想象到这里就更容易理解下面的代码。
     */

    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            if(candidates == null) return res;
            List<Integer> list = new ArrayList<>(); //存放路径上的节点
            get(candidates, 0, target, list, res);
            return res;
        }

        public  void get(int[] nums, int i, int target, List<Integer> list, List<List<Integer>> res) {
            if (target < 0) return; //如果路径值小于0，搜索结束，因为所有权值都是大于零，即一旦达到负数没有办法再回到0
            if (target == 0) { //如果目标为0代表路径权值和已经满为target，满足条件，故添加路径到结果集
                res.add(new ArrayList<>(list)); //
                return;
            }
            for (int p = i; p < nums.length; p++) {
                list.add(nums[p]); //添加节点到路径
                get(nums, p, target - nums[p], list, res); //在已有路径基础上继续查找更新权值后后的路径，因为有自环，所以还是从自身节点开始搜索
                list.remove(list.size() - 1); //当从当前节点的所有路径都搜索完毕后，将其剔除，之后重新搜索从下一个节点开始的所有路径
            }
        }
    }
}
