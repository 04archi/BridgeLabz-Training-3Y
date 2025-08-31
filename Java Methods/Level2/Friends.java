package Java Methods.Level2;

public class Friends {
    public static int youngest(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIdx]) minIdx = i;
        return minIdx;
    }
    public static int tallest(int[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIdx]) maxIdx = i;
        return maxIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + names[youngest(ages)]);
        System.out.println("Tallest: " + names[tallest(heights)]);
    }
}
