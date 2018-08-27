/*
문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
*/
import java.util.Scanner;

public class Level1_문자열다루기기본 {
	public static boolean solution(String s) {
	      boolean answer = true;
	      int len = s.length();
	      if (!(len == 4 || len == 6)) {
	    	  answer = false;
	      	  return answer;
	      }
	      for (int i = 0; i < len; i++) {
	    	  if (Character.isLetter(s.charAt(i))) {
	    		  answer = false;
	    		  break;
	    	  }
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}
}
