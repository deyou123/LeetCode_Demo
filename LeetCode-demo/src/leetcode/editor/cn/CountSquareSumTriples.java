package leetcode.editor.cn;

/**
一个 平方和三元组 (a,b,c) 指的是满足 a² + b² = c² 的 整数 三元组 a，b 和 c 。

 给你一个整数 n ，请你返回满足 1 <= a, b, c <= n 的 平方和三元组 的数目。



 示例 1：

 输入：n = 5
输出：2
解释：平方和三元组为 (3,4,5) 和 (4,3,5) 。


 示例 2：

 输入：n = 10
输出：4
解释：平方和三元组为 (3,4,5)，(4,3,5)，(6,8,10) 和 (8,6,10) 。




 提示：


 1 <= n <= 250

 Related Topics 数学 枚举 👍 6 👎 0

*/
public class CountSquareSumTriples{
	public static void main(String[] args) {
		Solution solution = new CountSquareSumTriples().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countTriples(int n) {
		int a,b,c, sum, ans=0;
		for (a = 1;  a <= n ; a++) {
			for (b = 1; b <= n ; b++) {
				sum = a * a + b * b;
				for ( c = Math.max(a,b) + 1; c <= n ; c++) {
					if(sum == c * c){
						++ans;
						break;
					}
					if (sum < c * c){
						break;
					}
				}
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
