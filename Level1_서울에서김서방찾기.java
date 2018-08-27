public class Level1_서울에서김서방찾기 {
	public String solution(String[] seoul) {
	      String answer = "";
	      int len = seoul.length;
	      int idx = 0;
	      for (int i = 0; i < len; i++) {
	    	  if (seoul[i].equals("Kim")) {
	    		  idx = i;
	    		  break;
	    	  }
	      }
	      answer = "김서방은 " + idx + "에 있다"; 
	      return answer;
	  }
	public static void main(String[] args) {

	}
}
