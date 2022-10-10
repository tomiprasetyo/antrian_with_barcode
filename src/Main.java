import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        abstract class Karyawan {
            final String nama;
            final int nik;
            final String jabatan;

            Karyawan(String nama, int nik, String jabatan) {
                this.nama = nama;
                this.nik = nik;
                this.jabatan = jabatan;
            }

            public abstract void infoKaryawan();
        }



        interface Barcode {
            Random rand = new Random();

            int batasAngka = 99999;
            int angkaRandom = rand.nextInt(batasAngka);
        }

        interface Truk {
            public void merkTruk(String merk);
            public void kapasitasTruk(int kapasitas);
            public  void tujuanPengiriman(String tujuan);
        }


        class Driver extends Karyawan implements Barcode, Truk {

            Driver(String nama, int nik, String jabatan) {
                super(nama, nik, jabatan);
            }

            @Override
            public void infoKaryawan() {
                System.out.println(String.format("Karyawan dengan Nama: %s NIK: %s dan Jabatan: %s ", nama , nik , jabatan));
            }

            public void antri() {
                System.out.println("Driver sedang antri untuk muat");
            }

            public void daftarWithBarcode() {
                System.out.println("Driver mendaftar menggunakan barcode: " + angkaRandom);
            }

            public void timbangMuat() {
                System.out.println("Driver diarahkan untuk timbang muat");
            }

            public  void timbangIsi() {
                System.out.println("Driver diarahkan untuk timbang isi");
            }

            public void kirim(String tujuan) {
                System.out.println("Driver mengirim ke " + tujuan);
            }


            @Override
            public void merkTruk(String merk) {
                System.out.println("Merk Truk: " + merk);
            }

            @Override
            public void kapasitasTruk(int kapasitas) {
                System.out.println("Kapasitas: " + kapasitas);
            }

            @Override
            public void tujuanPengiriman(String tujuan) {
                System.out.println("Tujuan Pengiriman: "+ tujuan);
            }

        }

        class Security extends Karyawan {

            Security(String nama, int nik, String jabatan) {
                super(nama, nik, jabatan);
            }

            @Override
            public void infoKaryawan() {
                System.out.printf("Karyawan dengan Nama: %s, NIK: %s dan Jabatan: %s %n", nama , nik , jabatan);
            }

            public void verifikasiTruk() {
                System.out.println("Security memverifikasi truk  yang akan muat");
            }

            public void mengarahkanMuat() {
                System.out.println("Security mengarahkan driver untuk muat");
            }

        }

        class SuratJalan {
            private String noSO;
            private LocalDate tanggal;
            private String tujuanPengiriman;
            private int quantity;

            public String getNoSO() {
                return noSO;
            }

            public LocalDate getTanggal() {
                return tanggal;
            }

            public String getTujuanPengiriman() {
                return tujuanPengiriman;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setNoSO(String noSO) {
                this.noSO = noSO;
            }

            public void setTanggal(LocalDate tanggal) {
                this.tanggal = tanggal;
            }

            public void setTujuanPengiriman(String tujuanPengiriman) {
                this.tujuanPengiriman = tujuanPengiriman;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public void cetak() {
                System.out.println("Surat jalan berhasil dicetak dengan rincian sebagai berikut");
            }
        }

        class Admin extends Karyawan  {

            Admin(String nama, int nik, String jabatan) {
                super(nama, nik, jabatan);
            }

            @Override
            public void infoKaryawan() {
                System.out.printf("Karyawan dengan Nama: %s, NIK: %s dan Jabatan: %s %n", nama , nik , jabatan);
            }

            public void cetakSuratJalan() {
                System.out.printf("Admin %s berhasil mencetak surat jalan %n", nama);
            }

        }

        class Operator extends Karyawan {
            enum JenisMuatan {
                HSD,
                MFO,
                B30,
                FAME
            }

            Operator(String nama, int nik, String jabatan) {
                super(nama, nik, jabatan);
            }

            @Override
            public void infoKaryawan() {
                System.out.printf("Karyawan dengan Nama: %s, NIK: %s dan Jabatan: %s %n", nama , nik , jabatan);
            }

            public void muatB30() {
                System.out.printf("Operator %s memuat %s %n", nama, JenisMuatan.B30);
            }

            public  void bongkarHSD() {
                System.out.printf("Operator %s sedang membongkar %s %n", nama, JenisMuatan.HSD);
            }
        }

        Driver driver = new Driver("Tomi", 12345, "Driver");
        driver.infoKaryawan();
        driver.merkTruk("Hino");
        driver.kapasitasTruk(16000);
        driver.tujuanPengiriman("PT. ABC");
        driver.antri();
        driver.daftarWithBarcode();

        System.out.println("========================================");

        Security security = new Security("Aris", 112233, "Security");
        security.infoKaryawan();
        security.verifikasiTruk();

        System.out.println("========================================");

        driver.timbangMuat();

        System.out.println("========================================");

        Operator operator = new Operator("Yono", 223344, "Operator");
        operator.infoKaryawan();
        operator.muatB30();

        System.out.println("========================================");

        Admin admin = new Admin("Adit", 29876, "Admin");
        admin.infoKaryawan();
        admin.cetakSuratJalan();

        System.out.println("========================================");

        SuratJalan suratJalan = new SuratJalan();
        suratJalan.cetak();
        suratJalan.setNoSO("S12345");
        suratJalan.setTanggal(LocalDate.now());
        suratJalan.setTujuanPengiriman("PT. UBSI Kramat Raya");
        suratJalan.setQuantity(16000);

        System.out.println(suratJalan.getNoSO());
        System.out.println(suratJalan.getTanggal());
        System.out.println(suratJalan.getTujuanPengiriman());
        System.out.println(suratJalan.getQuantity());

        System.out.println("========================================");

        driver.timbangIsi();

        driver.kirim("PT. UBSI Kramat Raya");

    }
}



