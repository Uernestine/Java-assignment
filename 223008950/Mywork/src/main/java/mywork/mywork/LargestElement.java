
package mywork.mywork;


public class LargestElement {
    public static void main(String[] args) {  
  

        int [] arr = new int [] {34,23,12,45,67,89,234,26,10,30,43};  
        
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}
