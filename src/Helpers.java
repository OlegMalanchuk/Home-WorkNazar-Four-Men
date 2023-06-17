import java.util.HashMap;
import java.util.Map;

public class Helpers {
    public static void out() {// лінія
        String line ;
        for (int i = 0 ; i <10;i++){
            line = "_";
            System.out.print(line);
        }
        System.out.println(" ");
    }

    public static void outQuestion() {// не буду пояснював сам розберешся
        System.out.println("1 - міняємо розмір ноги ");
        System.out.println("2 - залишаємо як є ");
    }

    public static void choice() {
        System.out.println("виберіть персонажа якому хочете поміняти розмір ноги. від 1 до 4 ");// не буду пояснював сам розберешся
    }
    public static void displayMen(HashMap<String, String> men) {// короче ця штука приймає ключ-значення чоловіка n якого ми вкажемо і виведе всю інфу про нього

        for (Map.Entry<String, String> e : men.entrySet()) {// цикл forech який виводить всю інфу про користувача
            //ми тут присвоюємо значенню е змінну men і виводимо на екран
            System.out.println(e.getKey() + " = " + e.getValue());// getKey()-ключ , e.getValue()-значення яке заховано за ключем
        }
    }
}
