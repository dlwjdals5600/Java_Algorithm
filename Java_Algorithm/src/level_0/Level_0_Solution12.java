package level_0;

//정수 num과 n이 매개 변수로 주어질 때
//num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

public class Level_0_Solution12 {

	public static void main(String[] args) {
		
		System.out.println(Solution012.solution(98,2));

	}

}


class Solution012 {
	public static int solution(int num, int n) {
		
		int answer = num % n == 0 ? 1 : 0;
		
		 return answer;
	}
}