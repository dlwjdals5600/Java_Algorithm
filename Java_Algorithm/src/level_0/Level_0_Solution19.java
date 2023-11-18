package level_0;

public class Level_0_Solution19 {
	public static void main(String[] args) {
		
		System.out.println(Solution019.solution(4,4,4));
		
	}
}


class Solution019 {
	public static int solution(int a, int b, int c) {
		
		int result = 0;
		
		if(a == b && a == c && b == c) {
			result = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
		}else if(a != b && a != c && b != c) {
			result = (a + b + c);
		}else {
			result = (a + b + c) * (a*a + b*b + c*c);
		}
		
		return result;
		
		
		// 다른 사람
		
//		int answer = 1;
//
//        int count = 1;
//        if(a == b || a == c || b == c) {
//            count++;
//        }
//
//        if(a == b && b == c) {
//            count++;
//        }
//
//        for(int i = 1; i <= count; i++) {
//            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
//        }
//
//        return answer;
//    }
//
//    private int pow(int a, int b) {
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
		
		// 재귀를 이용 첫번째 : a * 1
		// 			두번째 : a * a * 1
		//			세번째 : a * a * a * 1
		// 와~ 완전 똑똑하네 ㅋㅋ
		
	}
}