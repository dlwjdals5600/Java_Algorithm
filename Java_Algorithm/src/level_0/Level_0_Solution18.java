package level_0;

public class Level_0_Solution18 {

	public static void main(String[] args) {
		
		boolean[] bool = new boolean[5];
		bool[0] = true;
		bool[1] = false;
		bool[2] = false;
		bool[3] = true;
		bool[4] = true;
		
		
		System.out.println(Solution018.solution(3,4,bool));
	}

}

class Solution018 {
	public static int solution(int a, int d, boolean[] included) {
		
		int current = a;
		int result = 0;
		
		for(int i = 0; i<included.length; i++) {
			if(i == 0) {
				result += included[i] == true ? current : 0;
			} else {
				current += d;
				result += included[i] == true ? current : 0;
			}
			
		}
		return result;
		
		
		// 다른 사람 방식
		
//		int answer = 0;
//		for(int i = 0; i < included.length; i++)
//			if(included[i] == true)
//				answer += a + i * d;
//		return answer;
		
	}
}