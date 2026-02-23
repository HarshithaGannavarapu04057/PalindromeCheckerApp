import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
class UC7PalindromeCheckerApp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("===== Deque-Based Optimized Palindrome Checker =====");
System.out.print("Enter a string: ");
  String input = sc.nextLine();
String processedInput = input.toLowerCase();
Deque<Character> deque = new LinkedList<>();
for (int i = 0; i < processedInput.length(); i++) {
 deque.addLast(processedInput.charAt(i));
}
boolean isPalindrome = true;
while (deque.size() > 1) {
char front = deque.removeFirst();
char rear = deque.removeLast();
if (front != rear) {
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
