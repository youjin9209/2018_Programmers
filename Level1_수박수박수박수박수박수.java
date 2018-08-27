/*
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

n	return
3	수박수
4	수박수박
*/
import java.util.Scanner;

public class Level1_수박수박수박수박수박수 {

	public static String solution(int n) {
	      String answer = "";
	      StringBuilder sb = new StringBuilder();
	      for (int i = 1; i <= n; i++) {
	    	  if (i % 2 != 0) {
	    		  sb.append("수");
	    	  } else {
	    		  sb.append("박");
	    	  }
	      }
	      answer = sb.toString();
	      return answer;
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}
