import java.util.Scanner;

public class Cycle extends Meens
{
    public static void WhileTrue(){// це база програми де відбуваються всі дії
        Scanner question = new Scanner(System.in);
        Men men = new Men(); // викликаємо клас мен для того що б проініціалізувався конструктор і записалися дані в нього

        while (true){//цик безкінечний, виходу нема, чому, бо так, я так захотів
        Helpers.outQuestion();//хелпер там все пише

        int num = question.nextInt();//змінна яка відповідає на питання хелпера

         if (num == 1)
         {
             Helpers.choiceFoot();//хелпер там все пише
             int mm  = question.nextInt();//змінна яка відповідає на питання хелпера

             switch (mm ){
                 case 1:
                     System.out.print("введіть розмір першого: ");//тут ми замінюємо розмір ноги персонажа якого виберемо вище
                     String foot1 = question.next();// створення та ініціалізація змінної
                     men.setFootMen1(foot1);//+ її до ключа-значення
                     break;
                 case 2:
                     System.out.print("введіть розмір другого: ");//то саме
                     String foot2 = question.next();
                     men.setFootMen2(foot2);
                     break;
                 case 3:
                     System.out.print("введіть розмір третьго: ");//то саме
                     String foot3 = question.next();
                     men.setFootMen3(foot3);
                     break;
                 case 4:
                     System.out.print("введіть розмір четвертого: ");//то саме
                     String foot4 = question.next();
                     men.setFootMen4(foot4);
                     break;
             }
         } else if (num == 2) {
             Helpers.choiceNameF();
             int kk = question.nextInt();
             switch (kk){
                 case 1:
                     System.out.println("new name :");// прейменовування імені
                     String name1 = question.next();
                     men.setNameMen1(name1);
                     break;
                 case 2:
                     System.out.println("new name :");
                     String name2 = question.next();
                     men.setNameMen2(name2);
                     break;
                 case 3:
                     System.out.println("new name :");
                     String name3 = question.next();
                     men.setNameMen3(name3);
                     break;
                 case 4:
                     System.out.println("new name :");
                     String name4 = question.next();
                     men.setNameMen4(name4);
                     break;
             }

         }
         else if( num == 3){
             Helpers.choiceNameL();
             int ff = question.nextInt();
             switch (ff){
                 case 1:
                     System.out.println("new lastName :");// перейменування прізвища, щоб Назарко не доєбався
                     String name1 = question.next();
                     men.setLastNameMen1(name1);
                     break;
                 case 2:
                     System.out.println("new lastName :");
                     String name2 = question.next();
                     men.setLastNameMen2(name2);
                     break;
                 case 3:
                     System.out.println("new lastName :");
                     String name3 = question.next();
                     men.setLastNameMen3(name3);
                     break;
                 case 4:
                     System.out.println("new lastName :");
                     String name4 = question.next();
                     men.setLastNameMen4(name4);
                     break;
             }
         } else if (num == 4) {
             Helpers.out();//хелпер
            Meens meens = new Meens();
             Helpers.displayMens(meens.getMens());// коротко воно виводить всіх зареганих чоловіків і їх дані 3 тирів по типу
             // чоловік =  {імя, дупа, розмір ноги} о так  воно буду виводити дроти доки не закінчаться всі чоловіки "базі даних"
             // розписав в хелпері
             Helpers.out();//хелпер


         }
    }



    }
}


