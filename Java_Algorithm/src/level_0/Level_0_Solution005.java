package level_0;

import java.util.Scanner;

//문자열 str이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

//입력 : abcde

//출력 : a
//		b
//		c
//		d
//		e


public class Level_0_Solution005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(Character b : a.toCharArray()) {
        	System.out.println(b);
        }
        
        // 1번 방법
        // toCharArray()로 각각의 문자 배열을 만들어서 forEach문으로 반복.
        
        
//        Scanner sc = new Scanner(System.in);		
//        String a = sc.next();
//        
//        for(int i = 0; i < a.length(); i++) {
//        	System.out.println(a.charAt(i));
//        }
        
        // 2번 방법
        // a 변수의 길이 만큼 반복하면서 charAt으로 인덱스를 넣어줘서 문자 출력. length()반환 타입 int
        
        
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        
//        for(String s : a.split("")) {
//        	System.out.println(s);
//        }
        
        // 3번 방법
        // split으로 단어 한개씩 스트링 배열에 담아서 forEach문 이용.

	}

}
