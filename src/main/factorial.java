package main;

public class factorial {
    static int findFactorial(int number) {
       int factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult = factorialResult*i;
        }
    return factorialResult;
    }

    static int findRecursionFactoriral(int number ) {
        int factorialResult = 1;
                if (number == 1 || number == 0){
                    return factorialResult;
        }

        {
            factorialResult = number * findRecursionFactoriral(number - 1);
            return factorialResult;
        }


    }

}
