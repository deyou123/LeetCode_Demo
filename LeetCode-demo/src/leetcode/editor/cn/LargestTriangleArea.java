package leetcode.editor.cn;

/**
给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。


示例:
输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
输出: 2
解释:
这五个点如下图所示。组成的橙色三角形是最大的，面积为2。




 注意:


 3 <= points.length <= 50.
 不存在重复的点。
 -50 <= points[i][j] <= 50.
 结果误差值在 10^-6 以内都认为是正确答案。

 Related Topics 几何 数组 数学 👍 83 👎 0

*/
public class LargestTriangleArea{
	public static void main(String[] args) {
		Solution solution = new LargestTriangleArea().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	//使用了叉乘
	public double area(int[]a,int[]b,int[]c){
		return Math.abs( (b[0]-a[0]) * (c[1]-a[1]) - (b[1]-a[1]) * (c[0]-a[0])) / 2.0;
	}
    public double largestTriangleArea(int[][] points) {
		double maxArea = 0d,tempArea;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				for (int k = 0; k < points.length ; k++) {

					 tempArea =area(points[i],points[j],points[k]);
					 maxArea = Math.max(maxArea,tempArea);
				}

			}

		}
		return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
