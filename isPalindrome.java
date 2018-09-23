package Palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    
    public static void main(String[] args) {        
        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("Is this a palindrome? %s", isPalindrome(inputString));
    }
    
    public static boolean isPalindrome(String word) {
        Stack immutable = new Stack();
        Stack stackIn = new Stack();
        Stack stackOut = new Stack();
        String newWord = word.toLowerCase();
        
        //push letters into a stack
        for(int x = 0; x < word.length(); x++){
            stackIn.push(newWord.charAt(x));
            immutable.push(newWord.charAt(x));
        }
        System.out.println("Input: " + stackIn.toString());

        //pop the letters out into the new stack
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        System.out.println("Reversed: " + stackOut.toString());
        //compare stacks
       if(stackOut.equals(immutable)) {
           return true;
       }
       else
        return false;
    }
}
