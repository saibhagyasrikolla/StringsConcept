import java.util.Scanner;

public class SwapFirstLastDigit {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Before Swapping: "+n);
		String s = ""+n;
		String lastDigit = ""+s.charAt(s.length()-1);
		String remaining = s.substring(1,s.length()-1);
		String firstDigit = ""+s.charAt(0);
		String swap = lastDigit+remaining+firstDigit;
		n = Integer.parseInt(swap);
		System.out.println("After Swapping: "+n);
	}

}
