package leetcode.editor.cn;

import java.util.*;

/**
给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

 示例 1:


输入:
"tree"

输出:
"eert"

解释:
'e'出现两次，'r'和't'都只出现一次。
因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。


 示例 2:


输入:
"cccaaa"

输出:
"cccaaa"

解释:
'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
注意"cacaca"是不正确的，因为相同的字母必须放在一起。


 示例 3:


输入:
"Aabb"

输出:
"bbAa"

解释:
此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
注意'A'和'a'被认为是两种不同的字符。

 Related Topics 哈希表 字符串 桶排序 计数 排序 堆（优先队列） 👍 341 👎 0

*/
public class SortCharactersByFrequency{
	public static void main(String[] args) {
		Solution solution = new SortCharactersByFrequency().new Solution();

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String frequencySort(String s) {
		//键存放字符，val 存放字符出现次数
		Map<Character,Integer> map = new HashMap<>();
		int length = s.length();
		for (int i = 0; i < length ; i++) {
			char c = s.charAt(i);
			//统计词频,默认为0，存在该字符,词频加1
			int frequency = map.getOrDefault(c,0)+1;
			//重新存入map 中
			map.put(c,frequency);
		}
		//将map keys 存入set 集合中
		Set<Character> characters = map.keySet();
		//将集合转为list 集合
		List<Character> list = new ArrayList<>(map.keySet());
		//对集合进行排序
		Collections.sort(list,(a,b)->map.get(b) -map.get(a));
		//新建一个空字符串，用来存放排完序后的字符
		StringBuilder sb = new StringBuilder();
		//list 的大小
		int size = list.size();
		for (int i = 0; i < size ; i++) {
			//获取字符
			char c = list.get(i);
			//找到该字符出现次数
			Integer frequency = map.get(c);
			//遍历存入sb
			for (int j = 0; j < frequency; j++) {
				sb.append(c);
			}
		}
		//转成String 类型输出。
		return sb.toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
