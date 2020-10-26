package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        char space =' ';
        String s =new String();

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for(int index = 0;index < numbers.length; index++) {
          if (index==0) {
            System.out.println(numbers[index]);
          }
          else{
            s = s + space;
          System.out.println(s+ numbers[index]);
          }
          
        }
      } 
    }
      
