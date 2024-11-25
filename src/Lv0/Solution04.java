package Lv0;

public class Solution04 {
	
    public static int solution(int a, int b) {
    	//Math class 이용
    	int answer = Math.max(Integer.parseInt(a+""+b), 2*a*b);
    	System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		int a = 10;
		int b = 300;
		solution(a,b);
	}

}
