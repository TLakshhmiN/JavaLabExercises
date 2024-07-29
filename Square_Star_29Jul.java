import java.util.Scanner;
public class Square_Star_29Jul {
    public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the length of side of square: ");
        int num=myObj.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}