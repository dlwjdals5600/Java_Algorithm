package level_0;

//정수 number와 n, m이 주어집니다.
//number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

public class Level_0_Solution13 {

	public static void main(String[] args) {
		
		System.out.println(Solution013.solution(60,2,3));
		

	}

}

class Solution013 {
	public static int solution(int number, int n, int m) {
		
		int answer = number % n == 0 && number % m == 0   ? 1 : 0;
		
		 return answer;
	}
}