import java.util.Scanner;

public class Exercise_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.nextLine();
        System.out.print("Enter p: ");
        String p = sc.nextLine();

        int[] pF = new int[256];
        int[] sF = new int[256];
        int st = 0, minSt = -1, minL = Integer.MAX_VALUE;
        int cnt = 0, tCnt = 0;
        
        for (char ch : p.toCharArray()) {
            if (pF[ch] == 0) tCnt++;
            pF[ch]++;
        }
        
        for (int en = 0; en < s.length(); en++) {
            char ch = s.charAt(en);
            sF[ch]++;
            
            if (sF[ch] == pF[ch]) {
                cnt++;
            }
            
            if (cnt == tCnt) {
                while (st <= en && cnt == tCnt) {
                    if (en - st + 1 < minL) {
                        minL = en - st + 1;
                        minSt = st;
                    }
                    
                    char sCh = s.charAt(st);
                    sF[sCh]--;
                    if (sF[sCh] < pF[sCh]) {
                        cnt--;
                    }
                    st++;
                }
            }
        }
        
        if (minSt != -1) {
            System.out.println("Smallest substring: " + s.substring(minSt, minSt + minL));
        }
    }
}
