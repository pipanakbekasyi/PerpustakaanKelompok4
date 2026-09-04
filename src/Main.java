public class Main {
        public static void main(String[] args) {

                // Membuat genre
                GenreBuku teknologi = new GenreBuku(
                                "G001",
                                "Teknologi");

                GenreBuku novel = new GenreBuku(
                                "G002",
                                "Novel");

                // Membuat buku
                Buku buku1 = new Buku(
                                "B001",
                                "Belajar Pemrograman Java",
                                "Budi Raharjo",
                                2024,
                                teknologi);

                Buku buku2 = new Buku(
                                "B002",
                                "Belajar Pemrograman",
                                "Andi Setiawan",
                                2023,
                                teknologi);

                Buku buku3 = new Buku(
                                "B003",
                                "Galaksi",
                                "Poppi Pertiwi",
                                2018,
                                novel);

                // Membuat member
                Member member1 = new Member(
                                "M001",
                                "Andi");

                Member member2 = new Member(
                                "M002",
                                "Budi");

                // Member meminjam buku
                member1.tambahBuku(buku1);
                member1.tambahBuku(buku3);

                member2.tambahBuku(buku1);
                member2.tambahBuku(buku2);

                // Menampilkan buku yang dipinjam
                member1.tampilkanBuku();
                member2.tampilkanBuku();

                // Menampilkan informasi buku
                System.out.println("\n=== INFORMASI BUKU ===");

                buku1.tampilkanInfo();

                System.out.println();

                buku2.tampilkanInfo();

                System.out.println();

                buku3.tampilkanInfo();
        }
}