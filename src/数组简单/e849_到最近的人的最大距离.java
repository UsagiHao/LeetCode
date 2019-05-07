package 数组简单;

public class e849_到最近的人的最大距离 {
//比较第一个1到开头的距离、最后一个1到结尾的距离、中间每两个1之间的距离三者之间的最大值
    //注意中间每两个1之间平均距离的求法，有点坑
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int left = 0;
            int right = seats.length - 1;
            while (seats[left] != 1){
                left++;
            }
            while (seats[right] != 1) {
                right--;
            }

            int result = Math.max(left, seats.length - 1 - right);

            while (left < right){
                int length = 0;
                while (seats[left] == 0){
                    length++;
                    left++;
                }
                result = Math.max(result, (length + 1) / 2);
                left++;
            }
            return result;
        }
    }
}
