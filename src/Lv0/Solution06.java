package Lv0;

public class Solution06 {
	
    public static int solution(int number, int n, int m) {
        return number%n==0 & number%m==0 ? 1 : 0;
    }

	public static void main(String[] args) {		
		int number = 10;
		int n = 2;
		int m = 5;
		
		System.out.println("case 1. 둘 다 배수일 때 "+solution(number, n, m));
		
		number = 10;
		n = 3;
		m = 5; 
		
		System.out.println("case 2. 둘 중 하나만 배수일때 "+solution(number, n, m));
		
		number = 10;
		n = 3;
		m = 6; 
		
		System.out.println("case 3. 모두 배수가 아닐 때 "+solution(number, n, m));
	}

}
