public class Bai4 {
//    Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.
public static void main(String[] args) {
    double a = 15;
    double KhaiCan = Math.sqrt(a);
    double LamTron = Math.round(KhaiCan * 1000.0)/1000.0;

    System.out.println(KhaiCan);
    System.out.println(LamTron);


}
}
