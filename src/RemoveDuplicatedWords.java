import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveDuplicatedWords {

	public static void main(String[] args) {
		try {
			String s,s1="";
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter a String: ");
			s = br.readLine();
			String words[] = s.split(" ");
			//int count = 0;
			for(int i=0;i<words.length;i++) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						//count++;
						words[j] = "null";
					}
				}
			}
			//System.out.println(count);
			System.out.println("After Removing the duplicate words...");
			System.out.println("The new String is:");
			for(String word:words) {
				if(word!="null") {
					s1 += word+" ";
				}
			}
			System.out.println(s1);
		}
		catch(Exception e) {
		}
	}

}
