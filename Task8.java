public class Task8 {
    
  
    public static void sumWithCumulative(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulative = 0;
            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }

            System.out.println(num + " = " + cumulative);

            totalSum += cumulative;
        }
        
        System.out.println("Total Sum = " + totalSum);
    }

    public static void main(String[] args) {
        // Example: parameters (4, 5, 10)
        sumWithCumulative(4, 5, 10);
    }
}
