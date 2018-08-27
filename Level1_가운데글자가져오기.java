import java.util.Scanner;

public class Level1_가운데글자가져오기 {
	public static String solution(String s) {
	      String answer = "";
	      int len = s.length();
	      if (len % 2 != 0) {
	    	  answer = s.substring(len/2, len/2 + 1);
	      } else {
	    	  answer = s.substring(len/2 - 1, len/2 + 1);
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}
}
