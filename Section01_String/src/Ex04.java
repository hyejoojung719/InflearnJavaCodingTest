import java.util.ArrayList;
import java.util.Scanner;

// 4. 단어 뒤집기
public class Ex04 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		
		/*for(String x : str){
			// StringBuilder 쓰는 이유? String연산을 자꾸 쓰다보면 무거워져서..
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/
		
		// 조건 하에 바꿔야할수도 있으므로
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s); // 문자배열을 String화 시키기
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Ex04 T = new Ex04();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next(); // String 배열에 입력받은 단어들 넣기
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}
