public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                //Simulate a situation where the loop breaks unexpectedly. 
                break; //This is not an error, but simulates an uncommon scenario 
            }
        }
        System.out.println("Loop finished");
    }
}