public class ManajemenMerchandise {
    private final String pembeli;

    public ManajemenMerchandise(String pembeli) {
        this.pembeli = pembeli;
    }

    public void beliMerch() {
        System.out.println("\n🛍️ Sedang berlangsung: Pembelian merchandise.");
        System.out.println("🛍️ " + pembeli + " sedang membeli merchandise.");
        System.out.println("✅ " + pembeli + " telah selesai membeli merchandise.");
    }
}
