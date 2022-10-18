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
