import java.util.Scanner;

// 2. 대소문자 변환
public class Ex02 {
	public String solution(String str) {
		String answer = "";
		/*for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}*/
		
		// 아스키넘버 대문자(65~90), 소문자(96~122), 둘의차이는 32
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) answer+=(char)(x-32);
			else answer+=(char)(x+32);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex02 T = new Ex02();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); 
		
		System.out.print(T.solution(str));
	}
}
