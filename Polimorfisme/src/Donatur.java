public class Donatur extends Pegawai{

    int dividen;

    @Override
    public void tampilData() {
        System.out.println("============DONATUR PUNYA===========");
        super.tampilData();
        System.out.println("DIVIDEN = "+ dividen);
        System.out.println("GAJI TOTAL = " + (gajiPokok +dividen));
        System.out.println("====================================");
        System.out.println("");
    }
}
