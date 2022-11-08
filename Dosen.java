public class Dosen extends Karyawan{
    private String jurusan;
    private String nidn;

    private int tambahan_gaji;

    public void minggu(int sks){
        this.tambahan_gaji = sks * 100000;
    }


    @Override
    public void hitung_gaji(){
        System.out.println("Gaji            : Rp. " + (tambahan_gaji+gajiPokok));

    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}
