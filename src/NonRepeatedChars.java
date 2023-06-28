import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NonRepeatedChars {
	//To find the non-repeated characters in the given string
	public static void main(String[] args) {
		try {
			String s;
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter a String: ");
			s = br.readLine();
			
			int[] charCount = new int[256];
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				charCount[ch]++;
			}
			System.out.println("The Non repeated charaters in "+s+": ");
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(charCount[i] == 1) {
					System.out.print(c+" ");
				}
			}
		}
		catch(Exception e) {}
	}

}
