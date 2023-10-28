package level_0;

//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
//		n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

public class Level_0_Solution14 {

	public static void main(String[] args) {
		
		System.out.println(method001(10));

	}
	
	public static int method001 (int n) {
		
		int result = 0;
		
		if(n % 2 != 0) {
			for(int i = 1; i<n+1; i+=2) {
				result += i;
			} 
		} else {
			for(int i = 2; i<n+2; i+=2) {
				result += i * i;
			}
		}
		return result;
		
		
		
		
//		int answer = 0;
//
//        for(int i = n; i >= 0; i -= 2)
//            answer += (n % 2 == 0) ? i * i : i;
//
//    	return answer;
		
		// for문 안에 삼항연산자 사용
	}

}
