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
