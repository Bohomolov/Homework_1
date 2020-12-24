import utils.Constants;

public class Functions {
    public final String[] eng20 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
            "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    public final String[] eng100 = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public final String[] eng1000 = {"", "One hundred ", "Two hundred ", "Three hundred ", "Four hundred ", "Five hundred ",
            "Six hundred ", "Seven hundred ", "Eight hundred ", "Nine hundred "};

    public String showDayOfTheWeek(int argument) {
        if (argument <= 0 || argument >= 8) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_1);
        }
        String[] daysOfWeek = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfWeek[argument];
    }

    public String convertNumberToString(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_1);
        }
        String result = "";
        result = eng20[returnCorrectIndex(argument)];
        result = eng100[(argument / 10) % 10] + result;
        result = eng1000[(argument / 100) % 10] + result;
        return result;
    }

    private int returnCorrectIndex(int argument) {
        int index = 0;
        if (argument < 20) {
            index = argument;
        } else if (argument / 100 != 0 && argument % 100 < 20) {
            index = (argument % 100) % 20;
        } else {
            index = argument % 20 % 10;
        }
        return index;
    }

    public String convertStringToNumber(String number) {
        String result = "";
        for (int i = 0; i < 20; i++) {
            if (number == eng20[i]) {
                result += i;
            }
        }
        return result;
    }

}
