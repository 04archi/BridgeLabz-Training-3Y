package Java Methods.Level1;

public class Chocolates {
    public static int[] divide(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt(), kids = sc.nextInt();
        int[] res = divide(ch, kids);
        System.out.println("Each child gets " + res[0] + ", Remaining = " + res[1]);
    }
}
