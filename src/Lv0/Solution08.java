package Lv0;

public class Solution08 {
	
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("=")){
            if(ineq.equals(">")){
                answer = n >= m ? 1 : 0;
            } else {
                answer = n <= m ? 1 : 0;
            }
        } else {
            if(ineq.equals(">")){
                answer = n > m ? 1 : 0;
            } else {
                answer = n < m ? 1 : 0;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		System.out.println("case 1. "+solution(ineq, eq, n, m));
		ineq = ">";
		eq = "!";
		n = 41;
		m = 78;
		System.out.println("case 1. "+solution(ineq, eq, n, m));
	}

}
