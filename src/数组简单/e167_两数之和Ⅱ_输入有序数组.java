package 数组简单;

public class e167_两数之和Ⅱ_输入有序数组 {

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;
            int sum = 0;
            while (left < right){
                sum = numbers[left] + numbers[right];
                if (numbers[left] + numbers[right] == target){
                    break;
                }else if (sum > target){
                    right--;
                }else {
                    left++;
                }
            }
            return new int[] {left + 1, right + 1};
        }
    }
}
