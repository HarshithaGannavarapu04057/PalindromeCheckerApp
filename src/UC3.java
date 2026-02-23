import java.util.Scanner;
class UC3PalindromeCheckerApp{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("=== UC3: Palindrome Check Using String Reverse ===");
System.out.print("Enter a string: ");
String original = scanner.nextLine();
original = original.toLowerCase();
String reversed = "";
for (int i = original.length() - 1; i >= 0; i--) {
reversed = reversed + original.charAt(i);
}
 if (original.equals(reversed)) {
System.out.println("Result: The given string is a Palindrome.");
 } else {
 System.out.println("Result: The given string is NOT a Palindrome.");
}
 scanner.close();
    }
}