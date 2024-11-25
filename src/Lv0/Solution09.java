package Lv0;

public class Solution09 {
	
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a - b;
        return answer;
    }

	public static void main(String[] args) {
		boolean flag = true;
		int a = -4;
		int b = 7;
		System.out.println("True : " +solution(a, b, flag));
		
		flag = false;
		System.out.println("false : " +solution(a, b, flag));

	}

}
