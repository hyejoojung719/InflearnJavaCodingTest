import java.util.Scanner;

// 2. ��ҹ��� ��ȯ
public class Ex02 {
	public String solution(String str) {
		String answer = "";
		/*for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}*/
		
		// �ƽ�Ű�ѹ� �빮��(65~90), �ҹ���(96~122), �������̴� 32
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
