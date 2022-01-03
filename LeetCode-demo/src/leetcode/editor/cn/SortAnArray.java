package leetcode.editor.cn;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
给你一个整数数组 nums，请你将该数组升序排列。






 示例 1：

 输入：nums = [5,2,3,1]
输出：[1,2,3,5]


 示例 2：

 输入：nums = [5,1,1,2,0,0]
输出：[0,0,1,1,2,5]




 提示：


 1 <= nums.length <= 50000
 -50000 <= nums[i] <= 50000

 Related Topics 数组 分治 桶排序 计数排序 基数排序 排序 堆（优先队列） 归并排序 👍 390 👎 0

*/
public class SortAnArray{
	public static void main(String[] args) {
		Solution solution = new SortAnArray().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArray(int[] nums) {
		int[] ints = Arrays.stream(nums).sorted().toArray();
		return ints;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
