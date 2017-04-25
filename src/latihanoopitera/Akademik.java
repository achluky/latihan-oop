package latihanoopitera;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author karunia
 */
public class Akademik {
    private HashMap<String,Matakuliah> daftarMatakuliah = new HashMap<>(); // idmk matakuliah
    private HashMap<String,Teacher> daftarTeacher = new HashMap<>(); // idmk matakuliah
    private HashMap<Teacher, Matakuliah> dosenMengajar = new HashMap<>(); // idmk kode_teacher
    
    public void loadMatakuliah() {
        Matakuliah so = new Matakuliah("IF2","Sistem Operasi", 2);
        daftarMatakuliah.put(so.kode_mk, so);
        Matakuliah dw = new Matakuliah("IF3","Data Warehouse", 2);
        daftarMatakuliah.put(dw.kode_mk, dw);
        Matakuliah md = new Matakuliah("IF4","Matematika Diskret", 2);
        daftarMatakuliah.put(md.kode_mk, md);
    }
    
    public void loadTeacher() {
        Teacher t1 = new Teacher("Hafiz", "Bandar Lampung", "HFZ");
        daftarTeacher.put(t1.getKode(), t1);
        Teacher t2 = new Teacher("Indra", "Bandar Lampung", "RIK");
        daftarTeacher.put(t2.getKode(), t2);
        Teacher t3 = new Teacher("Arkham", "Solo", "ARK");
        daftarTeacher.put(t3.getKode(), t3);
    }
    
    //Lengkapi
    public void printDaftarMatakuliah() {
    //f.s: menampilkan daftar semua matakuliah dengan mencetak objek matakuliah
    }
    
    //Lengkapi
    public void printDaftarTeacher() {
    //f.s: menampilkan daftar semua dosen dengan mencetak objek dosen
    }
    
    //Lengkapi
    //menambahkan list dosen mengajar
    public void addDosenMengajar(Teacher T, Matakuliah MK) {
    }
    
    //Lengkapi
    //mencari Matakuliah
    public Matakuliah cariMatakuliahDenganKode(String kode) {
        return null;
    }
    
    //Lengkapi
    //mencari Dosen
    public Teacher cariTeacherDenganKode(String kode) {
        return null;
    }
    
    //Lengkapi
    //mencetak data
    public void print() {
    }
    
    /*
    output
    run:
    ==========================
    Print Matakuliah:
    == Info Matakuliah ==
    Kode Matakuliah : IF2
    Nama Matakuliah : Sistem Operasi
    SKS : 2
    == Info Matakuliah ==
    Kode Matakuliah : IF4
    Nama Matakuliah : Matematika Diskret
    SKS : 2
    == Info Matakuliah ==
    Kode Matakuliah : IF3
    Nama Matakuliah : Data Warehouse
    SKS : 2
    ==========================
    Print Dosen:
    Teacher: Indra (Bandar Lampung)
    Kode: RIK
    Teacher: Arkham (Solo)
    Kode: ARK
    Teacher: Hafiz (Bandar Lampung)
    Kode: HFZ

    ==========================
    Hasil pencarian Kode Matakuliah= IF2:
    == Info Matakuliah ==
    Kode Matakuliah : IF2
    Nama Matakuliah : Sistem Operasi
    SKS : 2

    ==========================
    Hasil pencarian Kode Dosen = HFZ:
    Teacher: Hafiz (Bandar Lampung)
    Kode: HFZ

    ==========================
    Jumlah Data Dosen Mengajar Matakuliah: 2
    Teacher: Hafiz (Bandar Lampung)
    Kode: HFZ
    == Info Matakuliah ==
    Kode Matakuliah : IF2
    Nama Matakuliah : Sistem Operasi
    SKS : 2
    Teacher: Luky (Bandar Lampung)
    Kode: ALR
    == Info Matakuliah ==
    Kode Matakuliah : IF10
    Nama Matakuliah : PTI
    SKS : 3
    */
    public static void main(String[] args) {
        //load
        Akademik akademik = new Akademik();
        akademik.loadMatakuliah();
        akademik.loadTeacher();
        
        System.out.println("==========================");
        System.out.println("Print Matakuliah:");
        akademik.printDaftarMatakuliah();
        System.out.println("==========================");
        System.out.println("Print Dosen:");
        akademik.printDaftarTeacher();

        //pencarian
        Matakuliah mk = akademik.cariMatakuliahDenganKode("IF2");
        System.out.println();
        System.out.println("==========================");
        System.out.println("Hasil pencarian Kode Matakuliah= IF2:");
        System.out.println(mk);
        
        Teacher th = akademik.cariTeacherDenganKode("HFZ");
        System.out.println();
        System.out.println("==========================");
        System.out.println("Hasil pencarian Kode Dosen = HFZ:");
        System.out.println(th);
        
        akademik.addDosenMengajar(th, mk);
        
        Teacher t1 = new Teacher("Luky", "Bandar Lampung", "ALR");
        Matakuliah m1 = new Matakuliah("IF10","PTI", 3);
        akademik.addDosenMengajar(t1, m1);
        
        System.out.println();
        akademik.print();
    }
    
}
