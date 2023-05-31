public class Bai5 {
//    Bài 5: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân.
public static void main(String[] args) {
    double a = 10;
    double b = 3;
    double thuong = a/b;
    double LamTron = Math.round(thuong * 1000.0)/1000.0;;

    System.out.println(LamTron);
}

}
