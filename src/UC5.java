import java.util.Scanner;
import java.util.Stack;
class UC5PalindromeCheckerApp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("===== Stack-Based Palindrome Checker =====");
System.out.print("Enter a string: ");
String input = sc.nextLine();
String processedInput = input.toLowerCase();
Stack<Character> stack = new Stack<>();
 for (int i = 0; i < processedInput.length(); i++) {
 stack.push(processedInput.charAt(i));
}
 boolean isPalindrome = true;
for (int i = 0; i < processedInput.length(); i++) {
 char poppedChar = stack.pop();
if (processedInput.charAt(i) != poppedChar) {
isPalindrome = false;
break;
}
}
if (isPalindrome) {
System.out.println("Result: The given string is a Palindrome.");
 } else {
 System.out.println("Result: The given string is NOT a Palindrome.");
}
sc.close();
 }
}