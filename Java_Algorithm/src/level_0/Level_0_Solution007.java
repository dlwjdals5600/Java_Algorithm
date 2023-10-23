package level_0;

// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을
// return 하는 solution 함수를 작성해 주세요.

//제한사항
// my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
// 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
// 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이

// 입출력 예

// my_string			overwrite_string	result
// "He11oWor1d"			"lloWorl"			"HelloWorld"
// "Program29b8UYP"		"merS123"			"ProgrammerS123"

public class Level_0_Solution007 {

	public static void main(String[] args) {
		
		String a = Solution007.solution("He11oWro1d","lloWorl",2);
		//String a = Solution007.solution("Program29b8UYP","merS123",7);
		
		System.out.println(a);

	}

}

class Solution007 {
	public static String solution(String my_string, String overwrite_string, int s) {
		
		String before = my_string.substring(0, s);
		String after = my_string.substring(s + overwrite_string.length());
		
		String answer = before + overwrite_string + after;
		return answer;
		
	}
}
