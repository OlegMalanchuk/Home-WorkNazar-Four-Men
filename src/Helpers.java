import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Helpers
{
    public void out()
    {
        String line ;
        for (int i = 0 ; i <10;i++){
            line = "_";
            System.out.print(line);
        }
        System.out.println(" ");

    }

    public void outQuestion()
    {
        System.out.println("1 - міняємо розмір ноги ");
        System.out.println("2 - залишаємо як є ");

    }
    public void choice()
    {
        System.out.println("виберіть персонажа якому хочете поміняти розмір ноги. від 1 до 4 ");
    }
    public static void displayMen(HashMap<String, String> men/*<-- ось він*/) {
        // тут ми в змінну "е" присвоюємо один елемент при кожній ітерації через ":" всі дані з "men" якого ми прийняли, витягнувши дані "men.entrySet()"
        for (Map.Entry<String, String> e/*<-- ось вона */ : men.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

    }

}
