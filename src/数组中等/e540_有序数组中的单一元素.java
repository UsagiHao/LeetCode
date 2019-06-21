package 数组中等;

public class e540_有序数组中的单一元素 {
    //二分法，既然数组是有序的，那么重复的元素一定相邻。就可以每次取中间的那位或者是它前面的那位，记为m（保证下标是偶数），
    // 如果nums[m] = nums[m + 1], 就代表m左侧全都是成对的相等，即单一元素在右侧
    //否则的话单一元素在左侧
    //继续二分即可
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h) {
            int m = l + (h - l) / 2;
            if(m % 2 == 1) m--; // 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            if(nums[m] == nums[m + 1]) l = m + 2;//注意是+2
            else h = m;
        }
        return nums[l];
    }
}
