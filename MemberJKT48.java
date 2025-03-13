import java.util.List;

public class MemberJKT48 {
    private final List<String> daftarMember;

    public MemberJKT48(List<String> daftarMember) {
        this.daftarMember = daftarMember;
    }

    public List<String> getDaftarMember() {
        return daftarMember;
    }

    public void tampilkanMember() {
        System.out.println("\n🎤 Member yang tampil di teater hari ini: " + daftarMember);
    }
}
