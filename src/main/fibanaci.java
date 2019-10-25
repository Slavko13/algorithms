package main;

public class fibanaci {
    static int findNumberInFibanaciArray (int number) {
        int result = 1;
        if (number == 1 || number == 2) {
            return result;
        }
        {
            result = findNumberInFibanaciArray(number - 1) + findNumberInFibanaciArray(number - 2);
            return  result;
        }

    }
}
