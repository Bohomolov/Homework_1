import utils.Constants;

public class Conditions {
    //#=====================================_1ST_===========================================
    public int getSumOrMultiply(int a, int b) {
        return (a % 2 == 0) ? a * b : a + b;
    }
    //#=====================================_2ND_==========================================
    public String showQuarter(int x, int y) {
        String result;
        if (x > 0 && y > 0) {
            result = Constants.I_QUARTER;
        } else if (x < 0 && y > 0) {
            result = Constants.II_QUARTER;
        } else if (x < 0 && y < 0) {
            result = Constants.III_QUARTER;
        } else if (x > 0 && y < 0) {
            result = Constants.IV_QUARTER;
        } else if (x == 0 && y < 0) {
            result = Constants.BETWEEN_III_AND_IV_QUARTER;
        } else if (x == 0 && y > 0) {
            result = Constants.BETWEEN_I_AND_II_QUARTER;
        } else if (x > 0) {
            result = Constants.BETWEEN_I_AND_IV_QUARTER;
        } else if (x < 0) {
            result = Constants.BETWEEN_III_AND_IV_QUARTER;
        } else {
            result = Constants._0_0_QUARTER;
        }
        return result;
    }
    //#=====================================_3RD_============================================
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
    //#=====================================_4TH_==============================================
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
    //#=====================================_5TH_===============================================
    public String showRating(int argument) {
        if (argument < 0 || argument > 100 ){
           throw new IllegalArgumentException(Constants.INCORRECT_VALUE_0__100);
        }
        String result;
        if (argument <= 19) {
            result = "F";
        } else if ( argument <= 39) {
            result = "E";
        } else if ( argument <= 59) {
            result = "D";
        } else if ( argument <= 74) {
            result = "C";
        } else if ( argument <= 89) {
            result = "B";
        } else {
            result = "A";
        }
        return result;
    }
}