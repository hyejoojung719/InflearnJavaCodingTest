import java.util.*;

// 1. 문자 찾기
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
			// 뒤에 string안되고 배열만 올 수 있어서 toCharArray 필요
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01 T = new Ex01();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); // 문자열 
		char c = kb.next().charAt(0); // 문자 한개 가져오기
		
		System.out.print(T.solution(str, c));
	}
}
