package level_0;

public class Level_0_Solution15 {

	public static void main(String[] args) {
		
		System.out.println(method001(">","!",41,78));

	}
	
public static int method001 (String ineq, String eq, int n, int m) {
		
		int result = 9;

		if(ineq == ">" && eq == "=") {
			result = n >= m ? 1 : 0;
		} else if(ineq == "<" && eq == "=") {
			result = n <= m ? 1 : 0;
		} else if(ineq == ">" && eq == "!") {
			result = n > m ? 1 : 0;
		} else if(ineq == "<" && eq == "!") {
			result = n < m ? 1 : 0;
		}
	
		return result;
		
		// 프로그래머스에서는 계속 실패하는데 이클립스에서는 기대값이 잘 나온다.. 프로그래머스에서 실수를....??
		
		
//		if (ineq.equals(">")) {
//            if (eq.equals("=")) {
//                    return n >= m ? 1 : 0;
//            } else if (eq.equals("!")) {
//                    return n > m ? 1 : 0;
//            }
//    } else if (ineq.equals("<")) {
//            if (eq.equals("=")) {
//                    return n <= m ? 1 : 0;
//            } else if (eq.equals("!")) {
//                    return n < m ? 1 : 0;
//            }
//    }
//
//    return 0;
		
		// 인터넷에서 찾아본 성공 사례 ... 무엇때문에 내꺼는 안되고 여기는 될까....??? 이클립스에서는 문제없는데....
		
	}


}
