package validateData;

import java.util.Scanner;

public class GetData {
    public static int getInteger(Scanner scanner, String suggestion){
        int number;
        do {
            try {
                System.out.println(suggestion);
                number = Integer.parseInt(scanner.nextLine());
                return  number;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số nguyên");
            }

        } while(true);
    }

    public static double getDouble(Scanner scanner, String suggestion){
        double number;
        do {
            try {
                System.out.println(suggestion);
                number = Double.parseDouble(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số thực");
            }
        } while (true);
    }

    public static String getString(Scanner scanner, String suggestion){
        String input;
        do {
            try {
                System.out.println(suggestion);
                input = scanner.nextLine();
                if(input.trim().isEmpty()){
                    System.out.println("Ko đc để trống");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số nguyên");
            }
        }  while (true);
    }
}
