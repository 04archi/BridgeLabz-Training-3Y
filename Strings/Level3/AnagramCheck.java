package Strings.Level3;

import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] freq=new int[256];
        for(int i=0;i<a.length();i++){ freq[a.charAt(i)]++; freq[b.charAt(i)]--; }
        for(int f:freq) if(f!=0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(), b=sc.nextLine();
        System.out.println("Anagram? "+isAnagram(a,b));
    }
}
