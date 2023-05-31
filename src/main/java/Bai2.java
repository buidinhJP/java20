public class Bai2 {
    public static void main(String[] args) {
//        Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.
        int r=3;
        double cv;
        cv = 2 * Math.PI * r;
        double dt = Math.PI * r * r;

        System.out.println("Chu vi hinh tron : " + cv);
        System.out.println("Dien tich hinh trong :" +dt);

    }
}
