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



}
