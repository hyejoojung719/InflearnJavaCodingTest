import java.util.*;

// 1. ���� ã��
public class Ex01 {
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		}*/
		
		for(char x : str.toCharArray()) {
			// �ڿ� string�ȵǰ� �迭�� �� �� �־ toCharArray �ʿ�
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01 T = new Ex01();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); // ���ڿ� 
		char c = kb.next().charAt(0); // ���� �Ѱ� ��������
		
		System.out.print(T.solution(str, c));
	}
}
