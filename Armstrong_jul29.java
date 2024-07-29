import java.util.Scanner;
public class Armstrong_jul29 {
    public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter first number of the range: ");
        int num1=myObj.nextInt();
        System.out.println("Enter second number of the range: ");
        int num2=myObj.nextInt();
        for(int i=num1; i<=num2; i++){
            int q=i/10;
            int r=i%10;
            int sum=r*r*r;
            while(q!=0){
                r=q%10;
                q=q/10;
                sum+=r*r*r;
            }
            if(sum==i){
                System.out.println(i+" is a armstrong number");
            }
        }
    }
}
