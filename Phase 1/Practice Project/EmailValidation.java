package Practice_Projects;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
	public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches(); 
	   }

	   public static void main(String[] args) {
	       List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("abc@example.com");
	       emails.add("abcde@example.com");
	       emails.add("abcd@example.me.org");
	       //invalid email addresses
	       emails.add("abcd.example.com");
	       emails.add("abcde..bob@example.com");
	       emails.add("abcj123@.example.com");

	       for (String value : emails) {
	           System.out.println("The Email id " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email id to validate:");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email id " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));    
	   }
}

