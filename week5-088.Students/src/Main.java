
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String name, studentNumber, search;
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.println("name:");
            name = reader.nextLine();
            if(name.isEmpty()){
                for(int i = 0; i < list.size(); i++){
                    System.out.println(list.get(i));
                }
                break;
            }
            System.out.println("studentnumber: ");
            studentNumber = reader.nextLine();
            Student newStudent = new Student(name, studentNumber);
            list.add(newStudent);
        }
        
        System.out.println("Give search term: ");
        search = reader.nextLine();
        System.out.println("Result: ");
        for (Student st : list){
            if (st.toString().contains(search)){
                System.out.println(st);
            }
        }
        
    }
}
