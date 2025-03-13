public class Tiket {
    private String namaPemesan;
    private String nomorKursi;

    public Tiket(String namaPemesan, String nomorKursi) {
        this.namaPemesan = namaPemesan;
        this.nomorKursi = nomorKursi;
    }

    public void cetakTiket() {
        System.out.println("🎟️ Tiket: " + namaPemesan + " - Kursi: " + nomorKursi);
    }
}
