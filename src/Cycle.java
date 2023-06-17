import java.util.Scanner;

public class Cycle
{
    public static void WhileTrue(){// це база програми де відбуваються всі дії
        Scanner question = new Scanner(System.in);
        Men men = new Men(); // викликаємо клас мен для того що б проініціалізувався конструктор і записалися дані в нього

        while (true){//цик безкінечний, виходу нема, чому, бо так, я так захотів
        Helpers.outQuestion();//хелпер там все пише
        int num = question.nextInt();//змінна яка відповідає на питання хелпера
         if (num ==1)
         {
             Helpers.choice();//хелпер там все пише
             int mm = question.nextInt();//змінна яка відповідає на питання хелпера

             if (mm == 1)
             {
                 System.out.print("введіть розмір першого: ");//тут ми замінюємо розмір ноги персонажа якого виберемо вище
                 String foot = question.next();// створення та ініціалізація змінної
                 men.setFootMen1(foot);//+ її до ключа-значення

             }
             if (mm==2)
             {
                 System.out.print("введіть розмір другого: ");//то саме
                 String foot = question.next();
                 men.setFootMen2(foot);
             }
             if (mm==3)
             {
                 System.out.print("введіть розмір третьго: ");//то саме
                 String foot = question.next();
                 men.setFootMen3(foot);
             }
             if (mm==4)
             {
                 System.out.print("введіть розмір четвертого: ");//то саме
                 String foot = question.next();
                 men.setFootMen4(foot);
             }
         }
         if (num==2)//якщо ви вибрали це тут виводиться інфа про всіх учасників
         {
             Helpers.displayMen(men.getMen1());// класна штука через те що метод в хелпері статичний мим можемо його викликати без
             // ініціалізації цілого класу, а він ту виконує дію яку я розписав в хелпері
             //коротко записуєш значення чоловіка якого ти хочеш вивести іт циклом воно тобі виводить всю інфу
             Helpers.out();//хелпер
             Helpers.displayMen(men.getMen2());
             Helpers.out();
             Helpers.displayMen(men.getMen3());
             Helpers.out();
             Helpers.displayMen(men.getMen4());
             Helpers.out();
         }

    }
    }














}
