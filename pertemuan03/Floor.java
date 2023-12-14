public class Floor {
    public static void main(String[] args) {

        // Data diri
        String nama = "Muhammad Zaidan Ramdhan";
        String NIM = "0110222040";
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + NIM);

        // Praktikum
        int floor = 14;

        if (floor == 13) {
            System.out.println("tidak ada tombol lantai " + floor);
        } else {
            System.out.println("kamu menekan tombol lantai\t: " + floor);
        }

        if (floor >= 13) {
            System.out.println("Sekarang kamu berada di lantai\t: " + (floor - 1));
        } else {
            System.out.println("Sekarang kamu berada di lantai\t: " + floor);
        }

        
    }
}













// int floor = 14;

// if (floor >= 13) {
// System.out.println("kamu berada di lantai : " + (floor - 1));
// } else {
// System.out.println("kamu berada di lantai : " + floor);
// }
// for (int floor = 1; floor <= 20; floor++) {
    
// if (floor == 13) {
// System.out.println("tidak ada lantai " + floor);

// } else {
// System.out.println("kamu menekan tombol lantai : " + floor);
// }

// if (floor >= 13) {
// System.out.println("kamu berada di lantai : " + (floor - 1));
// System.out.println("\n");
// } else {
// System.out.println("kamu berada di lantai : " + floor);
// System.out.println("\n");
// }

// }