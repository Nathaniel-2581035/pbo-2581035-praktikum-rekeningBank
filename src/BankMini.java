import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rekening rekening = new Rekening("001", "Ani", 100000);

        int pilihan;
        do {
            System.out.println("\n=== BANK MINI ===");
            System.out.println("1. Setor");
            System.out.println("2. Tarik");
            System.out.println("3. Info");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Jumlah setor: ");
                int jumlah = input.nextInt();
                if (rekening.setor(jumlah)) {
                    System.out.println("Setor berhasil.");
                } else {
                    System.out.println("Setor ditolak.");
                }
            } else if (pilihan == 2) {
                System.out.print("Jumlah tarik: ");
                int jumlah = input.nextInt();
                if (rekening.tarik(jumlah)) {
                    System.out.println("Tarik berhasil.");
                } else {
                    System.out.println("Tarik ditolak.");
                }
            } else if (pilihan == 3) {
                rekening.cetakInfo();
            } else if (pilihan != 0) {
                System.out.println("Menu tidak dikenal");
            }
        } while (pilihan != 0);
    }
}