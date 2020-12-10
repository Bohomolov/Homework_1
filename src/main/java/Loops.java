public class Loops {
    //#=====================================_1ST_===========================================
    public String countSumEvenNumber() {
        int sum = 0;
        int quantity = 0;
        for (int i = 2; i < 100; i += 2) {
            sum += i;
            quantity += 1;
        }
       return  "Sum = " + sum + " Quantity = " + quantity;
    }
    //#=====================================_2ND_==========================================
    public String checkIsNumberPrime(int argument) {
        String resultPrime = "";
        if (argument <= 0) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals 2 or more.");
        }
        int i = 2;
        while (i <= argument) {
            if (argument % i != 0) {
                i++;
            } else if (argument % i == 0) {
                if (argument == i) {
                    resultPrime = "This number is prime";
                } else {
                    resultPrime = "This number isn't prime";
                }
                break;
            }
        }
        return resultPrime;
    }
    //#=====================================_3RT_==========================================
    public int findSqrt(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals 1 or more.");
        }
        int resultSqrt = 0;
        for (int i = 1; i <= argument; i++) {
            if (i * i == argument) {
                resultSqrt = i;
            }
        }
        return resultSqrt;
    }
    //#=====================================_4TH_==========================================
    public int countFactorial(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals 1 or more.");
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
            throw new IllegalArgumentException("Incorrect value! The number should be equals 0 or more.");
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
            throw new IllegalArgumentException("Incorrect value! The number should be equals 1 or more.");
        }
        String result = "";
        while (argument > 0) {
            result += argument % 10;
            argument /= 10;
        }
        return result;
    }
}