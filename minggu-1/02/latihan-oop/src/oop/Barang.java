package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
}package oop;

//Interface digunakan saat parent tidak memiliki apa-apa, hanya metode,
//namun metode tersebut harus di implementasikan[harus ada] pada kelas child.
//contoh class interface :

public interface Barang {
        //method interface
        public void setBarang(int kodeBarang, String namaBarang, float harga);
}


Source code class Customer :

package oop;

//contoh class objek :

public class Customer {

    private int noId;
    private String nama;
    private String alamat;

    //konstruktor
    public Customer() {
    }

    public Customer(int noId, String nama, String alamat) {
        this.noId = noId;
        this.nama = nama;
        this.alamat = alamat;
    }

    //proses get set
    public int getNoId() {
        return noId;
    }

    public void setNoId(int noId) {
        this.noId = noId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}