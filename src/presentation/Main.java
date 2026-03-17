package presentation;

import profession.PatientManager;
import validateData.GetData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("\n=================MENU=================");
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Hiển thị ds");
            System.out.println("3. Tìm bệnh nhân theo tên");
            System.out.println("4. Xóa bệnh nhân");
            System.out.println("5. Thoát");
            System.out.println("=======================================");

            choice = GetData.getInteger(scanner,"Nhập lựa chọn : ");

            switch (choice) {
                case 1: {
                    PatientManager.addPatient(scanner);
                    break;
                }
                case 2: {
                    PatientManager.displayPatients();
                    break;
                }
                case 3: {
                    PatientManager.searchPatient(scanner);
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    System.out.println("Thoát chương trình");
                    break;
                }

                default: {
                    System.out.println("Ko hợp lệ");
                    break;
                }
            }
        }while(choice != 5);

        scanner.close();
    }
}
