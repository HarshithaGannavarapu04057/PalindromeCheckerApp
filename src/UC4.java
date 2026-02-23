import java.util.Scanner;
class UC4PalindromeCheckerApp{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
System.out.println("=== UC4: Character Array Based Palindrome Check ===");
System.out.print("Enter a string: ");
String input = scanner.nextLine();
 input = input.toLowerCase();
 char[] characters = input.toCharArray();
int start = 0;
int end = characters.length - 1;
 boolean isPalindrome = true;
 while (start < end) {
 if (characters[start] != characters[end]) {
isPalindrome = false;
break;
 }
start++;
end--;
}
if (isPalindrome) {
 System.out.println("Result: The given string is a Palindrome.");
 } else {
System.out.println("Result: The given string is NOT a Palindrome.");
 }
  scanner.close();
}
}