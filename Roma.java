public class Roma {
    public static int toArabic(String in) {     //из римских в арабские (перевод операндов)
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int result = 0;
        for (int i = 0; i < roman.length; i++) {
            if (in.equals(roman[i]))
                result = i + 1;
        }
        return result;
    }

    static String baseDigit(int arabic) {
        switch (arabic) {
            case 1:  return "I";
            case 5:  return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            default: return "Ошибка";
        }
    }

    public static String toRoma(int x) {    //из римских в арабские (перевод результата)
        String tmp = "";
        int base = 0;

            while (x > 0)
            {
                if (x <= 9)
                    base = 1;
                else if (x <= 99)
                    base=10;
                else if (x<= 999)
                    base=100;

                if (x >= 9 * base)
                {
                    tmp = tmp + baseDigit(base) + baseDigit(base * 10);
                    x -= 9 * base;
                }
                else if (x >= 5 * base)
                {
                    tmp = tmp + baseDigit(5 * base);
                    x -= 5 * base;
                }
                else if (x >= 4 * base)
                {
                    tmp = tmp + baseDigit(base) + baseDigit(5 * base);
                    x -= 4 * base;
                }
                while (x >= base)
                {
                    tmp = tmp + baseDigit(base);
                    x -= base;
                }
            }
        return tmp;
    }
}
