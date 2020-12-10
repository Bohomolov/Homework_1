public class Loops {

    public String countSumEvenNumber() {
        String result = "";
        int sum = 0;
        int quantity = 0;
        for (int i = 2; i < 100; i += 2) {
            sum += i;
            quantity += 1 ;
        }
        result += "Sum = " + sum + " Quantity = " + quantity;
        return result;
    }

    String resultPrime;

    public String showPrime(int a) {
        int i = 2;
        while (i <= a) {
            if (a % i != 0) {
                i++;
            } else if (a % i == 0) {
                outL(a, i);
                break;
            }
        }
        return resultPrime;
    }

    public void outL(int a, int i) {
        if (a == i) {
            resultPrime = "This number is prime";
        } else resultPrime = "This number isn't prime";
    }

    public int sqrt(int a) {
        int resultSqrt = 0;
        for (int i = 1; i <= a; i++) {
            if (i * i == a) {
                resultSqrt = i;
            }
        }
        return resultSqrt;
    }

    public int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public int countSum(int e) {
        int result = 0;
        while (e > 0) {
            result += e % 10;
            e /= 10;
        }
        return result;
    }

    public String reverse(int e) {
        String result = "";
        while (e > 0) {
            result += e % 10;
            e /= 10;
        }
        return result;
    }
}