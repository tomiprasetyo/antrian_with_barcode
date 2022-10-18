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
