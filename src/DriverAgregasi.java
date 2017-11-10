public class DriverAgregasi {
    public static void main(String[] args) {
        Barang b = new Barang("Pepsodent ", " 1001", " Expired");
        Barang ba = new Barang("Mie Instant ", " 6969", " Busuk");
        Barang bb = new Barang("Sabun ", " 1002", " Bagus");

        Customer c = new Customer(" Hafidz Jays", " Islam", " Laki");

        c.tambahBarang(b);
        c.tambahBarang(ba);
        c.tambahBarang(bb);

        c.tampilkan();

    }
}
