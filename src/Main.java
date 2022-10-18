import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // IMPLEMENTASI
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



