package level_0;

import java.util.Scanner;



// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로
// 변환해서 출력하는 코드를 작성해 보세요.

// 입력 : aBcDeFg

// 출력 : AbCdEfG

public class Level_0_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String anwer = "";
		

		//for문 사용 
//		for(int i = 0; i < a.length(); i++) {
//			char b = a.charAt(i);
//			if(Character.isUpperCase(b)) {
//				anwer += Character.toLowerCase(b);
//			} else {
//				anwer += Character.toUpperCase(b);
//			}
//		}
		
		// for each문 사용 
		for(Character c : a.toCharArray()) {
			if(Character.isUpperCase(c)) {
				anwer += Character.toLowerCase(c);
			} else {
				anwer += Character.toUpperCase(c);
			}
		}
		
		System.out.println(anwer);
		
		

	}

}
