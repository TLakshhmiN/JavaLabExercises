import java.util.StringTokenizer;
public class String_Tokenizer6 {
    public static void main(String[] args) {
        StringTokenizer st= new StringTokenizer("Hello Everyone Have a nice day "," ");
        while(st.hasMoreElements()){
            System.out.println("Total number of Tokens: "+st.nextElement());
        }
    }
}
