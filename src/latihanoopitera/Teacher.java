package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Teacher implements Person {
    
    //Kode dosen
    private String Kode_dosen,nama,alamat; 

    public Teacher(String name, String address, String kode) {
    }
    //Lengkapi
    //Mendapatkan nama person
    @Override
    public String getName() {
       return null;
    }

    //Lengkapi
    //Set nama person
    @Override
    public void setName(String name) {
    }

    //Lengkapi 
    //Alamat person
    @Override
    public String getAddress() {
       return null;
    }

    //Lengkapi
    //Set alamat person
    @Override
    public void setAddress(String add) {
    }
  
    //Lengkapi
    //mendapatkan kode dosen
    @Override
    public String getKode() {
       return null;
    }
    
    //Lengkapi
    //set kode dosen
    @Override
    public void setKode(String kode){
    }

    @Override
    public String toString() {
       return null;
    }
    /*
    output
    Teacher: Hafiz (Bandar Lampung)
    Kode: HFZ
    */
    public static void main(String[] args) {
      Teacher t1 = new Teacher("Hafiz", "Bandar Lampung", "HFZ");
      System.out.println(t1);
    }
}
