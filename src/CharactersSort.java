import java.io.BufferedReader;
import java.io.InputStreamReader;

//To sort all characters in the given string
public class CharactersSort {

	public static void main(String[] args) {
		String s;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try {
			System.out.println("Enter a String: ");
			s = br.readLine();
			char c[] = s.toCharArray();
			
			for(int i=0;i<c.length-1;i++) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]>c[j]) {
						int t = c[i];
						c[i] = c[j];
						c[j] = (char) t;
					}
				}
			}
			for(char a:c) {
				System.out.print(a+" ");
			}
		}
		catch(Exception e){}
	}
}
