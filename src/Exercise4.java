import java.util.Scanner;
//Пункт 4
public class Exercise4 {
    public static void main(String[] args){
        int argument1 = readIntArgument("Введите первое целое число: ");
        int argument2 = readIntArgument("Введите второе целое число: ");
        int argumentSum = argument1 + argument2;
        if (validateData(argumentSum)){
            System.out.println("Проверка пройдена, сумма равна: " + argumentSum);
        }
        else System.out.println("Проверка не пройдена!");
    }

    static int readIntArgument(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }

    static boolean validateData(Integer argumentSum){
        boolean result = false;
        if (argumentSum>=10 && argumentSum<=20){
            result = true;
        }
        return result;
    }

}
