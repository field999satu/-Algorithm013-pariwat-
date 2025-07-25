import java.util.Scanner;

public class VariablesExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1.1 กรอกขนาดเสื้อผ้า
        System.out.print("Enter clothing size (s, m, l): ");
        char clothingSize = input.next().charAt(0);

        // 1.2 กรอกจำนวนคนเข้าเว็บไซต์
        System.out.print("Enter number of website visitors: ");
        int websiteVisitors = input.nextInt();

        // 1.3 กรอกเกรดของนักศึกษา
        System.out.print("Enter student grade (A, B, C, D, E): ");
        char studentGrade = input.next().charAt(0);

        // 1.4 กรอกเกรดเฉลี่ยของนักศึกษา
        System.out.print("Enter student GPA: ");
        double studentGPA = input.nextDouble();

        // 1.5 ค่าคงที่ของ Pi
        final double PI = 3.14159;

        // 1.6 กรอกค่าใช้จ่ายรายปี
        System.out.print("Enter annual expenses: ");
        float annualExpenses = input.nextFloat();

        // 1.7 ค่าคงที่จำนวนเดือนในหนึ่งปี
        final int MONTHS_IN_YEAR = 12;

        // แสดงผลลัพธ์
        System.out.println("\n--- Output ---");
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors: " + websiteVisitors);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Value of PI: " + PI);
        System.out.println("Annual Expenses: " + annualExpenses);
        System.out.println("Months in a Year: " + MONTHS_IN_YEAR);

        input.close(); // ปิด Scanner
    }
}
