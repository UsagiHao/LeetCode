package 数组中等;

public class e11_盛最多水的容器 {
    //法一：暴力
    //法二:前后双指针
    //每一步中，我们会找出指针所指向的两条线段形成的区域，更新 max，并将指向较短线段的指针向较长线段那端移动一步。
    //万一高的指针(j)的下一个是更高的值(n)，那我先移动了低指针(i)会不会错过一些值？：
    //在每一次移动的时候我们可以选择移动高的指针或者矮的指针，但是由于矮的指针已经限制了矩形的高度，从而得出移动高指针时矩形的高度不变并且宽度会缩减，由此移动高指针不会带来面积的上升，所以选择移动矮的指针
/*    class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            for (int i = 0; i < height.length - 1; i++){
                for (int j = i + 1; j < height.length; j++){
                    max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
                }
            }
            return max;
        }
    }*/

    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int max = 0;
            while (left < right){
                max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
                if (height[left] < height[right]){
                    left++;
                }else {
                    right--;
                }
            }
            return max;
        }
    }
}
