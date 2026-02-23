class UC2PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "madam";
     System.out.println("Palindrome Checker App - UC2");
     System.out.println("------------------------------");
     System.out.println("Hardcoded string: "  + word);
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("Result: The  string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        System.out.println("\nProgram executed successfully.");
    }
}
