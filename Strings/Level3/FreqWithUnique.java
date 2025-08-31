package Strings.Level3;

import java.util.Scanner;

public class FreqWithUnique {
    static char[] uniqueChars(String s){
        String res="";
        for(int i=0;i<s.length();i++)
            if(res.indexOf(s.charAt(i))==-1) res+=s.charAt(i);
        return res.toCharArray();
    }

    static void frequency(String s){
        char[] u=uniqueChars(s);
        for(char c:u){
            int count=0;
            for(int i=0;i<s.length();i++) if(s.charAt(i)==c) count++;
            System.out.println(c+" : "+count);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        frequency(s);
    }
}
