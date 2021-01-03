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

    public int convertStringToNumber(String number) {
        int result = 0;

        String[] arrayStr = number.split(" ");
        if (arrayStr.length == 1) {
            int j = 0;
            for (int i = 0; i < eng20.length; i++) {
                if (eng20[i].strip().equalsIgnoreCase(arrayStr[0])) {
                    result = i;
                }
                if (j < 10) {
                    if (eng100[j].strip().equalsIgnoreCase(arrayStr[0])) {
                        result = j * 10;

                    }
                    j++;
                }
            }
        } else if (arrayStr.length == 2) {
            if (arrayStr[1].equalsIgnoreCase("hundred")) {
                arrayStr[0] += " hundred";
                for (int i = 0; i < eng1000.length; i++) {
                    if (eng1000[i].strip().equalsIgnoreCase(arrayStr[0])) {
                        result = i * 100;
                    }
                }
            }
            for (int j = 0; j < eng20.length; j++) {
                if (eng20[j].strip().equalsIgnoreCase(arrayStr[1])) {
                    result += j;
                }
            }
            for (int i = 0; i < eng100.length; i++) {
                if (eng100[i].strip().equalsIgnoreCase(arrayStr[0])) {
                    result += i * 10;
                }
            }
        } else if (arrayStr.length == 3 || arrayStr.length == 4) {
            arrayStr[0] += " hundred";
            int j = 0;
            for (int i = 0; i < eng20.length; i++) {

                if (eng20[i].strip().equalsIgnoreCase(arrayStr[2])) {
                    result += i;
                }
                if (j < 10) {
                    if (eng1000[j].strip().equalsIgnoreCase(arrayStr[0])) {
                        result += j * 100;

                    }
                    if (eng100[j].strip().equalsIgnoreCase(arrayStr[2])) {
                        result += j * 10;
                    }
                    if (arrayStr.length == 4) {
                        if (eng20[j].strip().equalsIgnoreCase(arrayStr[3])) {
                            result += j;
                        }
                    }
                    j++;
                }
            }
        }
        if (result == 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_VALUE_S);
        }
        return result;
    }

}
