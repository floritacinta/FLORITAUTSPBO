public class Tendik extends Karyawan{
    private int gaji_lembur;

    public void lembur(int jam){
        this.gaji_lembur = jam * 50000;
    }


    @Override
    public void hitung_gaji(){
        System.out.println("Gaji            : Rp. " + (gaji_lembur+gajiPokok));

    }
}
