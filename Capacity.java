public class Capacity {
    public static void main(String[] args){
    StringBuffer sb= new StringBuffer("Hello");
    System.out.println(sb.capacity());
    sb.append("Hello");
    System.out.println(sb.capacity());
    sb.append("Java is my favourite language");
    System.out.println(sb.capacity());
    sb.ensureCapacity(10);
    System.out.println(sb.capacity());
    sb.ensureCapacity(50);
    System.out.println(sb.capacity());
    }
}
