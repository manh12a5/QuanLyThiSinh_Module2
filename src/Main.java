import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerStudent managerStudent = new ManagerStudent();

    public static void main(String[] args) {
        System.out.println("____ Thông tin thí sinh ____");
        byte choice;
        do {
            listStudent();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    managerStudent.addNewStudent();
                    break;
                case 2:
                    //Display
                    managerStudent.checkClass();
                    break;
                case 3:
                    //Search
                    managerStudent.searchID();
                    break;
            }
        } while (choice != 0);
    }

    private static void listStudent() {
        System.out.println("1. Nhập thông tin thí sinh");
        System.out.println("2. Hiển thị thí sinh");
        System.out.println("3. Tìm kiếm");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

}
