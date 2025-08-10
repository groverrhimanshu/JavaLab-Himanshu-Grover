package day5;

import java.util.Arrays;

public class ArraySortedLambda {
	public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 6};

        
        Arrays.sort(numbers, (a, b) -> a - b);

        
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
