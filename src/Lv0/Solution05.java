package Lv0;

public class Solution05 {
	
    public static int solution(int num, int n) {
        return num%n==0 ? 1 : 0;
    }

	public static void main(String[] args) {
		int num = 9;
		int n = 3;
		System.out.println("배수 일 때 "+solution(num, n));
		
		num = 4;
		n = 3;
		System.out.println("배수가 아닐 때 "+solution(num, n));		
	}

}
