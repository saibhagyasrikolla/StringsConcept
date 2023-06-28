import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//To find no.of words in a given String
public class NumOfWOrds {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String: ");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader bs = new BufferedReader(i);
		String s = bs.readLine();
		String[] words = s.split(" ");
		int wordCount = 0;
		/*System.out.println("The Words in a given String are: ");
		for(String a:words) {
			System.out.println(a);
		}*/
		for(int n=0;n<words.length;n++) {
			wordCount +=1;
		}
		System.out.println("The no.of words in a given String is: "+wordCount);
	}
}
