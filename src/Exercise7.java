import java.util.Scanner;

//Пункт 7
public class Exercise7 {
    public static void main(String[] args){
        String name1 = readStringName("Введите имя пожалуйста: ");
        System.out.println("Привет " + name1 + "!");

    }

    static String readStringName(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(userText);
        String name = userInput.nextLine();
        return name;
    }
}
