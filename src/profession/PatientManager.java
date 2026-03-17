package profession;

import model.Patient;
import validateData.GetData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PatientManager {
    public static List<Patient> patients = new ArrayList<>();

    public static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("Ko có bệnh nhân nào");
        }else {
            System.out.println("====================LIST PATIENT======================");
            for (int i = 0 ; i < patients.size() ; i++){
                patients.get(i).displayData();
            }
        }
    }

    public static void addPatient(Scanner scanner) {
        Patient newPatient = new Patient();
        newPatient.inputData(scanner);
        patients.add(newPatient);
        System.out.println("Thêm bệnh nhân thành công");
    }

    public static void searchPatient(Scanner scanner) {
        int flag = 0;
        String name = GetData.getString(scanner, "Nhập tên bệnh nhân cần tìm kiếm");
        for(int i = 0 ; i < patients.size() ; i++){
            if (patients.get(i).getName().contains(name)){
                System.out.println("\n");
                flag++;
                System.out.println("-------------------------------------------------------------------------------------");
                patients.get(i).displayData();
                break;
            }

        }
        if (flag == 0){
            System.out.println("Không tìm thấy bệnh nhân");
        }
    }

    public static void deletePatient(Scanner scanner) {
        int flag = 0;

    }
}
