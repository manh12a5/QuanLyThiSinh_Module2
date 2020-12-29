package Student;

import java.util.Scanner;

public class Student {

    //Danh sách thuộc tính
    private int numberID;
    private String name;
    private String adress;
    private String priorityArea;
    private String gradeLevel;

    //Danh sách phương thức
    public Student() {
    }

    public Student(int numberID, String name, String adress, String priorityArea, String gradeLevel) {
        this.numberID = numberID;
        this.name = name;
        this.adress = adress;
        this.priorityArea = priorityArea;
        this.gradeLevel = gradeLevel;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPriorityArea() {
        return priorityArea;
    }

    public boolean setPriorityArea(String priorityArea) {
        if (priorityArea.equals("Có") || priorityArea.equals("Không")
                || priorityArea.equals("có") || priorityArea.equals("không")) {
            this.priorityArea = priorityArea;
            return true;
        } else {
            return false;
        }
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        do {
            System.out.println("Nhập mã sinh viên: ");
            numberID = scanner.nextInt();
        } while (numberID < 0);
        System.out.println("Nhập tên sinh viên: ");
        name = scanner1.nextLine();
        System.out.println("Nhập địa chỉ: ");
        adress = scanner2.nextLine();
        while (true) {
            System.out.println("Sinh viên thuộc diện ưu tiên khu vực không? (Có/Không): ");
            priorityArea = scanner1.nextLine();
            if (setPriorityArea(priorityArea)) {
                break;
            }
        }
        System.out.println("Nhập khối thi: ");
        gradeLevel = scanner2.nextLine();
    }

    @Override
    public String toString() {
        if (gradeLevel.equals("A") || gradeLevel.equals("a")) {
            return getString() + "\n" +
                    "Thí sinh thuộc khối A thi môn: Toán, Lý, Hóa";
        } else if (gradeLevel.equals("B") || gradeLevel.equals("b")) {
            return getString() + "\n" +
                    "Thí sinh thuộc khối B thi môn: Toán, Hóa, Sinh";
        } else if (gradeLevel.equals("C") || gradeLevel.equals("c")) {
            System.out.println("Thí sinh thuộc khối A thi môn: Văn, Sử, Địa");
            return getString() + "\n" +
                    "Thí sinh thuộc khối C thi môn: Văn, Sử, Địa";
        } else {
            return "Không có thí sinh";
        }
    }

    private String getString() {
        return "---- Thông tin sinh viên ----" + "\n" +
                "Mã sinh viên: " + numberID + "\n" +
                "Tên sinh viên: " + name + "\n" +
                "Địa chỉ: " + adress + "\n" +
                "Diện ưu tiên khu vực: " + priorityArea + " ưu tiên ";
    }

}
