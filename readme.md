# LeetCode
Some LeetCode exercises written in Java.

# 提交记录 
| 题目                           | 思路                                       | 完成时间   |
| :----------------------------- | :----------------------------------------- | :--------- |
| 121_买卖股票的最佳时机 |  动态规划 | 2019-05-22 |
| 167_两数之和Ⅱ_输入有序数组 |  普通双指针 | 2019-05-22 |
| 169_求众数 |  **多解法** | 2019-05-22 |
| 189_旋转数组 |  一是翻转法，前后各翻转一次，整体再翻转一次，需要靠记；二是直接双重循环暴力后移 | 2019-05-22 |
| 217_存在重复元素 |  多种解法，排序后再比较的做法时间复杂度比set要好 | 2019-05-22 |
| 219_存在重复元素Ⅱ |  map记录每个数上一次出现的位置，与这次的位置相减比较 | 2019-05-22 |
| 268_缺失数字 |  方法很多，最简单的是1-n等差数列求和然后减去sum | 2019-05-21 |
| 283_移动零 |  简单双指针 | 2019-05-21 |
| 414_第三大的数 |  细节有点坑 | 2019-05-21 |
| 485_最大连续1的个数 |  顺序遍历即可，末尾为1时要单独考虑 | 2019-05-20 |
| 509_斐波那契数 |  递归/迭代 | 2019-05-20 |
| **532_数组中的K_diff数对** |  类似两数之和，map | 2019-05-20 |
| 561_数组拆分Ⅰ |  简单数学知识 | 2019-05-15 |
| 566_矩阵重塑 |  遍历即可 | 2019-05-15 |
| ***581_最短无序连续子数组** |   | 2019-05-13 |
| 605_种花问题 |  头尾特殊，中间坑比，挺难的 | 2019-05-13 |
| 628_三个数的最大乘积 |  简单数学知识 | 2019-05-13 |
| 643_子数组最大平均数Ⅰ |  滑窗法 | 2019-05-11 |
| **661_图片平滑器** |  读懂题意然后暴力 | 2019-05-11 |
| **665_非递减数列** |  数学问题，判断究竟是减小nums[i]，还是增大nums[ i + 1]，判断的依据是nums[i - 1]和nums[i + 1]的大小关系 | 2019-05-11 |
| 674_最长连续递增序列 |  遍历即可 | 2019-05-11 |
| **697_数组的度** |  用hash表记录每个数字出现的频数以及第一次和最后一次出现的下标；寻找最小值 | 2019-05-09 |
| **717_1比特字符与2比特字符** |  数学知识，遇到0的时候不管是1比特还是2比特，都一定是前一组的结算位置。所以只需要统计最后一个0前面有多少个1即可 | 2019-05-09 |
| 724_寻找数组的中心索引 |  一个指针从左到右移动，分别算出两边的和进行比较 | 2019-05-09 |
| 747_至少是其他数字两倍的最大数 |  调用Arrays.sort排序找最大值/遍历找最大值；后者的方法更快也更省内存 | 2019-05-09 |
| **766_托普利茨矩阵** |  考虑上三角矩阵的每一行第一个数，以及下三角矩阵每一列的第一个数，分别与它们的[i++][j++]比较，有不相等的则为false | 2019-05-08 |
| **830_较大分组的位置** |  从头到尾遍历，用一个变量计数；题目不难，注意点较多 | 2019-05-08 |
| 832_翻转图像 |  直接按题意来即可 | 2019-05-08 |
| **849_到最近的人的最大距离** |  比较第一个1到开头的距离、最后一个1到结尾的距离、中间每两个1之间的距离三者之间的最大值 | 2019-05-07 |
| 867_转置矩阵 |  暴力 | 2019-05-07 |
| 888_公平的糖果交换 |  数学问题，用set存结果即可 | 2019-05-07 |
| 896_单调数列 |  从前往后比较即可，注意边界 | 2019-05-07 |
| 905_按奇偶排序数组 |  头尾双指针，从头遍历遇到奇数就换到后面 | 2019-05-07 |
| **914_卡牌分组** |  hashmap统计每个数字出现的次数，注意理解题意 | 2019-05-07 |
| 922_按奇偶排序数组Ⅱ |  奇偶双指针，如果奇数位为偶数且偶数位为奇数，则交换；否则继续往前 | 2019-05-06 |
| 941_有效的山脉数组 |  循环找到从左到右不再增的位置以及从右到左不再增的位置，比较这两个位置是否一致 | 2019-05-06 |
| 977_有序数组的平方 |  头尾双指针，比较绝对值大小 | 2019-05-06 |

