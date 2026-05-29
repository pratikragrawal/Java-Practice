public class ex35 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 2, 6, 7, 8, 2, 9}; // Example array
        int target = 2; // Number to count
        int count = 0;
        
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        
        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
}
