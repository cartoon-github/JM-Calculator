public class Parser {

    public static void calc(String str) {
        int a;
        int b;
        char oper;
        String[] words = str.split(" ");    //разбить введенную строку по пробелам
        if (words.length == 3) {
            char first = words[0].charAt(0);      //первый символ первого операнда
            char second = words[2].charAt(0);     //первый символ второго операнда
            oper = words[1].charAt(0);            //операция (+, - , *, /)
            if ((first >= '0' && first <= '9') && (second >= '0' && second <= '9')) {   //проверка операндов на арабские
                a = Integer.parseInt(words[0]);
                b = Integer.parseInt(words[2]);
                System.out.println(calculate(a, b, oper));
            } else if ((first == 'I' || first == 'V' || first == 'X') && (second == 'I' || second == 'V' || second == 'X')) {   //проверка операндов на римские
                a = Roma.toArabic(words[0]);
                b = Roma.toArabic(words[2]);
                System.out.println(Roma.toRoma(calculate(a, b, oper)));
            } else
                System.out.println("Ошибка в операндах!");
        } else
            System.out.println("Неверное выражение!");
    }

    static int calculate(int a, int b, char oper) {
        int result = 0;
        switch (oper){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("Неверный тип операции!");
        }
        return -1;
    }

}
