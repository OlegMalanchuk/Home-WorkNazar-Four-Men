import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cycle extends Register
{
    public  void  cyclyWhileTrue()
    {

     while (true) {
         Scanner question = new Scanner(System.in);
         Helpers helpers = new Helpers();
         Register register =new Register();
         Men men = new Men();

         helpers.outQuestion();
         int num = question.nextInt();


         if (num == 1) {
             helpers.choice();
             Scanner choicePerson1 = new Scanner(System.in);
             int numPerson ;
             numPerson = choicePerson1.nextInt();
             if (numPerson == 1) {
                 System.out.print("введіть розмір першого: ");
                 String foot = question.next();
                 men.setFootMen1(foot);


             }
             if (numPerson == 2 ){
                 System.out.print("введіть розмір другого: ");
                 String foot = question.next();
                 men.setFootMen2(foot);
             }
             if (numPerson == 3 ){
                 System.out.print("введіть розмір третьго: ");
                 String foot = question.next();
                 men.setFootMen3(foot);

             }
             if (numPerson == 4 ){
                 System.out.print("введіть розмір четвертого: ");
                 String foot = question.next();
                 men.setFootMen4(foot);
             }
         }
         if (num == 2) {
           Helpers.displayMen(men.getMen1());
           Helpers.displayMen(men.getMen2());
           Helpers.displayMen(men.getMen3());
           Helpers.displayMen(men.getMen4());


             System.out.println("  r   ");


         }
     }
    }









}
