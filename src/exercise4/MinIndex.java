package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int index = 0;
        int arraysize = input.nextInt();
        double[] numbers = new double[arraysize];
        
        System.out.println("Enter numbers: ");
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        double min = numbers[0];
    for (int y = 1; y < numbers.length; y++) {
      if(min > numbers[y]) {
        min = numbers[y];
        index = y;
      }
      }
      System.out.println("Min index: " + index);

    }
}