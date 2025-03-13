import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. List - Menyimpan daftar member teater
        List<String> memberTeater = List.of("Christy", "Erine", "Freya", "Gita", "Olline");
        System.out.println("🎤 Member yang tampil di teater hari ini: " + memberTeater);
        System.out.println("\n⏳ Teater dimulai pada pukul 19:00 WIB.\n");

        // 2. Map - Menyimpan daftar tiket dengan pasangan (Nama, Kursi)
        Map<String, String> daftarTiket = new HashMap<>();
        daftarTiket.put("Andi", "A1");
        daftarTiket.put("Budi", "A2");
        daftarTiket.put("Citra", "A3");
        daftarTiket.put("Dika", "A4");
        daftarTiket.put("Eka", "A5");
        daftarTiket.put("Deni", "A6");
        daftarTiket.put("Fajar", "A7");
        daftarTiket.put("Elisa", "A8");

        System.out.println("🎟️ Daftar Tiket yang telah dibeli:");
        for (Map.Entry<String, String> tiket : daftarTiket.entrySet()) {
            System.out.println(tiket.getKey() + " | Kursi: " + tiket.getValue());
        }

        System.out.println("\n🎭 Teater telah selesai pada pukul 21:00 WIB.\n");

        // 3. Queue - Menyimpan antrean pembelian merchandise
        Queue<String> antreanMerchandise = new LinkedList<>();
        antreanMerchandise.add("Deni");

        System.out.println("🛍️ Sedang berlangsung: Pembelian merchandise.");
        while (!antreanMerchandise.isEmpty()) {
            String pembeli = antreanMerchandise.poll();
            System.out.println(pembeli + " sedang membeli merchandise.");
            System.out.println("✅ " + pembeli + " telah selesai membeli merchandise.\n");
        }

        // 4. Set - Menyimpan peserta tanda tangan (menghindari duplikasi)
        Set<String> sesiTandaTangan = new HashSet<>();
        sesiTandaTangan.add("Elisa");
        sesiTandaTangan.add("Fajar");

        System.out.println("✍️ Sedang berlangsung: Sesi tanda tangan.");
        for (String peserta : sesiTandaTangan) {
            System.out.println(peserta + " sedang meminta tanda tangan.");
        }
        for (String peserta : sesiTandaTangan) {
            System.out.println("✅ " + peserta + " telah selesai meminta tanda tangan.");
        }
        System.out.println();

        // 5. Deque - Menyimpan antrean photoshoot
        Deque<String> antreanPhotoshoot = new ArrayDeque<>();
        antreanPhotoshoot.add("Andi");
        antreanPhotoshoot.add("Budi");
        antreanPhotoshoot.add("Citra");
        antreanPhotoshoot.add("Dika");
        antreanPhotoshoot.add("Eka");

        // 6. SortedMap - Menyimpan pasangan photoshoot dengan urutan nama
        SortedMap<String, String> sesiPhotoshoot = new TreeMap<>();
        sesiPhotoshoot.put("Andi", "Christy");
        sesiPhotoshoot.put("Budi", "Erine");
        sesiPhotoshoot.put("Citra", "Freya");
        sesiPhotoshoot.put("Dika", "Gita");
        sesiPhotoshoot.put("Eka", "Olline");

        System.out.println("📸 Sedang berlangsung: Photoshoot dengan member.");
        while (!antreanPhotoshoot.isEmpty()) {
            String peserta = antreanPhotoshoot.poll();
            System.out.println(peserta + " sedang photoshoot dengan " + sesiPhotoshoot.get(peserta));
        }

        System.out.println("\n📸 Photoshoot telah selesai pada pukul 22:00 WIB.");
    }
}
