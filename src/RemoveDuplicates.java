import java.io.BufferedReader;
import java.io.InputStreamReader;

//Removing duplicate characters from a given String
public class RemoveDuplicates {

	public static void main(String[] args) {
		try {
			String s;
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter a String: ");
			s = br.readLine();
			
			char c[] = s.toCharArray();
			int n = c.length;
			String str = "";
			for(int i=0;i<n;i++) {
				int j;
				for(j=0;j<i;j++) {
					if(c[i]==c[j]) {
						break;
					}
				}
				if(j==i) {
					str += c[i];
				}
			}
			System.out.print(str);
		}
		catch(Exception e) {}
	}

}
