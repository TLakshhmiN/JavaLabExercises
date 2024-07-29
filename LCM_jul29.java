import java.util.Scanner;
public class LCM_jul29 {
    public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= myObj.nextInt();
        System.out.println("Enter the second number:");
        int num2= myObj.nextInt();
        int a=0, hcf=0, lcm=0;
        if(num1>num2){
            a=num2;
        }
        else{
            a=num1;
        }
        for(int i=2; i<=a; i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
                break;
            }
        }
        lcm=(num1 * num2)/hcf;
        System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm);
    }
}
