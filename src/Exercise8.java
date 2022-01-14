import java.util.Scanner;

//Пункт 8
public class Exercise8 {
    public static void main(String[] args){
        int year1 = readIntYear("Введите год для проверки : ");
        if (((year1 % 4 == 0) && !(year1 % 100 == 0)) || (year1 % 400 == 0)) System.out.println("Введенный год високосный!");
        else System.out.println("Введенный год не високосный!");
    }

    static int readIntYear(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }
}
