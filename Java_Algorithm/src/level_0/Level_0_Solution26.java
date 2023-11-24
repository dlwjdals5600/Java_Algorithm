package level_0;

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.


//입출력 예 #1
//
//첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
//두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
//세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
//따라서 [3, 4, -1]을 return 합니다.


import java.util.Arrays;

public class Level_0_Solution26 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,4,3};
		int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
		
		System.out.println(Solution26.method(arr, queries));

	}

}

class Solution26 {
	public static int[] method(int[] arr, int[][] queries) {
		
		int[] answer = new int[queries.length];
		Arrays.fill(answer, -1);  		// 처음에 배열 전체에 -1값을 초기화
		
		int s;
		int e;
		int k;
		
		for(int i=0; i<queries.length; i++) {
				s = queries[i][0];
				e = queries[i][1];
				k = queries[i][2];
		
		
		int minvalue = Integer.MAX_VALUE; // 최소값 저장할 변수
		
		for(int j=s; j<=e; j++) {	// {0,4,2}={s,e,k}     /  0 ~ 4 까지 반복하고
			if (arr[j] > k && arr[j] < minvalue) {  // k=2 /  2보다 크고 arr배열 원소중에서 가장 작은 값을 찾는다. 
				minvalue = arr[j];					
            }
			
		}
		
		if (minvalue != Integer.MAX_VALUE) {
            answer[i] = minvalue;				// 첫번째 반복문 i 번째에서 최소값이 들어올 때 까지 값이 계속 바뀐다.
        }
	}
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}