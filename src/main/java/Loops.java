import utils.Constants;

public class Loops {
    //#=====================================_1ST_===========================================
    public String countSumEvenNumber() {
        int sum = 0;
        int quantity = 0;
        for (int i = 2; i < 100; i += 2) {
            sum += i;
            quantity += 1;
        }
        return "Sum = " + sum + " Quantity = " + quantity;
    }

    //#=====================================_2ND_==========================================
    public String checkIsNumberPrime(int argument) {
        String resultPrime = "";
        if (argument == 1) {
            resultPrime = Constants.ISN_T_PRIME;
        }
        if (argument < 1) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_2);
        }
        int i = 2;
        while (i <= argument) {
            if (argument % i != 0) {
                i++;
            } else {
                if (argument == i) {
                    resultPrime = Constants.IS_PRIME;
                } else {
                    resultPrime = Constants.ISN_T_PRIME;
                }
                break;
            }
        }
        return resultPrime;
    }

    //#=====================================_3RT_==========================================
    public String findSqrt(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_0);
        }
        String resultSqrt = "";
        for (int i = 1; i <= argument; i++) {
            if (i * i == argument) {
                resultSqrt += i;
            }
        }
        if (resultSqrt.equals("")) {
            resultSqrt = Constants.SQRT_ERROR;
        }
        return resultSqrt;
    }

    public String binarySearchSqrt(int argument) {
        if (argument < 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_0);
        }
        String result = "";
        int resultMath = argument;
        while (resultMath * resultMath > argument) {
            resultMath /= 2;
        }
        while (resultMath * resultMath < argument) {
            resultMath++;
        }
        if (resultMath * resultMath != argument) {
            result = Constants.SQRT_ERROR;
            return result ;
        }
        result += resultMath;
        return result;
    }


    //#=====================================_4TH_==========================================
    public int countFactorial(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_1);
        }
        int result = 1;
        for (int i = 1; i <= argument; i++) {
            result *= i;
        }
        return result;
    }

    //#=====================================_5TH_==========================================
    public int countSumOfDigits(int argument) {
        if (argument < 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_0);
        }
        int result = 0;
        while (argument > 0) {
            result += argument % 10;
            argument /= 10;
        }
        return result;
    }

    //#=====================================_6TH_==========================================
    public String reverseNumeral(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_1);
        }
        String result = "";
        while (argument > 0) {
            result += argument % 10;
            argument /= 10;
        }
        return result;
    }
}