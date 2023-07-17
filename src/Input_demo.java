import java.util.Scanner;

public class Input_demo {
    public static void main(String[] args) {
        // Nhập dữ liệu mã sinh viên từ bàn phím và lưu vào biến studentId
        //1. Khởi tạo đối tượng Scanner từ lớp java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập
        System.out.println("Nhập vào mã sinh viên");
        //3. Nhận giá trị từ bàn phím và lưu vào biến studentId
        //scanner.nextLine(): lấy chuỗi giá trị nhập vào từ bàn phím
        String studentId = scanner.nextLine();
        // Nhập dữ liệu tên sinh viên từ bàn phím
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
        //int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        //Nhập vào điểm trung bình của sinh viên
        System.out.println("Nhập vào điểm trung bình của sinh viên: ");
        //float avgMark = scanner.nextFloat();
        float avgMark = Float.parseFloat(scanner.nextLine());
        //Cách 1
        //scanner.nextLine();
        //Nhập vào địa chỉ của sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên");
        String address = scanner.nextLine();
        //Nhập vào giới tính của sinh viên biết giới tính nhận 1 trong 2 giá trị là F hoặc M
        //char sex = 'F';
        System.out.println("Nhập vào giới tính sinh viên");
        char sex = scanner.nextLine().charAt(0);
        //In thông tin mã sinh viên
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: "+age);
        System.out.println("Điểm trung bình: "+avgMark);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Giới tính: "+sex);
    }
}
