package level_0;

import java.util.Arrays;

// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

// 제한사항 : 1 ≤ str1의 길이 = str2의 길이 ≤ 10, str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.

public class Level_0_Solution008 {

	public static void main(String[] args) {
		
		System.out.println(Solution008.solution("aaaaa", "bbbbb"));

	}

}

class Solution008 {
	public static String solution(String str1, String str2) {
		
		String[] array_str1 = str1.split("");
		String str = "";
		
		for(int i = 0; i<str2.length(); i++) {
			str += array_str1[i] + str2.charAt(i);
		}
		
		String answer =	str;
		return answer;
		
		
//		String answer = "";
//		
//		for(int i = 0; i < str1.length(); i++) {
//			answer += str1.charAt(i);
//			answer += str2.charAt(i);
//		}
//		
//		return answer;
		
	}
}