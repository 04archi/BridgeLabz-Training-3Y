package Java Methods.Level3;

public class NumberChecker5 {
    public static void main(String[] args) {
        int num = 145;
        System.out.println("Perfect: " + isPerfect(28));
        System.out.println("Abundant: " + isAbundant(12));
        System.out.println("Deficient: " + isDeficient(8));
        System.out.println("Strong: " + isStrong(num));
    }

    static int sumDivisors(int n){ int sum=0; for(int i=1;i<=n/2;i++) if(n%i==0) sum+=i; return sum; }
    static boolean isPerfect(int n){ return sumDivisors(n)==n; }
    static boolean isAbundant(int n){ return sumDivisors(n)>n; }
    static boolean isDeficient(int n){ return sumDivisors(n)<n; }
    static int fact(int n){ int f=1; for(int i=1;i<=n;i++) f*=i; return f; }
    static boolean isStrong(int n){ int sum=0,temp=n; while(temp>0){sum+=fact(temp%10);temp/=10;} return sum==n; }
}
