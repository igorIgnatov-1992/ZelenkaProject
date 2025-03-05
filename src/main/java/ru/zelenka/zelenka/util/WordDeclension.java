package ru.zelenka.zelenka.util;


public class WordDeclension {

    /**
     * Возвращает правильную форму слова в зависимости от числа.
     *
     * @param number Число, для которого нужно склонять слово.
     * @param form1  Форма слова для 1 (например, "год").
     * @param form2  Форма слова для 2, 3, 4 (например, "года").
     * @param form5  Форма слова для 5 и больше (например, "лет").
     * @return Правильная форма слова.
     */
    public static String getCorrectForm(int number, String form1, String form2, String form5) {
        int n = Math.abs(number) % 100;
        int n1 = n % 10;

        if (n > 10 && n < 20) {
            return form5;
        }
        if (n1 > 1 && n1 < 5) {
            return form2;
        }
        if (n1 == 1) {
            return form1;
        }
        return form5;
    }

    public static String getCorrectFormDouble(double number, String form1, String form2, String form5) {
        int n = (int) (Math.abs(number) % 100);
        int n1 = n % 10;

        if (n > 10 && n < 20) {
            return form5;
        }
        if (n1 > 1 && n1 < 5) {
            return form2;
        }
        if (n1 == 1) {
            return form1;
        }
        return form5;
    }
}
