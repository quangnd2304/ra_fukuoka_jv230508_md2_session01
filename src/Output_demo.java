public class Output_demo {
    public static void main(String[] args) {
        //Khai báo và khởi tạo giá trị mã sinh viên, in giá trị mã sinh viên ra màn hình console
        //1. Khai báo và khởi tạo giá trị biến mã sinh viên
        String studentId = "SV001";
        //2. In giá trị biến studentId ra màn hình console, và sau khi in xuống dòng
        System.out.println("Giá trị biến studentId:" + studentId);
        //Khai báo và khởi tạo giá trị tên sinh viên và in giá trị tên sinh viên ra màn hình console
        //1. Khai báo và khởi tạo giá trị biến tên sinh viên
        String studentName = "Nguyễn Văn A";
        //2. In giá trị biến studentName ra màn hình console, không xuống dòng
        System.out.print("Giá trị biến studentName: " + studentName);
        //Sử dụng System.out.printf để điều khiển xuống dòng
        System.out.printf("\n");
        //In có định dạng
        int age = 25;
        float mark = 8.7F;
        boolean sex = false;
        //In ra thông tin sinh viên gồm mã sinh viên, tên sinh viên, tuổi, điểm, giới tính
        System.out.printf("Mã sinh viên: %s, Tên sinh viên: %s, Tuổi: %d, Điểm: %f, Giới tính: %b\n", studentId, studentName, age, mark, sex);
        /*
        * Bài tập 1: Khai báo và khởi tạo giá trị cho sách gồm các thông tin: Mã sách - String,
        * tên sách - String, giá nhập - float, giá xuất - float, tác giả : String, trạng thái - boolean
        * In thông tin mã sách bằng câu lệnh System.out.println()
        * In thông tin tên sách bằng câu lệnh System.out.print()
        * Xuống dòng với printf
        * In thông tin sách gồm giá nhập, giá xuất, tác giả, trạng thái bằng câu lệnh printf
        * */
        System.err.println("Có lỗi trong quá trình thực hiện");
    }
}
