import java.time.LocalDate;

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
