package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {

        return (double) (realNumber - (int) realNumber); //your code here
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c; //your code here
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {

        return Integer.compare(a,b)==0; //your code here
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if ((number == null) || (leftBound == null) || (rightBound == null) || (inclusively == null)){
         return false;
        }
        if (inclusively){
            if (number >= leftBound && number <= rightBound) {
                return true;
            }
            return false;
        }
        if (number > leftBound && number < rightBound) {
            return true;
        }
        return false;//your code here
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        if(((48<=(int)c1)&&(57>=(int)c1))||((48<=(int)c3)&&(57>=(int)c3))||((48<=(int)c2)&&(57>=(int)c2))){
            return true;
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double ex = 0.0001;
        if(Math.abs(a-b) < ex){
            return true;
        }
        return false;
    }
    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int k=0;
        for(int i=0;i<3;i++){
            k = k + n%10;
            n = n/10;
        }

        return k; //your code here
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if (n%2==0){
            return n+2;
        }
        return n+1;//your code here
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int k = 0;
        if(num1%2==0) {
            k = k + num1/2;
        }
        else {
            k = k + (num1/2)+1;
        }

        if(num2%2==0) {
            k = k + num2/2;
        }
        else {
            k = k + (num2/2)+1;
        }

        if(num3%2==0) {
            k = k + num3/2;
        }
        else {
            k = k + (num3/2)+1;
        }

        return k;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        return (N%10)^((N/10)%10);
    }

}
