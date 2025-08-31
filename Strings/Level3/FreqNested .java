package Strings.Level3;

public class FreqNested  {
    static void frequency(String s){
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='0') continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){ count++; arr[j]='0'; }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        frequency(s);
    }
}
