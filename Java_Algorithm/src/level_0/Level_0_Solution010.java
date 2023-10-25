package level_0;

// 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

// my_string	k	result
// "string"	    3	"stringstringstring"
// "love"	   10	"lovelovelovelovelovelovelovelovelovelove"

public class Level_0_Solution010 {

	public static void main(String[] args) {
		
		System.out.println(Solution010.solution("love",10));

	}

}


class Solution010 {
	public static String solution(String my_string, int k) {
		
//		String str = my_string;
//		
//		for(int i=0; i<k-1; i++) {
//			str += my_string;
//		}
//		
//		String answer = str;
//		return answer;
		
		
		 return my_string.repeat(k);  //2번 방법 
	}
}