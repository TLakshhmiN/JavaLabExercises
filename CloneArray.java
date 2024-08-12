public class CloneArray {
    public static void main(String[] args){
        int[] arr={1,2,3};
        int CloneArray[] = arr.clone();
        System.out.println(arr==CloneArray);
        for(int i=0; i<CloneArray.length; i++){
            System.out.println(CloneArray[i]+" ");
        }
    }
}
