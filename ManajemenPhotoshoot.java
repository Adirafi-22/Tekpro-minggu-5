import java.util.List;

public class ManajemenPhotoshoot {
    public void prosesPhotoshoot(List<String> pembeli, List<String> member) {
        System.out.println("\n📸 Sedang berlangsung: Photoshoot dengan member.");
        for (int i = 0; i < pembeli.size(); i++) {
            System.out.println("📸 " + pembeli.get(i) + " sedang photoshoot dengan " + member.get(i));
        }
        System.out.println("\n📸 Photoshoot telah selesai pada pukul 22:00 WIB.");
    }
}
