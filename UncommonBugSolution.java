public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                // Instead of breaking, handle the specific condition within the loop
                System.out.println("Condition met at i = " + i);
            }
        }
        System.out.println("Loop finished");
    }
}