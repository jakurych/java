import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Typy danych
        // proste
        // - prymitywy: int, long, double, float, char, byte, boolean
        // - obiektowe: Integer, Long, Double, Float, Character, Byte, Boolean
        // zlozone
        // - obiektowe: String, List, Random, Board
        // - tablice: int[], Double[]

        int b = 100;
        double a = 0.5;
        System.out.println(a / b);
        System.out.println(a * b);

        Long c = null;
        System.out.println(c);

        Float d = 420F;
        System.out.println(d);

        float e = 420;
        System.out.println(e);

        char f = 'a';
        int ff = f;
        System.out.println(ff);

        // Operatory
        // arytmetyczne +, -, ...
        // logiczne &&, ||, !, ==, >, >=, <=, <
        // przypisania =, +=, -=, /=, *=, %=, ++, -- (zmienia wartosc zmiennej)
        // 3 / 2 = 1 r. 1

        int aa = 1;
        System.out.println(aa++); // 1
        System.out.println(++aa); // 3

        // Instrukcje przeplywu danych
        // warunkowe
        int aaa = 10;
        if (aaa == 10)
            System.out.println("10 ==");
        else if (aaa % 2 == 0)
            System.out.println("aaa % 2");
        else
            System.out.println("aaa");

        String colour = "red";
//        switch (colour) {
//            case "red":
//                System.out.println("red");
//                break;
//            case "green":
//                System.out.println("green");
//                break;
//            default:
//                System.out.println("black");
//                break;
//        }
        String message = switch (colour) {
            case "red" -> "red colour";
            case "green" -> "green colour";
            default -> "black colour";
        };
        System.out.println(message);

        String sth = a == 2.0 ? "Tak" : "Nie";
        // petle
        // wypisz tabliczke mnozenia zalezna od podanego n

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(j * i +"\t");
            System.out.println();
        }

        int k = 10;
        do{
            System.out.println(k);
            k--;
        }while(k>=0);

        int y = 10;
        while(y>=0){
            System.out.println(y);
            y--;
        }
    }

    //    *
    //   ***
    //  *****
    // *******
}
