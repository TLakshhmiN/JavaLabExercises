import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int X=1;
        while(X==1){
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 for Modulus");
            System.out.println("6 to Exit");
            System.out.println("Enter your choice from the list below");
            int choice = myObj.nextInt();
            if(choice==6){
                X=0;
                break;
            }
            System.out.println("Enter no 1:");
            float num1 = myObj.nextFloat();
            System.out.println("Enter no 2:");
            float num2 = myObj.nextFloat();
            float res;
            switch(choice){
                case 1:
                res=num1+num2;
                System.out.println("The addition of two numbers is "+res);
                break;
                case 2:
                res=num1-num2;
                System.out.println("The subtraction of two numbers is "+res);
                break;
                case 3:
                res=num1*num2;
                System.out.println("The multiplication of two numbers is "+res);
                break;
                case 4:
                res=num1/num2;
                System.out.println("The division of two numbers is "+res);
                break;
                case 5:
                res=num1%num2;
                System.out.println("The modulus of two numbers is "+res);
                break;
                default:
                System.out.println("The entered choice is invalid");
                continue;
            }
        }
    }
}