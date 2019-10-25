package main;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Arrays;

import static main.factorial.findFactorial;
import static main.factorial.findRecursionFactoriral;
import static main.fibanaci.findNumberInFibanaciArray;
import static main.sorts.*;
import static main.stringMethods.overturnString;
import static main.stringMethods.overturnStringNextLevel;

public class Main {

    public static void main(String[] args) {
	    int result = findFactorial(4);
	    System.out.println(result);

	    result = findRecursionFactoriral(5);
	    System.out.println(result);

	    String overturnName = overturnString("Slava");
	    System.out.println(overturnName);

	    overturnName = overturnStringNextLevel("Slava");
	    System.out.println(overturnName);

        int fibanaciResult = findNumberInFibanaciArray(9);
        System.out.println(fibanaciResult);

        int [] arrayToSort = {1, 4, 7, 1, 2, 0, 11};
        int [] massiveAfterBubbleSort = bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(massiveAfterBubbleSort));

        int [] arrayToSort2 = {1, 4, 7, 1, 2, 0, 11, 43, -1, 6};
        int [] missiveAfterSelectionSort = selectionSort(arrayToSort2);
        System.out.println(Arrays.toString(missiveAfterSelectionSort));

        int [] arrayToSort3 = {3,5, 1, 10, 32,11 ,2, 3};
        int [] massiveAfterInsertionSort = insertionSort(arrayToSort3);
        System.out.println(Arrays.toString(massiveAfterInsertionSort));
     }
}
