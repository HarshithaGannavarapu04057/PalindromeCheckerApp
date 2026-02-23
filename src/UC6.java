import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
class UC6PalindromeCheckerApp {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("===== Queue + Stack Based Palindrome Checker =====");
System.out.print("Enter a string: ");
 String input = sc.nextLine();
String processedInput = input.toLowerCase();
Stack<Character> stack = new Stack<>();
Queue<Character> queue = new LinkedList<>();
for (int i = 0; i < processedInput.length(); i++) {
char ch = processedInput.charAt(i);
 stack.push(ch);
 queue.add(ch);
 }
boolean isPalindrome = true;
while (!stack.isEmpty() && !queue.isEmpty()) {
char fromStack = stack.pop();
char fromQueue = queue.remove();
if (fromStack != fromQueue) {
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