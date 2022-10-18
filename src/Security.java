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
