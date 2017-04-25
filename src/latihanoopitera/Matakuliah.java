package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Matakuliah {
    int sks;
    String kode_mk;
    String nama;
    
    //lengkapi 
    //constrcutor
    public Matakuliah(String kode, String nama, int sks) {
    }

    //lengkapi
    public String toString() {
        return null;
    }

    /*
    output
    == Info Matakuliah ==
    Kode Matakuliah : IF2
    Nama Matakuliah : Sistem Operasi
    SKS : 2
    */
    public static void main(String[] args) {
        Matakuliah b = new Matakuliah("IF2","Sistem Operasi",2);
        System.out.println(b);
    }
    
}
