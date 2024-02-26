public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("=================");
    }

    void terjual(int jml) {
        if (stok>=jml) {
            stok -= jml;
        } else {
            System.out.println("stok tidak cukup");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku21() {

    }
    
    public Buku21(String jdl, String pg, int hal, int stok, int hrg) {
        judul = jdl;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = hrg;
    }
}
