import java.util.Scanner;
//Пункт 5
public class Exercise5 {
    public static void main(String[] args){
        int argument1 = readIntArgument("Введите целое число: ");
        if (argument1>=0) System.out.println("Это число положительное!");
        else System.out.println("Это число отрицательное!");
    }

    static int readIntArgument(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }
}
