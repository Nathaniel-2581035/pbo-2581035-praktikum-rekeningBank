public class rekening {
        private String nomor;
        private String pemilik;
        private int saldo;

        public rekening (String nomor, String pemilik, int saldo) {
                this.nomor = nomor;
                this.pemilik = pemilik;
                this.saldo = saldo;
        }
        public int getSaldo () {
                return saldo;
        }
        public boolean setor(int jumlah) {
                return (jumlah <= 0) {
                        return false;
                } if (jumlah + saldo);
                return true;
        }
}

