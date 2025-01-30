public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;
        int num = 2; // Starting from the first even number
        
        // While loop to add even numbers between 1 and 100
        while (num <= 100) {
            sum += num; // Add the current even number to sum
            num += 2;   // Move to the next even number
        }
        
        // Print the result
        System.out.println("Sum of all even numbers between 1 and 100 is: " + sum);
    }
}

