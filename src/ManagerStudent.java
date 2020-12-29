import Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent {

    //Danh sách thuộc tính
    List<Student> arrStudent = new ArrayList<>();

    //Danh sách phương thức
    public void addNewStudent() {
        Student student = new Student();
        student.addNewStudent();
        arrStudent.add(student);
    }

    public void searchID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập MSV cần tìm kiếm: ");
        int numberID = scanner.nextInt();
        byte count = 0;
        for (int i = 0; i < arrStudent.size(); i++) {
            if (numberID == arrStudent.get(i).getNumberID()) {
                System.out.println(arrStudent.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
            System.out.print("\n");
        }
    }

    public void checkClass() {
        byte count = 0;
        for (int i = 0; i < arrStudent.size(); i++) {
            if (arrStudent.get(i).getGradeLevel().equals("A")
                    || arrStudent.get(i).getGradeLevel().equals("a")) {
                System.out.println(arrStudent.get(i));
                count++;
            } else if (arrStudent.get(i).getGradeLevel().equals("B")
                    || arrStudent.get(i).getGradeLevel().equals("b")) {
                System.out.println(arrStudent.get(i));
                count++;
            } else if (arrStudent.get(i).getGradeLevel().equals("C")
                    || arrStudent.get(i).getGradeLevel().equals("c")) {
                System.out.println(arrStudent.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có thí sinh");
            System.out.print("\n");
        }
    }

}
