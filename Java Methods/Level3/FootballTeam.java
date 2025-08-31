package Java Methods.Level3;

public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest Height: " + min(heights));
        System.out.println("Tallest Height: " + max(heights));
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    static double mean(int[] arr) { return (double) sum(arr) / arr.length; }
    static int min(int[] arr) { return Arrays.stream(arr).min().getAsInt(); }
    static int max(int[] arr) { return Arrays.stream(arr).max().getAsInt(); }
}
