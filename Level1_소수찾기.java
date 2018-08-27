import java.util.Scanner;

public class Level1_소수찾기 {
	public static int solution(int n) {
	      int answer = 0;
	      for (int i = 2; i <= n; i++) {
	    	  boolean flag = true;
	    	  for (int j = 2; j*j <= i; j++) {
	    		  if (i % j == 0) {
	    			  flag = false;
	    			  break;
	    		  }
	    	  }
	    	  if (flag) answer++;
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}
