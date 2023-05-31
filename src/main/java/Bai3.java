public class Bai3 {
    //    Bài 3: Tìm số lớn nhất trong 4 số biết trước.
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        int d = 12;

        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        System.out.println("so lon nhat la: " + max);

    }
    }
