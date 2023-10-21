import java.util.Scanner;

public class PemilihanPercobaan221 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input21.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input21.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input21.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input21.nextFloat();

        float total = (uas * 0.4F)+(uts * 0.3F)+(kuis*0.1F)+(tugas*0.2F);

      if (total >80) {
        System.out.println("Mendapatkan nilai A"); 
      } else if (total >=80){
        System.out.println("Mendapatkan nilai B+");
      } else if (total >=73){
        System.out.println("Mendapatkan nilai B");
      } else if (total >=65){
        System.out.println("Mendapatkan nilai C+");
      } else if (total >=60){
        System.out.println("Mendapatkan nilai C");
      } else if (total >=50){
        System.out.println("Mendapatkan nilai D");
      } else if (total <=39){
        System.out.println("Mendapatkan nilai E");
      }
String message = total < 65 ? "Remidi" : "Tidak remidi";
System.out.println("Nilai akhir = "+ total+" sehingga "+ message);
        
    }
}