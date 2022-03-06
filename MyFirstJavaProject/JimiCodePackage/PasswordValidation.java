package JimiCodePackage;
import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperCount = 0;
		int lowerCount=0;
		int digitCount=0;
		final int NUMBER_LOWER_LETTER = 3;
		final int NUMBER_UPPER_LETTER = 1;
		final int NUMBER_OF_DIGIT = 2;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a password");
        String pwd = in.nextLine();
        int pwdlength = pwd.length();
        
        for (int i = 0; i < pwdlength; i++) {
        	char ch = pwd.charAt(i);
        	if (Character.isUpperCase(ch)) {
        		upperCount++;
        	}
        	if (Character.isLowerCase(ch)) {
        		lowerCount++;
        	}
        	
        	if (Character.isDigit(ch)) {
        		digitCount++;
        	}
        }
        
        if (upperCount >= NUMBER_UPPER_LETTER && lowerCount >= NUMBER_LOWER_LETTER && digitCount >= NUMBER_OF_DIGIT  ) {
        	System.out.println("Valid password");
        }
        else
        {
        if (upperCount < NUMBER_UPPER_LETTER)
        	System.out.println("Upppercase letter");
	}

}
}
