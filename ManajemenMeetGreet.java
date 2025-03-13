import java.util.List;

public class ManajemenMeetGreet {
    private List<String> peserta;

    public ManajemenMeetGreet(List<String> peserta) {
        this.peserta = peserta;
    }

    public void jalankanMeetGreet() {
        System.out.println("\n📸 Meet & Greet sedang berlangsung dengan peserta:");
        for (String nama : peserta) {
            System.out.println("- " + nama);
        }
    }
}
