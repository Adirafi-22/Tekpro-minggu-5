import java.util.List;

public class ManajemenTiket {
    private List<Tiket> daftarTiket;

    public ManajemenTiket(List<Tiket> daftarTiket) {
        this.daftarTiket = daftarTiket;
    }

    public void cetakSemuaTiket() {
        System.out.println("\n📄 Daftar Tiket:");
        for (Tiket tiket : daftarTiket) {
            tiket.cetakTiket();
        }
    }
}
