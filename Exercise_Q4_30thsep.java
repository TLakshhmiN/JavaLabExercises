import java.util.Scanner;

public class Exercise_Q4 {
    private static int[] missrepeat(int[] arr) {
        int n = arr.length;
        boolean[] seen = new boolean[n + 1];
        int rep = -1, mis = -1;

        for (int num : arr) {
            if (seen[num]) {
                rep = num;
            } else {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                mis = i;
                break;
            }
        }

        return new int[]{rep, mis};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element #%d: ", i);
            arr[i] = sc.nextInt();
        }
        
        int[] result = missrepeat(arr);
        System.out.printf("Repeating number: %d ; Missing number: %d", result[0], result[1]);
    }
}
