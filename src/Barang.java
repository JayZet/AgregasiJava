public class Barang {
    private String nama_barang,kode_barang,kondisi;

    public Barang(String nm, String kd, String kn){
        this.nama_barang = nm;
        this.kode_barang = kd;
        this.kondisi = kn;

    }

    public String getNama_barang() {
        return nama_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getKondisi() {
        return kondisi;
    }
}
