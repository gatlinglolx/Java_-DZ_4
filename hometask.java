import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class hometask {
    public static void main(String[] args) {
        // Pеализовать приложение, которое:
        // Принимает от пользователя и запоминает строки
        // Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
        // Если введено revert, то удаляем последнюю введеную строку
        // Если введено exit, то завершаем программу
        
        LinkedList<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String enter = scanner.nextLine();
                list.add(enter);
                System.out.println(list.toString());
                if (scanner.hasNext("print")) {
                    Collections.reverse(list);
                }
                list.remove("print");
                if (scanner.hasNext("revert")) {
                    list.removeLast();
                }
                list.remove("revert");
                if (scanner.hasNext("exit")) {
                    scanner.close();
                }
            }
        }
    }
}
