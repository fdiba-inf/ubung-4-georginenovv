package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int index = input.nextInt();
        int[] numbers = new int[index];
int maxnumber=0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = input.nextInt();
            
        }
        for(int y = 1; y < numbers.length; y++)
        {
        if(numbers[y]>numbers[y-1])
            {
               maxnumber = numbers[y];
            }
        }
System.out.println("Max number: "+ maxnumber);
                       
}
}


            