import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        // ListsRepo[] listRepo = new ListsRepo[]; - массив самих листов

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберете пункт меню:\n 1. Вывести список листов.\n " +
                    "2. Добавить лист.\n 3. Удалить лист.\n 4. Выбрать лист.\n 5. Выход.");

            int command = scanner.nextInt();

            if (command == 1) {


            }else if (command ==2) {

                ArrayList<String> ToDoList = new ArrayList<>(Arrays.asList("Съесть помидор", "Купить черешню", "Помыть окна"));
                System.out.println(ToDoList.toString());


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



class ListsRepo {
    int id;
    String listName;
    // массив - набор ToDo листов (либо ArrayList)
    // toDoList[] toDoLists = new toDoList[10];
}
class toDoList {
    int id;
    String taskName;
    boolean taskDone;
}