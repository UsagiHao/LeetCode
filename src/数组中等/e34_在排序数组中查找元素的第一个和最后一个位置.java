package 数组中等;

public class e34_在排序数组中查找元素的第一个和最后一个位置 {
    //看到logn的时间复杂度就要想到用二分法
    //先找到第一次nums[mid]为target的位置，然后分左右两边找第一个和最后一个的位置，同样是二分法
    //要注意循环的终止条件是left<=right而不是<，同时确认找到的是第一个位置的判断条件是nums[mid1] == target,并且mid1 == 0 || (mid1 > 0 && nums[mid1 - 1] != target)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int [] {-1, -1};
            if (nums.length < 1) return result;
            if (nums.length == 1){
                if (nums[0] == target){
                    result[0] = 0;
                    result[1] = 0;
                }
                return result;
            }

            int left = 0, right = nums.length - 1;
            int mid = 0;
            boolean findFirstTarget = false;
            while (left <= right){
                mid = (left + right) / 2;
                if (nums[mid] < target){
                    left = mid + 1;
                }else if (nums[mid] > target){
                    right = mid - 1;
                }else {
                    findFirstTarget = true;
                    break;
                }
            }

            int left1 = left, right1 = mid;
            int left2 = mid, right2 = right;
            int mid1 = 0, mid2 = 0;
            if (findFirstTarget){
                while (left1 <= right1){
                    mid1 = (left1 + right1) / 2;
                    if (nums[mid1] < target){
                        left1 = mid1 + 1;
                    }else{
                        if (mid1 == 0 || (mid1 > 0 && nums[mid1 - 1] != target)){
                            result[0] = mid1;
                            break;
                        }
                        right1 = mid1 - 1;
                    }
                }
                while (left2 <= right2){
                    mid2 = (left2 + right2) / 2;
                    if (nums[mid2] > target){
                        right2 = mid2 - 1;
                    }else{
                        if (mid2 == nums.length - 1 || (mid2 < nums.length - 1 && nums[mid2 + 1] != target)){
                            result[1] = mid2;
                            break;
                        }
                        left2 = mid2 + 1; //防止死循环，比如nums为[2，2],target为2的时候，如果只令left2 = mid2，则会出现死循环
                    }
                }
            }
            return result;
        }
    }
}
