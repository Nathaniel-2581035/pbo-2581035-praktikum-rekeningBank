import java.util.Scanner;

public class Rekening {
    private String nomor;
    private String pemilik;
    private int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo = jumlah + saldo;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo = saldo - jumlah;
        return true;
    }

        public void cetakInfo() {
                System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
        }

        private String formatRupiah(int angka) {
                String digit = String.valueOf(angka);
                String hasil = "";
                int hitung = 0;
                for (int i = digit.length() - 1; i >= 0; i--) {
                        hasil = digit.charAt(i) + hasil;
                        hitung++;
                        if (hitung % 3 == 0 && i > 0) {
                                hasil = "." + hasil;
                        }
                }
                return "Rp" + hasil;
        }

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
}


