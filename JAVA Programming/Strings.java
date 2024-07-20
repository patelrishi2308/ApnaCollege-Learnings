import java.util.*;

public class Strings {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        System.out.println(name.length()); //String length

        String firstName = "Rishi";
        String lastName = "Patel";
        String fullName = firstName + " " + lastName;  //Concatenation
        System.out.println(fullName);

        printLetters(fullName);

        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);

            System.out.println(sb);
        }
    }
}