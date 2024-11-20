package Lv0;

public class Solution01 {
	
	public static String solution(String[] arr) {
        String answer = ""; 
        String arrText = "";
        int i;
        
        for(i=1; i <= arr.length; i++){
            arrText = arr[i-1];
            answer = answer.concat(arrText);
        }
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		solution(arr);
	}

}
