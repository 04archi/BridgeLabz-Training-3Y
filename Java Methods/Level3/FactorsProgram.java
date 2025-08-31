package Java Methods.Level3;

public class FactorsProgram {
    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest: " + factors[factors.length-1]);
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Cube Product: " + cubeProduct(factors));
    }

    static int[] getFactors(int n) {
        int count=0; for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] f=new int[count]; int j=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[j++]=i;
        return f;
    }
    static int sum(int[] arr){ int s=0; for(int x:arr)s+=x; return s; }
    static int product(int[] arr){ int p=1; for(int x:arr)p*=x; return p; }
    static double cubeProduct(int[] arr){ double p=1; for(int x:arr)p*=Math.pow(x,3); return p; }
}
