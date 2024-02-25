public class BukuMain21 {
    public static void main(String[] args) {
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        int jml, hrg;

        bk1.tampilInformasi();
        bk1.terjual(jml=5);
        bk1.gantiHarga(hrg=60000);
        bk1.tampilInformasi();

        String jdl, pg;
        int hal, stok;

        Buku21 bk2 = new Buku21(jdl="Self Reward", pg="Maheera Ayesha", hal=160, stok=29, hrg=59000);
        bk2.terjual(jml=11);
        bk2.tampilInformasi();
    }
}