import java.util.Scanner;

// 3. 문장속 단어
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
		
		while((pos = str.indexOf(' '))!=-1)// 띄어쓰기를 발견 못하면 -1 return
		{
			String tmp = str.substring(0, pos); // 0부터 pos전까지 자름
			int len = tmp.length();
			if(len > m) { // 문장 길이가 같은게 여러개일경우 앞쪽 단어를 출력해야하니까 >= 쓰면 안됨
				m=len;
				answer = tmp;
			}
			str = str.substring(pos+1); // 띄어쓰기 이후부터니까 +1
		}
		if(str.length()>m) answer = str; // 마지막 단어 적용을 위해
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03 T = new Ex03();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine(); // 한 줄을 입력 받아야하므로 nextLine
		
		System.out.print(T.solution(str));
	}
}
