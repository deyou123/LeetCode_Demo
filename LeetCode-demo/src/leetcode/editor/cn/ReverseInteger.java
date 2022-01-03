package leetcode.editor.cn;

/**
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。
假设环境不允许存储 64 位整数（有符号或无符号）。



 示例 1：


输入：x = 123
输出：321


 示例 2：


输入：x = -123
输出：-321


 示例 3：


输入：x = 120
输出：21


 示例 4：


输入：x = 0
输出：0




 提示：


 -2³¹ <= x <= 2³¹ - 1

 Related Topics 数学 👍 3148 👎 0

*/
public class ReverseInteger{
	public static void main(String[] args) {
		Solution solution = new ReverseInteger().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
		if(x == 0 || x == Integer.MIN_VALUE ){
			return 0;
		}
		//符号判断。默认为1
		int flag = 1;
		//将负数转化为正数计算
		if(x< 0){
			flag = -1;
			/*如果x = 整型数据最小值，求绝对值后超过整型数据最大值。
			所以在前面进行删选排除x == 最小值。*/
			x = Math.abs(x);
		}
		//考虑到反转后会有溢出情况，使用Long 存储反转后的数据。
		Long ans = 0L;
		while (x !=0){
			ans = ans * 10 + x % 10;
			x = x/10;
			//数据溢出判断
			if(ans > Integer.MAX_VALUE){
				ans = 0L;
				break;
			}
		}
		return ans.intValue() * flag;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
