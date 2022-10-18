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
