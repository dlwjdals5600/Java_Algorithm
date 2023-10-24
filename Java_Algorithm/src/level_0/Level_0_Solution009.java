package level_0;

import java.util.Arrays;

// 문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

public class Level_0_Solution009 {

	public static void main(String[] args) {
		
		String[] str = {"a", "b", "c"};
		
		System.out.println(Solution009.solution(str));
	}

}

class Solution009 {
	public static String solution(String[] arr) {
		
		String str = "";
		
		for(String c : arr) {
			str += c;
		}
		
		String answer = str;
		return answer;
		
		
		// String message = String.join("-","Java", "is", "cool");
		// message returned is : "Java-is-cool"
		
//		String answer = String.join("", arr);
//		return answer;
		
		
	}
}
