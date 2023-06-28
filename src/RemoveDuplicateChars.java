import java.io.BufferedReader;
import java.io.InputStreamReader;

//Removing duplicate characters from a given String
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		try {
			String s, str = "";
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter a String: ");
			s = br.readLine();
			System.out.println("After Removing the duplicated characters...");
			System.out.println("The new String is:");
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(str.indexOf(c)<0) {
					str += c;
				}
			}
			System.out.println(str);
		}catch(Exception e) {}

	}

}
