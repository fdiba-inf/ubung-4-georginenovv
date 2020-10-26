package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int count = input.nextInt();
        char[] array = new char[count];

        System.out.println("Enter letter: ");
        for (int index = 0; index < array.length; index++) {
           array[index] = input.next().charAt(0);
        }
        char[] number= new char[count];
        for (int b=0; b < number.length;b++){
          number[b]= array[array.length -1 - b];
        }
        String numberAsString = Arrays.toString(number);
        System.out.println("Reversed symbols: " + numberAsString);
        
    }
}