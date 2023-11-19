package level_0;

public class Level_0_Solution20 {

	public static void main(String[] args) {
		
//		int[] intArr = new int[5];
		
//		intArr[0] = 3;
//		intArr[1] = 4;
//		intArr[2] = 5;
//		intArr[3] = 2;
//		intArr[4] = 1;
		
		int[] intArr = {5,7,8,3};
		
		
		System.out.println(Solution020.solution(intArr));
		
	}

}

class Solution020 {
	public static int solution(int[] num_list) {
		
		int square = 0;		//원소들의 합의 제곱
		int multipl = 1;	//원소들의 곱
				
		for(int a : num_list) {
			square += a;
			multipl *= a;
		}
		
		int result = multipl < (square * square) ? 1 : 0;
		
		return result;
	}
}