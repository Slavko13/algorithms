package main;

public class sorts {
    static private void swap(int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int[] bubbleSort(int[] array) {
        boolean needSort = true;

        while (needSort) {
                needSort = false;
            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needSort = true;
                }

            }
        }
        return array;
        }


    static int[] selectionSort(int[] array) {
        for (int left = 0; left <array.length; left++) {
                int minId = left;
                for (int i = left; i < array.length; i++ ) {
                        if (array[i] < array[minId]) {
                            minId = i;
                        }

                }
                swap(array, left, minId);
            }
            return array;
        }

        static int[] insertionSort(int[] array) {
            for (int left = 0; left < array.length; left++) {
                int value = array[left];
                int i = left - 1;
                for (; i>=0; i--) {
                    if (value < array[i]) {
                        array[i+1] = array[i];
                    }
                    else
                    {
                        break;
                    }

                }
                array[i+1] = value;
            }
        return array;
        }

    private static void merge(int [] array1, int startFirst,int[] array2 ,int startSecond, int[] dest, int destStart, int size) {
        int Start1 = startFirst;
        int Start2 = startSecond;

        int endFirst = Math.min(startFirst + size, array1.length );
        int endSecond = Math.min(startSecond + size, array2.length );

        int fullRange = endSecond - startSecond + endFirst - startFirst;

        for (int i = destStart; i < fullRange + destStart; i++) {
            if
        }
    }
}


