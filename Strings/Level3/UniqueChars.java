package Strings.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueChars {
    static int getLength(String s) {
        int len = 0; 
        try { while(true){ s.charAt(len); len++; } }
        catch(Exception e){ }
        return len;
    }

    static char[] uniqueChars(String s) {
        int n = getLength(s);
        char[] res = new char[n];
        int k = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            boolean found = false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c) found=true;
            if(!found) res[k++]=c;
        }
        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Unique: "+Arrays.toString(uniqueChars(s)));
    }
}
