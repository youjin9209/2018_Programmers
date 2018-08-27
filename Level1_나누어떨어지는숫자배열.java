import java.util.Arrays;
import java.util.Scanner;

public class Level1_나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      int len = arr.length;
	      int cnt = 0;
	      for (int i = 0; i < len; i++) {
	    	  if (arr[i] % divisor == 0)
	    		  cnt++;
	      }
	      answer = new int[cnt];
	      int idx = 0;
	      for (int i = 0; i < len; i++) {
	    	  if (arr[i] % divisor == 0)
	    		  answer[idx++] = arr[i];
	      }
	      if (cnt == 0) {
	    	  answer = new int[]{-1};
	      }
	      Arrays.sort(answer);
	      return answer;
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{3, 2, 6};
		int div = sc.nextInt();
		solution(arr, div);
		
	}
}
