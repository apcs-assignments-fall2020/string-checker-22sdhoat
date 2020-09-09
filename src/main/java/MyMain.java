import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int A_B_C = 0;    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a') {    
                A_B_C++;
            }
            else if(str.charAt(i) == 'b') {   
                A_B_C++;     
            }
            else if(str.charAt(i) == 'c') {  
                A_B_C++;    
            }
        }
        return A_B_C;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String THE = "the";
        if (str.toLowerCase().indexOf(THE.toLowerCase()) != -1 ) {
            return true;
        }
        else {
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Str: ");
		String abc = scan.nextLine();
        System.out.println(countABC(abc));
        System.out.print("Str: ");
        String the = scan.nextLine();
        System.out.println(containsThe(the));
        System.out.print("Str: ");
        String opposite = scan.nextLine();
        System.out.println(isPalindrome(opposite));
    }
}
