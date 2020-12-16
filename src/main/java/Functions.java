public class Functions {
    public String[] eng20 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
            "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    public String[] eng100 = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public String[] eng1000 = {"", "One hundred ", "Two hundred ", "Three hundred ", "Four hundred ", "Five hundred ",
            "Six hundred ", "Seven hundred ", "Eight hundred ", "Nine hundred "};

    public String showDayOfTheWeek(int argument) {
        if (argument <= 0 || argument >= 8) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals more that 0 and less that 8.");
        }
        String[] daysOfWeek = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return daysOfWeek[argument];
    }

    public String convertTo_1000(int argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals 1 or more.");
        }
        int[] arabicOut = new int[100];
        String[] engOut = new String[100];
        String result = "";
        if (argument % 10 < 20 && argument != 0) {
            arabicOut[0] = argument % 10;
        }
        if (argument % 100 < 100 && argument % 100 != 0) {
            argument -= argument % 10;
            arabicOut[1] = argument % 100;
        }
        if (argument % 1000 < 1000 && argument % 1000 != 0) {
            arabicOut[2] = argument % 1000;
        }

        engOut[0] = eng20[arabicOut[0]];
        engOut[1] = eng100[arabicOut[1] / 10];
        engOut[2] = eng1000[arabicOut[2] / 100];

        for (int i = 3; i >= 0; i--) {
            if (engOut[i] != null)
                result += engOut[i];

        }
        return result;
    }

    public String convertTo_100_000_000_000_000(long argument) {
        if (argument <= 0) {
            throw new IllegalArgumentException("Incorrect value! The number should be equals 1 or more.");
        }
        String result = "";

        result += eng1000[(int) ((argument % 1000) / 1000)];

        if (argument > 999) {
            result += "Thousand ";
        }

        result += eng1000[(int) ((argument % 1000) / 100)];
        if (argument >= 20) {
            result += eng100[(int) ((argument % 100) / 10)];
        }
        if (argument > 20) {
            result += eng20[(int) (argument % 100)];
        }
        if (argument < 20) {
            result += eng20[(int) (argument % 100)];
        }
        return result;
    }
}
