public class MultidimensionCloning {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5}};
        int cloneArray[][]=array.clone();
        System.out.println(array==cloneArray);
        System.out.println(array[0]==cloneArray[0]);
        System.out.println(array[1]==cloneArray[1]);
    }
}
