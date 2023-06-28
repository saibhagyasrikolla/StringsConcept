import java.util.Scanner;

//To check whether the given string is palindrome or not
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String str = "";
		for(int i=(s.length()-1);i>=0;i--) {
			str = str+s.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println(s+" == "+str);
			System.out.println("Hence "+s+" is a Palindrome");
		}
		else {
			System.out.println(s+" != "+str);
			System.out.println("Hence "+s+" is not a Palindrome");
		}
	}

}
