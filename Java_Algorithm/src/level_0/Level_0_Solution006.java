package level_0;

import java.util.Scanner;

// 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

// 입력 : 100

// 출력 : 100 is even

public class Level_0_Solution006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
//        if(n % 2 == 0) {
//            System.out.printf("%d is even", n);
//        } else {
//            System.out.printf("%d is odd", n);
//        }
        
        // 1번 방법 if문 이용해서 출력
        
        
        
        System.out.println(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        
        // 2번 방법 삼항연산자 이용해서 출력
        

	}

}
