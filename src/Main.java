import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("do you have a account yes or no");
        String account = Scanner.nextLine();
        if(account.equals("yes")){
            System.out.print("enter user name");
            String user1 =Scanner.nextLine();
            System.out.println("enter password");
            String pass1 =Scanner.nextLine();
            Login.login(String user1,String pass1);
            if (found ==true){
                System.out.println("successfully logged");
            } else{
                System.out.println("incorrect loggins");
            }
        } else if (account.equals("no")) {
            String name =Scanner.nextLine();
            String password =Scanner.nextLine();
            Login.sign_up(String name,String password);


        }


    }
}



