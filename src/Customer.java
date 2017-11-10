public class Customer {
    private String namacust, agama, jenis_kelamin;

    private Barang[] brg = new Barang[10];

    public Customer(String ncs, String ag, String jk){
        this.namacust = ncs;
        this.agama = ag;
        this.jenis_kelamin = jk;


    }

    private static int JmlBar = 0;
    public void tambahBarang(Barang br){
        this.brg[JmlBar] = br;
        Customer.JmlBar++;

    }

    public void tampilkan(){
        int x;
        System.out.println("Nama Customer -> " + this.namacust);
        System.out.println("Agama -> " + this.agama);
        System.out.println("Jenis Kelamin -> " + this.jenis_kelamin);

        System.out.println("Dafatar Barang yang di beli: ");

        for(x = 0; x<JmlBar;x++){
            System.out.println("Nama Barang -> " + brg[x].getNama_barang());
            System.out.println("Kode Barang -> " + brg[x].getKode_barang());
            System.out.println("Kondisi Barang -> " + brg[x].getKondisi());
        }

    }
}
