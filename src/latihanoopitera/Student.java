package latihanoopitera;
/**
 *
 * @author karunia
 */
public class Student implements Person {
    
    // nim mahasiswa
    private String nim,name,address;

    //Lengkapi
    //Constructor
    public Student(String name, String address, String noInduk) {
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
    public void setAddress(String address) {
    }
    
    //Lengkapi
    //mendapatkan kode mahasiswa / nim
    @Override
    public String getKode() {
       return null;
    }
    
    //Lengkapi
    //set kode mahasiswa / nim
    @Override
    public void setKode(String kode){
    }
    
   //Lengkapi
   @Override
   public String toString() {
      return null;
   }
   /*
   output
   Student: Ahmad Luky Ramdani (Bandar Lampung)
   Nim: NIM12
   */
   public static void main(String[] args) {
      Student s1 = new Student("Ahmad Luky Ramdani", "Bandar Lampung", "NIM12");
      System.out.println(s1);
   }
}