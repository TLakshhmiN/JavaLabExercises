class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String Name){
        this. roll_no=roll_no;
        this.name=Name;
    }
}

public class Array2 {
    public static void main(String[] args) {
        Student[] arr;
        arr= new Student[5];
        arr[0]=new Student(1,"Aman");
        arr[1]=new Student(20,"Rahul");
        arr[2]=new Student(25,"Adi");
        arr[3]=new Student(4, "Dharmekesh");
        arr[4]=new Student(5, "Mohit");
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at "+i+": "+arr[i].roll_no+" "+arr[i].name);
        }
    }
}
