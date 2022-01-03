package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;

/**
给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。



 示例 1：


输入：nums = [1,2,0]
输出：3


 示例 2：


输入：nums = [3,4,-1,1]
输出：2


 示例 3：


输入：nums = [7,8,9,11,12]
输出：1




 提示：


 1 <= nums.length <= 5 * 10⁵
 -2³¹ <= nums[i] <= 2³¹ - 1

 Related Topics 数组 哈希表 👍 1225 👎 0

*/
public class FirstMissingPositive{
	public static void main(String[] args) {
		Solution solution = new FirstMissingPositive().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {

		for (int i = 0; i < nums.length;) {
			int val = nums[i];
			if(val > 0 && val <=nums.length && val!=i+1&&nums[val-1] != val ){
				swap(nums,i,val-1);
			}
			else{
				i++;
			}

		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i+1){
				return i+1;
			}
		}
		return nums.length+1;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
