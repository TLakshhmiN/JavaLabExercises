import java.util.Scanner;

public class Exercise_Q1{
    public static void main(String[] args){
        Scanner myobj=new Scanner(System.in);
        System.out.print("Enter the no of buildings: ");
        int n=myobj.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Enter the height of building #%d: ", i + 1);
            arr[i]=myobj.nextInt();
        }
        int count=0, max=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                max++;
            }
            else if(arr[i]>arr[i+1]){
                if(max>count){
                    count=max;
                }
                max=0;
            }
            else{
                max=0;
            }
        }
        if(count<max){
            count=max;
        }
        System.out.println("Maximum number of consecutive steps: " + count);
    }
}