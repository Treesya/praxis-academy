/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;


//contoh class objek :

public class Customer {

    private int noId;
    private String nama;
    private String alamat;

    //konstruktor
    public Customer() {
    }

    public Customer(int NoId, String Nama, String Alamat) {
        this.noId = NoId;
        this.nama = Nama;
        this.alamat = Alamat;
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