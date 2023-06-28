import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OccurencesOfEachCharacter {
	//To find the no.of occurrences of each character in the given string
	public static void main(String[] args) {
		try {
			String s;
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter a String: ");
			s = br.readLine();
			
			//To count the no of times the character were repeated
			int[] charCount = new int[256];
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				charCount[ch]++;
			}
			for(int i=0;i<charCount.length;i++) {
				if(charCount[i]>0) {
					System.out.println("Character "+(char)i+" occurs "+charCount[i]+" times.");
				}
			}
			//To display the repeated characters
			System.out.println("The duplicate characters in "+s+":");
			for(int i=0;i<charCount.length;i++) {
				if(charCount[i]>1) {
					System.out.println((char)i+" ");
				}
			}
		}
		catch(Exception e) {}
	}

}
