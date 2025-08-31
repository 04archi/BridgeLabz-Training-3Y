package Java Methods.Level3;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for(int i=0;i<10;i++) otps[i]=generateOTP();
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All Unique? " + checkUnique(otps));
    }

    static int generateOTP(){ return 100000 + (int)(Math.random()*900000); }
    static boolean checkUnique(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int x:arr) if(!set.add(x)) return false;
        return true;
    }
}
