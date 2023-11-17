package level_0;

public class Level_0_Solution16 {

	public static void main(String[] args) {
		
		System.out.println(Solution016.solution(-4,7,true));
	}

}

class Solution016 {
	public static int solution(int a, int b, boolean flag) {
		
		if(flag == true) {
			return a+b;
		} else {
			return a-b;
		}
		
		// return flag ? a + b : a - b;

	}
}