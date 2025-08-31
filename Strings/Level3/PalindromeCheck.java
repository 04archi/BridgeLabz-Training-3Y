package Strings.Level3;

import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPal1(String s){
        int i=0,j=s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }

    static boolean isPal2(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPal2(s,i+1,j-1);
    }

    static boolean isPal3(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--) rev+=s.charAt(i);
        return s.equals(rev);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Logic1: "+isPal1(s));
        System.out.println("Logic2: "+isPal2(s,0,s.length()-1));
        System.out.println("Logic3: "+isPal3(s));
    }
}
