package Lv0;

public class Solution03 {
	
    public static int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt(a+""+b);
        int d = answer = Integer.parseInt(b+""+a);        
        if(c>=d){
            answer = c;
        } else {
            answer = d;
        }
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		int a = 1;
		int b = 40;
		solution(a, b);
	}

}
