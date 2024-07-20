import java.util.*;

public class pracques_20{

    public static boolean isPalindrom(String palindrome){
        for(int i=0; i<palindrome.length()/2; i++){
            int n = palindrome.length();
            if(palindrome.charAt(i) != palindrome.charAt(n-1-i)){
                return false;
            }
        }    
        return true;    
    }
    public static void main (String args[]){
        // is Palindrome or not
        String palindrome = "racecar";
        System.out.println(isPalindrom(palindrome));
    }
}