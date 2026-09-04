public class GenreBuku {
    private String idGenre;
    private String namaGenre;

    public GenreBuku(String idGenre, String namaGenre) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
    }

    public void tampilkanGenre() {
        System.out.println("ID Genre   : " + idGenre);
        System.out.println("Nama Genre : " + namaGenre);
    }

    public String getIdGenre() {
        return idGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }
}