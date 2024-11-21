package Lv0;

public class Solution02 {
	 public static String solution(String my_string, int k) {
	        String answer = "";
	        for(int i=0; i<k; i++){
	            answer += my_string;
	        }
	        System.out.println(answer);
	        return answer;
	    }
	 
	public static void main(String[] args) {
		String my_string = "love";
		int k = 10;
		solution(my_string, k);
	}

}
