public class Manager extends Pegawai{

    public int tunjangan;

    public void tampilData(){
        System.out.println("============MANAJER PUNYA===========");
        super.tampilData();
        System.out.println("TUNJANGAN = "+ tunjangan);
        System.out.println("GAJI TOTAL = " + (gajiPokok +tunjangan));
        System.out.println("====================================");
        System.out.println("");
    }
}
