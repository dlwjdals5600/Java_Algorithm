package level_0;

//정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
//
//"w" : 수에 1을 더한다.
//"s" : 수에 1을 뺀다.
//"d" : 수에 10을 더한다.
//"a" : 수에 10을 뺀다.
//그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
//
//주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.

public class Level_0_Solution24 {

	public static void main(String[] args) {
		
		int[] numLog= {0,1,0,10,0,1,0,10,0,-1,-2,-1};
		
		System.out.println(Solution024.solution(numLog));

	}

}

class Solution024 {
	public static String solution(int[] numLog) {
		
		int start_num = numLog[0];	// numLog의 값을 순차적으로 대입
		int chk_num = numLog[0];	// numLog의 값에 따라 값을 더해줌
		
		StringBuilder answer = new StringBuilder();
		
		for(int i=1; i<numLog.length; i++) {
			start_num = numLog[i];
			
			if(start_num == chk_num + 1) {
				chk_num += 1;
				answer.append("w");
				continue;
			} else if(start_num == chk_num - 1) {
				chk_num -= 1;
				answer.append("s");
				continue;
			} else if(start_num == chk_num + 10) {
				chk_num += 10;
				answer.append("d");
				continue;
			} else if(start_num == chk_num - 10) {
				chk_num -= 10;
				answer.append("a");
				continue;
			}
		}
		
		return answer.toString();
		
		
		
		// 다른 사람
		
//		String answer = "";
//        for(int i=1; i<numLog.length; i++){
//            int j = numLog[i-1] - numLog[i];
//            switch(j){
//                case -1 : answer+='w'; break;
//                case 1 : answer+='s'; break;
//                case -10 : answer+='d'; break;
//                case 10 : answer+='a'; break;
//            }
//        }
//        return answer;
	}
}