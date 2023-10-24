package patttern;

import java.util.Scanner;

public class RomanNumberToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String roman=sc.next();
        int ans = romanToNumberConverter(roman.toUpperCase());
        if(ans == -1)
            System.out.println("Invalid Roman Number Please check & Retry");
        else
            System.out.println("After Roman Number Converted to Number : "+ans);

    }
    public static int romanToNumberConverter(String roman){
        int n=roman.length();
        int res=0;
        for (int i = 0; i < n; i++) {
            int numFirst = romanToNumber(roman.charAt(i));
                    if(numFirst == -1) return -1;
            if(i + 1 < n){
                int numSecond = romanToNumber(roman.charAt(i + 1));
                    if(numSecond == -1) return -1;
                if(numFirst >= numSecond)
                    res += numFirst;
                else{
                    res += numSecond - numFirst;
                    i++;
                }
            }else{
                res += numFirst;
            }
        }
        return  res;
    }
    public static int romanToNumber(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return -1;
        }
    }
}
