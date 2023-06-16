import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cycle extends Register
{
    public  void  cyclyWhileTrue()
    {

     while (true)
    {
        Scanner question = new Scanner(System.in);
        Helpers helpers = new Helpers();

        helpers.outQuestion();
        int num= question.nextInt();

        if (num == 1 ){
            helpers.choice();
            Scanner choicePerson = new Scanner(System.in);
            int numPerson = choicePerson.nextInt();

            if (numPerson ==1)
            {
                Scanner menChoice = new Scanner(System.in);

                HashMap<String, String> men1 = new HashMap<>();
                System.out.print("foot size : ");
                Integer reElected = Integer.valueOf(menChoice.nextLine());
                men1.put("footSize", String.valueOf(reElected));

                for (Map.Entry<String,String>e: men1.entrySet()){
                    System.out.println(e.getKey() +" = "+ e.getValue());
                }


            }
//            if (numPerson ==2)
//            {
//
//            }
//            if (numPerson ==3)
//            {
//
//            }
//            if (numPerson ==4)
//            {
//
//            }
        }
        if (num == 2){
        Register register = new Register();

            HashMap<Object, Object> men1 =new HashMap<>();
            for (Map.Entry<Object, Object> e: men1.entrySet()){
                // виводимо ключ і значення, розділяючи їх знаком рівності
                System.out.println(e.getKey() +" = "+ e.getValue());
            }




            System.err.println("dfdfdfdfddddddf__________________________________________________________________________");
            System.err.println("dfdfdfdfddddddf__________________________________________________________________________");
            System.err.println("dfdfdfdfddddddf__________________________________________________________________________");
            System.err.println("dfdfdfdfddddddf__________________________________________________________________________");

        }
    }
    }









}
