
package mywork.mywork;


public class Average {
   public static void main(String[] args) {
        
        int[] numbers = { 10,12,34,23,56,78 };
        
       
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
      
        double average = (double) sum / numbers.length;
        
        
        System.out.printf("The average is: %.2f%n", average);
    }
}

