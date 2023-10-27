package level_0;

//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

public class Level_0_Solution011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution011.solution(91,91));

	}

}

class Solution011 {
	public static int solution(int a, int b) {
		
//		int ab_int = Integer.parseInt(a + "" + b);
//		int ba_int = Integer.parseInt(b + "" + a);
//		
//		int compare = Integer.compare(ab_int,ba_int);
//		// ab_int > ba_int 1  / ab_int < ba_int -1  / ab_int = ba_int 0
//		
//		int answer = 0;
//		
//		switch(compare) {
//			case 1 : answer = ab_int;
//			break;
//		
//			case -1 : answer = ba_int;
//			break;
//			
//			case 0 : answer = ab_int;
//			break;
//		}
//		
//		return answer;
		
		// 1번 방법 : case 이용
		
		
		 int answer = 0;
		 int aLong = Integer.parseInt(""+a+b);
		 int bLong = Integer.parseInt(""+b+a);
		 answer = aLong > bLong ? aLong : bLong;
		 return answer;
		 
		 // 2번 방법 : 삼항연산자 이용
		 
		 
		 
		 // return Math.max(Integer.parseInt(a + " + b), Integer.parseInt(b + " + a));
		 
		 // 3번 방법 : Math.max 메서드 이용
		
	}
}