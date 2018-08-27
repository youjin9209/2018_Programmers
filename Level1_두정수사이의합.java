import java.util.Scanner;

public class Level1_두정수사이의합 {
	public static long solution(int a, int b) {
	      long answer = 0;
	      int max = (a > b) ? a : b;
	      int min = (a < b) ? a : b;
	      for (int i = min; i <= max; i++) {
	    	  answer += i;
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solution(a, b));
	}
}
