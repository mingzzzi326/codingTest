package Lv0;

public class Solution07 {
	
    public static int solution(int n) {
        int answer = 0;
        int i = 0;
        if(n%2==0){
            for(i = 1; i<=n/2; i++){
                answer += (2*i)*(2*i);
            }
        } else {
            for(i = 0; i<=n/2; i++) {
                answer += (2*i+1);
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		//n이 홀수일때
		int n = 9;
		System.out.println("n이 홀수 "+solution(n));
		
		//n이 짝수일때
		n = 10;
		System.out.println("n이 짝수 "+solution(n));
	}

}
