import java.util.List;

public class Event {
    private final String namaEvent;
    private final String waktuMulai;
    private final String waktuSelesai;

    public Event(String namaEvent, String waktuMulai, String waktuSelesai) {
        this.namaEvent = namaEvent;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
    }

    public void tampilkanTeater(List<String> anggota) {
        System.out.println("\n🎤 Member yang tampil di teater hari ini: " + anggota);
        System.out.println("\n⏳ Teater dimulai pada pukul " + waktuMulai + " WIB.");
        System.out.println("\n🎭 Teater telah selesai pada pukul " + waktuSelesai + " WIB.");
    }

    public void prosesPembelian(Pembeli pembeli) {
        System.out.println("\n🛍️ Sedang berlangsung: " + pembeli.event());
        System.out.println("🛍️ " + pembeli.nama() + " sedang membeli merchandise.");
        System.out.println("✅ " + pembeli.nama() + " telah selesai membeli merchandise.");
    }

    public void sesiTandaTangan(List<Pembeli> pembeliList) {
        System.out.println("\n✍️ Sedang berlangsung: Sesi tanda tangan.");
        for (Pembeli p : pembeliList) {
            System.out.println("✍️ " + p.nama() + " sedang meminta tanda tangan.");
        }
        for (Pembeli p : pembeliList) {
            System.out.println("✅ " + p.nama() + " telah selesai meminta tanda tangan.");
        }
    }
}
