import java.util.ArrayList;
import java.util.Scanner;

// 4. �ܾ� ������
public class Ex04 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		
		/*for(String x : str){
			// StringBuilder ���� ����? String������ �ڲ� ���ٺ��� ���ſ�����..
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/
		
		// ���� �Ͽ� �ٲ���Ҽ��� �����Ƿ�
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
			String tmp=String.valueOf(s); // ���ڹ迭�� Stringȭ ��Ű��
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
			str[i]=kb.next(); // String �迭�� �Է¹��� �ܾ�� �ֱ�
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}
