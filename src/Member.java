import java.util.ArrayList;

public class Member {
    private String idMember;
    private String nama;

    private ArrayList<Buku> daftarBuku;

    public Member(String idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);

        System.out.println(
                nama + " meminjam buku: " + buku.getJudul());
    }

    public void tampilkanBuku() {
        System.out.println(
                "\nDaftar buku yang dipinjam oleh " + nama + ":");

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
            return;
        }

        for (Buku buku : daftarBuku) {
            System.out.println(
                    "- " + buku.getJudul()
                            + " (" + buku.getGenre().getNamaGenre() + ")");
        }
    }

    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }
}