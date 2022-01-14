import java.util.Scanner;
//Пункт 6
public class Exercise6 {
    public static void main(String[] args){
        int argument1 = readIntArgument("Введите целое число: ");

        if (validateData(argument1)){
            System.out.println("Проверка пройдена, число " + argument1 + " отрицательное");
        }
        else System.out.println("Проверка не пройдена, число " + argument1 + " положительное");
    }

    static int readIntArgument(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        int argument = userInput.nextInt();
        return argument;
    }

    static boolean validateData(Integer arg1){
        boolean result = true;
        if (arg1>=0){
            result = false;
        }
        return result;
    }
}
