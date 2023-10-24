package patttern;

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s=sc.nextLine();
        boolean ans=pangram(s.toLowerCase());
        if(ans)
            System.out.println("your Sentence is a Pangram");
        else
            System.out.println("your Sentence is not a Pangram");
    }

    private static boolean pangram(String s) {
        int[] freq = new int[26];
        for(int i=0; i < s.length(); i++){
            int c=s.charAt(i);
            if(c==' ')
                continue;
            freq[c-'a']++;
        }
        for(int e : freq){
            if(e<1) return false;
        }
        return true;
    }
}
