// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Inisialisasi perburuan
        ScavengerHunt hunt = new ScavengerHunt();

        // Menambahkan poin-poin perburuan
        hunt.addPoint("Di dalam gua yang gelap, terdapat seekor binatang dengan dua mata tapi tidak memiliki mulut. Apakah itu?", "katak");
        hunt.addPoint("Di kebun belakang rumah, terdapat pohon dengan buah yang berwarna kuning ketika sudah matang. Apakah nama buah itu?", "pisang");
        hunt.addPoint("Di bawah jembatan yang terbuat dari batu, terdapat sebuah peti yang tertutup rapat. Buka peti itu dan ambil kunci untuk menuju point selanjutnya.", "peti");

        // Memulai perburuan
        hunt.startHunt();
    }
}