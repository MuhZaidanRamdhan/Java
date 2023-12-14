
public class Hitung {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int y = 3;

        String nama = "Muhammad Zaidan Ramdhan";
        String nim = "0110222040";

        float aritmatika =(float)Math.sqrt((a * a + b * b) - (2 * a * b * Math.cos(y)));

        System.out.println("Nama \t: " + nama);
        System.out.println("nim \t: " + nim);
        System.out.println("hasil \t: " + aritmatika);
    }
}
