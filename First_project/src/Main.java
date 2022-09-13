import java.util.Scanner;// импортируем класс Scanner

public class Main {// объявляется класс Main

    public static void main(String[] args) {// так включаются программы,
        // просто запомнить
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Square:" + (a * a));

    }
}