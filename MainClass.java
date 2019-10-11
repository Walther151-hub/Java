import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // создать переменные всех пройденых типов и инициализировать их значения
        System.out.println("создать переменные всех пройденых типов\n и инициализировать их значения");
        byte by;
        by = 127;
        short s;
        s = 32;
        int i;
        i = 21;
        long l;
        l = 92;
        float f;
        f = 34454;
        double dou;
        dou = 1.8;
        char ch;
        ch = 64;
        String y = "Java";

        // bolean true false

        System.out.println("byte="+by+"  \nshort="+s+" \nint="+i+" \nlong="+l+" \nfloat="+f+" "+
                "\ndouble="+dou+" \nchar="+ch+" \nString="+y+"\nbolean true false");

        // Написать метод
        // вычисляющий выражение a * (b + (c / d))
        // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println("Написать метод вычисляющий выражение  a * (b + (c / d))\nи возвращающий результат");

        System.out.println(printReturnRes(8, 9, 7, 2));


        System.out.println("Написать метод, принимающий на вход два числа, и проверяющий \n"+
                "что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, \nв противном случае – false");

        System.out.println(twoNumber(7,3));


        System.out.println("Написать метод, которому в качестве параметра передается целое число, \n" +
                        "метод должен напечатать в консоль положительное ли число передали, или отрицательное");

        System.out.println(oneNumber(5));


        System.out.println("Написать метод, которому в качестве параметра передается целое число, \n" +
                "метод должен вернуть true, если число отрицательное");

        System.out.println(printReturnMinus(-6));


        System.out.println("Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен \n " +
                "вывести в консоль сообщение «Привет, указанное_имя!");

                printName("Григорий");


    }


    static int printReturnRes(int a, int b, int c, int d) {
         return a * (b+(c / d));
    }

    //Написать метод, принимающий на вход два числа, и проверяющий
    // что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true,
    // в противном случае – false


    static boolean twoNumber (int k, int h)  {
        System.out.println("сумма лежит в пределах от 10 до 20");
        return k+h >=10 && k+h <=20;

    }

   //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или
    // отрицательное; Замечание: ноль считаем положительным числом.
   static int oneNumber (int e) {
       if (e >= 0) {
           System.out.print("Число положительное ");
       } else {
           System.out.println("Отрицательное число ");
       }
       return e;}
   // }

    // Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    static boolean printReturnMinus(int r) {
        System.out.println("Введено отрицательное число");
        return  r <0;


    }
    static void printName (String name)   {
        System.out.println("Привет,"+ name +"!!!");
    }




}











