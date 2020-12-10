public class Functions {
    public static String[] eng20 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
            "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    public static String[] eng100 = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    public static String[] eng1000 = {"", "One hundred ", "Two hundred ", "Three hundred ", "Four hundred ", "Five hundred ",
            "Six hundred ", "Seven hundred ", "Eight hundred ", "Nine hundred "};

    public String convertTo_1000(int a) {
        String result = "";
        result += eng1000[(a % 1000) / 100];
        result += eng100[(a % 100) / 10];
        result += eng20[a % 10];
        return result;
    }
    public String convertTo_1000000000000(long a) {
        String result = "";
        //result += eng100[(int)(a % 10000000000000L) / 10000000];
        // if (a > 20000000000L){
        //      result += eng20[(int)(a % 10000000000000L) / 100000000 ];
        //  }
        if (a < 20000000000L){
            result += eng20[(int)(a % 10000000000000L) / 1000000000 ];
        }
        if (a > 1000000000){
            result += "Billions ";
        }
        result += eng1000[(int) ((a % 1000000000) / 100000000)];
        result += eng100[(int) ((a % 100000000) / 10000000)];
        if (a > 20000000) {
            result += eng20[(int) ((a % 10000000)/1000000)];
        }
        if (a < 20000000) {
            result += eng20[(int) ((a % 100000000) / 1000000)];
        }
        if (a > 1000000) {
            result += "Millions ";
        }
        result += eng1000[(int) ((a % 1000000) / 100000)];
        result += eng100[(int) ((a % 100000) / 10000)];

        if (a > 20000) {
            result += eng20[(int) ((a % 10000) / 1000)];
        }
        if (a < 20000) {
            result += eng20[(int) ((a % 100000) / 1000)];
        }
        if (a > 999) {
            result += "Thousand ";
        }
        result += eng1000[(int) ((a % 1000) / 100)];
        result += eng100[(int) ((a % 100) / 10)];
        result += eng20[(int) (a % 10)];

        return result;
    }
}
