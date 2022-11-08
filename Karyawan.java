public class Karyawan {
    private String nip, nama, alamat, tgl_lahir, jk, thn_msk;
    private int gaji_lembur, tambahan_gaji;
    protected int gajiPokok = 2000000;

    public void lembur(){
        this.gaji_lembur = 0;
    }

    public void minggu(){
        this.tambahan_gaji = 0;
    }

    public void hitung_gaji(){
        System.out.println("Pendapatan : " + gajiPokok);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getThn_msk() {
        return thn_msk;
    }

    public void setThn_msk(String thn_msk) {
        this.thn_msk = thn_msk;
    }
}
