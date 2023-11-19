package level_0;

// 문제 설명
// 정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.


public class Level_0_Solution21 {

	public static void main(String[] args) {
		
		int[] intArr = {3,4,5,2,1};
		
		System.out.println(Solution021.solution(intArr));

	}

}

class Solution021 {
	public static int solution(int[] num_list) {
		
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		
		for(int a : num_list) {
			if(a % 2 == 0) {
				even.append(Integer.toString(a));
			} else {
				odd.append(Integer.toString(a));
			}
		}
		
		int result = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
		
		return result;
		
		
		// 다른 사람
		
//		int answer = 0;
//
//        int even = 0;
//        int odd = 0;
//
//        for(int num : num_list) {
//            if(num % 2 == 0) {
//                even *= 10;
//                even += num;
//            } else {
//                odd *= 10;
//                odd += num;
//            }
//        }
//        answer = even + odd;
//
//        return answer;
		
		
		// 다른사람
		
//		int answer = 0;
//        String even = "";
//        String odd= "";
//        for(int i : num_list) {
//            if(i%2==0) even += i + "";
//            else odd += i + "";
//        }
//        answer = Integer.parseInt(even) + Integer.parseInt(odd);
//        return answer;
		
	}
}