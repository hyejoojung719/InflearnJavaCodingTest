import java.util.Scanner;

// 3. ����� �ܾ�
public class Ex03 {
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE;
		int pos;
		/*
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m=len;
				answer = x;
			}
		}*/
		
		while((pos = str.indexOf(' '))!=-1)// ���⸦ �߰� ���ϸ� -1 return
		{
			String tmp = str.substring(0, pos); // 0���� pos������ �ڸ�
			int len = tmp.length();
			if(len > m) { // ���� ���̰� ������ �������ϰ�� ���� �ܾ ����ؾ��ϴϱ� >= ���� �ȵ�
				m=len;
				answer = tmp;
			}
			str = str.substring(pos+1); // ���� ���ĺ��ʹϱ� +1
		}
		if(str.length()>m) answer = str; // ������ �ܾ� ������ ����
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03 T = new Ex03();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine(); // �� ���� �Է� �޾ƾ��ϹǷ� nextLine
		
		System.out.print(T.solution(str));
	}
}
