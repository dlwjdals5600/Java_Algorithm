package level_0;

//정수 리스트 num_list가 주어질 때,
//마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
//마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.


import java.util.Arrays;

public class Level_0_Solution22 {
	public static void main(String[] args) {
	
//	int[] intArr = {1,2,3,4,5,6,7,8,9};
	
	int[] intArr = new int[9];
	intArr[0] = 0;
	intArr[1] = 1;
	intArr[2] = 3;
	intArr[3] = 4;
	intArr[4] = 5;
	intArr[5] = 6;
	intArr[6] = 7;
	intArr[7] = 9;
	intArr[8] = 8;
//	intArr[9] = 10;
	
	
	System.out.println(Solution022.solution(intArr));
	
	}
}

class Solution022 {
	public static int[] solution(int[] num_list) {
		
		int[] result = new int[num_list.length+1];
		int length = num_list.length - 1;
		
		for(int i=0; i<num_list.length; i++) {
			result[i] = num_list[i];
		}
		
		if(num_list[length] > num_list[length-1]) {
			result[length+1] = num_list[length] - num_list[length-1];
		} else if(num_list[length] <= num_list[length-1]) {
			result[length+1] = (num_list[length] * 2);
		}
		
		System.out.println(Arrays.toString(result));
		
		return result;
		
		
		
		// 다른 사람
		
//		int[] answer = new int[num_list.length+1];
//
//        for(int i = 0; i < num_list.length; i++) {
//            answer[i] = num_list[i];
//        }
//
//        int last = num_list[num_list.length-1];
//        int before = num_list[num_list.length-2];
//
//        answer[answer.length-1] = last > before ? last - before : last*2;
//
//        return answer;
		
		// 코드가 한 눈에 보기 쉬운거 같다...
		
	}
}