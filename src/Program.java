import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберете пункт меню: 1. Вывести список листов. " +
                    "2. Добавить лист. 3. Удалить лист. 4. Выбрать лист. 5.Выход.");

            int command = scanner.nextInt();

            if (command == 1) {


            }else if (command ==2) {


            }else if (command ==3) {

            }else if (command == 4){

            }else if(command == 5){
                System.out.println("EXIT");
                break;
            }else{
                System.out.println("Такой команды нет. Введите номер команды (без точки).");
            }
        }

    }

}
