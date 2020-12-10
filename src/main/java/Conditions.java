public class Conditions {

    public int getSumOrMultiply(int a, int b) {
        return (a % 2 == 0) ? a * b : a + b;
    }
    public String showQuarter(int x, int y) {
        String result;
        if (x > 0 && y > 0) {
            result = "I quarter";
        } else if (x < 0 && y > 0) {
            result = "II quarter";
        } else if (x < 0 && y < 0) {
            result = "III quarter";
        } else if (x > 0 && y < 0) {
            result = "IV quarter";
        } else if (x == 0 && y < 0) {
            result = "Your point between III and IV quarter";
        } else if (x == 0 && y > 0) {
            result = "Your point between I and II quarter";
        } else if (x > 0 && y == 0) {
            result = "Your point between I and IV quarter";
        } else if (x < 0 && y == 0) {
            result = "Your point between II and III quarter";
        } else {
            result = "Your point equals O:O";
        }
        return result;
    }
    public int getSum(int a, int b, int c) {
        int result = 0;
        if (a > 0) {
            result += a;
        }
        if (b > 0) {
            result += b;
        }
        if (c > 0) {
            result += c;
        }
        return result;
    }

    public int countMax(int a, int b, int c) {
        int result;
        int sum = a + b + c;
        int multiply = a * b * c;
        if (sum > multiply) {
            result = sum + 3;
        } else {
            result = multiply + 3;
        }
        return result;
    }
    public String rating(int a) {
        if (a < 0 || a > 100 ){
           throw new IllegalArgumentException("Incorrect value, correct value [0 - 100]");
        }
        String result ="";
        if (a >= 0 && a <= 19) {
            result = "F";
        } else if ( a <= 39) {
            result = "E";
        } else if ( a <= 59) {
            result = "D";
        } else if ( a <= 74) {
            result = "C";
        } else if ( a <= 89) {
            result = "B";
        } else if ( a <= 100) {
            result = "A";
        }
        return result;
    }
}