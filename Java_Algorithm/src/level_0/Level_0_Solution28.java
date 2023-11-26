package level_0;

// 정수 l과 r이 주어졌을 때,
// l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
// 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

// 다시 확인 해보기 / Stream 확인 후에 ********************************


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level_0_Solution28 {

	public static void main(String[] args) {
		
		System.out.println(Solution28.method(5,	555));
		
	}

}


class Solution28 {
	public static int[] method(int l, int r) {
		
		
		List<Integer> list = new ArrayList<>(); 
        int count = 0;
        for(int i = l; i<=r; i++) {
            String str = i + "";
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
                    count ++;
                }
            }
            if(count == str.length()) {
                list.add(i);
            }
            count = 0;
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
       
        System.out.println(Arrays.toString(answer));
       
        return answer;
	}
}
