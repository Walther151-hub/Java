import java.util.Arrays;

public class Additionally {
    public static void main(String[] args) {

        // Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        // System.out.println(age(1979);
        System.out.println( age (2019));
    }

    static int age(int x)
    {
        if (x % 100 == 0 && x % 400 == 0) {
            System.out.println("Високосный год");
        }
        else if (x % 4 == 0 && x % 100 > 0) {
            System.out.println("Високосный год");
    }
        else {System.out.println("Обычный год ");}
        return x;
    }

}










