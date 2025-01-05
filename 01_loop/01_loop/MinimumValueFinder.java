public class MinimumValueFinder {  
    public static void main(String[] args) {  
        // Define the array  
        int[] numbers = {10, 3, 2, 11, 13, 15};  

        // Check if the array is not empty  
        if (numbers.length == 0) {  
            System.out.println("Array is empty. Cannot find minimum value.");  
        } else {  
            // Call the function to find the minimum value  
            int minValue = findMinimum(numbers);  
        
            // Print the minimum value  
            System.out.println("The minimum value in the array is: " + minValue);  
        }  
    }  

    // Function to find the minimum value in an array  
    public static int findMinimum(int[] array) {  
        // Assume the first element is the minimum  
        int min = array[0];  
        
        // Iterate through the array  
        for (int i = 1; i < array.length; i++) {  
            if (array[i] < min) {  
                min = array[i]; // Update minimum value  
            }  
        }  
        
        return min; // Return the minimum value  
    }  
}