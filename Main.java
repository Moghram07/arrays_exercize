
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Q1. first and last element are equal?
        int[] arr = {50,-20,0,30,40,60,10};
        String result = (arr[0] == arr[arr.length -1])? " nums are equal": " nums are not equal";
        System.out.println((arr[0] == arr[arr.length -1]) +result );

        //Q2. find numbers higher than the average
        int[] arr1 = {1,4,17,7,25,3,100};
        int sum = 0;
        for(int n : arr1){
            sum +=n;
        }
        for(int n:arr1){
            if(n>(sum/arr1.length)){
                System.out.println("numbers greater than average: " + n);
            }
        }

        //Q3. larger value between first and last
        int []arr3 = {20,30,40};
        System.out.println((arr3[0] < arr3[arr3.length-1])? arr3[arr3.length-1]:arr3[0]);

        //Q4. swap first and last elements
        // using the array in the question 3 arr3
        System.out.println("original array: "+ Arrays.toString(arr3));
        for(int i = 0; i<arr3.length/2; i++){
            int temp = arr3[i];
            arr3[i] = arr3[arr3.length-i-1];
            arr3[arr3.length-i-1] = temp;
        }
        System.out.println("new array after swapping: "+ Arrays.toString(arr3));

        //Q5. place odd before even elements in an array
        int[] arr4 = {2,3,40,1,5,9,4,10,7};
        //arr4 after sperating :[3,1,5,9,7,2,40,4,10]
        ArrayList <Integer> oddNumbers = new ArrayList<>();
        ArrayList <Integer> evenNumbers = new ArrayList<>();
        for(int n: arr4){
            if(n % 2 != 0){
                oddNumbers.add(n);
            }else{
                evenNumbers.add(n);
            }
        }
        oddNumbers.addAll(evenNumbers);
        Integer [] combine = oddNumbers.toArray(new Integer[0]);
        System.out.println("array after seperation: "+ Arrays.toString(combine));

        //Q6. test the equality of two arrays
        int [] arr5 = {2,3,6,6,4};
        int [] arr6 = {2,3,6,6,4};
        boolean equal = true;
        for(int i=0; i<arr5.length; i++){
            if(arr5[i]!=arr6[i]){
                equal = false;
            }else{
                equal = true;
            }
        }
        System.out.println("array's equality is "+ equal);
    }
}
