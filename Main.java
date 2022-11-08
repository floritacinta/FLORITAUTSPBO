public class Main {
    public static void main(String[] args) {
        Tendik a = new Tendik();
        a.setNip("123");
        a.setNama("Florita Cinta Arum K");
        a.setAlamat("Surabaya");
        a.setTgl_lahir("12-06-2003");
        a.setJk("Perempuan");
        a.setThn_msk("2012");

        System.out.println("=========== Tendik =========== ");
        System.out.println("NIP             : " + a.getNip());
        System.out.println("Nama            : " + a.getNama());
        System.out.println("Alamat          : " + a.getAlamat());
        System.out.println("Tanggal Lahir   : " + a.getTgl_lahir());
        System.out.println("Jenis Kelamin   : " + a.getJk());
        System.out.println("Tahun Masuk     : " + a.getThn_msk());
        a.lembur(20);
        a.hitung_gaji();

        Dosen b = new Dosen();
        b.setNip("187");
        b.setNidn("2100018187");
        b.setJurusan("Informatika");
        b.setNama("Dosen Wahyu");
        b.setAlamat("Jogjakarta");
        b.setTgl_lahir("12-10-1956");
        b.setJk("Laki-Laki");
        b.setThn_msk("2002");

        System.out.println("");
        System.out.println("=========== Dosen =========== ");
        System.out.println("NIP             : " + b.getNip());
        System.out.println("NIDN            : " + b.getNidn());
        System.out.println("Nama            : " + b.getNama());
        System.out.println("Jurusan         : " + b.getJurusan());
        System.out.println("Alamat          : " + b.getAlamat());
        System.out.println("Tanggal Lahir   : " + b.getTgl_lahir());
        System.out.println("Jenis Kelamin   : " + b.getJk());
        System.out.println("Tahun Masuk     : " + b.getThn_msk());
        b.minggu(6);
        b.hitung_gaji();


    }
}