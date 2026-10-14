public class Programmer extends Pegawai{
    public int bonus;

    @Override
    public void tampilData(){
        System.out.println("============PROGRAMMER PUNYA===========");
        super.tampilData();
        System.out.println("BONUS  = "+bonus);
        System.out.println("GAJI TOTAL = " + (gajiPokok +bonus));
        System.out.println("====================================");
        System.out.println("");
    }
}
