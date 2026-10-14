//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Pegawai pgw = new Pegawai();
    pgw = new Manager();
    pgw = new Programmer();




    Programmer pgr = new Programmer();
    pgr.nama= "Samsudin Sniper";
    pgr.gajiPokok = 100000;
    pgr.bonus= 90;
    pgw = pgr; // polimorfisme
    pgw.tampilData();
    pgr.tampilData();


    Donatur dont = new Donatur();
    dont.nama = "Cod AKI";
    dont.gajiPokok = 9090;
    dont.dividen = 5810;
    pgw = dont;
    pgw.tampilData();
    dont.tampilData();

    Pegawai[] arrPeg = new Pegawai[5];
    Programmer pr  = new Programmer();
    pr.nama = "Danish Waluyo";pr.gajiPokok = 9000; pr.bonus= 80;
    pr.tampilData();
    arrPeg[0] = pgw;
    arrPeg[1] = pgr;
    arrPeg[2] = new Programmer();
    arrPeg[3] = pr;
    arrPeg[4] = dont;
    arrPeg[0].tampilData();
    arrPeg[1].tampilData();
    arrPeg[2].tampilData();
    arrPeg[3].tampilData();
    arrPeg[4].tampilData();


    hitungGajiTotal(pgw);
    hitungGajiTotal(pgr);
    hitungGajiTotal(pr);
    hitungGajiTotal(dont);

    }

    public  static void hitungGajiTotal(Pegawai p){

        if (p instanceof Programmer){
            Programmer prog = (Programmer) p;
            int gajiTot = prog.bonus+ prog.gajiPokok;
            System.out.println("Gaji Total Programmer = "+ gajiTot);
        } else if (p instanceof Manager) {
            Manager man = (Manager) p;
            int gajiTot = man.gajiPokok+ man.tunjangan;
            System.out.println("Gaji Total Manager = "+ gajiTot);
        } else if (p instanceof Donatur){
            Donatur don = (Donatur) p;
            int gajiTot = don.dividen + don.gajiPokok;
            System.out.println("Gaji Total Donatur = "+ gajiTot);
        }
    }
}