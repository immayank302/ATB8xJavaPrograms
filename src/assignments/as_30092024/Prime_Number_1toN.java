package assignments.as_30092024;

public class Prime_Number_1toN {

    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 10 are : ");
// Start a loop from 1 to 10
        for (int num = 2; num <= 100; num++) {
            // Assume that the number is prime
            boolean isPrime = true;
            //Check for divisibility
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                }

            }
            if (isPrime) {
                System.out.print(num + "\t");
            }
        }
    }
}
