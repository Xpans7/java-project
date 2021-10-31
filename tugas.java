//created by panorama
//tugas ngajieun program java
//password : 12345
import java.util.Scanner;
import java.util.*;
class Main{  
    public static void main(String args[]){  
     Scanner scan = new Scanner(System.in);
     //variabel string
     String name;
     String ya;
     String pass;
     //variabel int
     int pilih;
     int kec;
     int waktu;
     int alas;
     int tinggi;
     int sisi;
     int panjang;
     int lebar;
     int angka1;
     int angka2;
     boolean ulang = true;
     int ulangi = 0;
     //perulangan 1
     while(ulang){
     
//    m     m  mmmmmm  m        mmma   emmma   m       m  mmmmmm
//    #     #  #       #       m      m     #  # #   # #  #
//    #  #  #  #mmmmm  #       #      #     #  #  # #  #  #mmmmm
//    # # # #  #       #       #      #     #  #   #   #  #
//    #     #  #mmmmm  #mmmmm  *mmma   *###*   #       #  #mmmmm
                     
     System.out.println("\n\n\t##############################");  
     System.out.println("\t# welcome to my project java #");
     System.out.println("\t# -------------------------- #");
     System.out.println("\t# Author : panorama          #");
     System.out.println("\t# Group : 6                  #");
     System.out.println("\t# Class : X TKJ              #");
     System.out.println("\t##############################");
     
     //input
    
     System.out.print(">>>Enter your name : ");
     name = scan.nextLine();
     //percabangan 1
     //sudah di perbarui!
     if (name.equalsIgnoreCase("panorama")){
       //output percabangan 1
       //input
       while(ulang){
       System.out.print(">>>enter your password : ");
       pass = scan.nextLine();
       //output & percabangan 2
       //perulangan2
       
       if (pass.equalsIgnoreCase("12345")){
         
         System.out.println("____________________________");
         System.out.println("--LOGIN SUCCESS--");
         
         System.out.println("____________________________");
         System.out.println("Hello "+name+" welcome to class X TKJ\n");
         System.out.println("translated to indonesian....[√]");
         while(ulang){
         System.out.println("\n----------------------------");
         System.out.println("-----program menghitung-----");
        //input
         System.out.println("\n[1] menghitung luas segitiga");
         System.out.println("[2] menghitung luas persegi");
         System.out.println("[3] menghitung jarak tempuh");
         System.out.println("[4] menghitung luas persegi panjang");
         System.out.println("[5] perkalian");
         System.out.println("[6] pembagian");
         System.out.println("[7] pengurangan");
         System.out.println("[8] pertambahan");
         System.out.println("[9] menghitung luas lingkaran");
         System.out.println("[10] menghitung volume balok");
         System.out.println("PERINGATAN! : \njangan masukan inputan huruf pada sesi ini\njika anda memasukan inputan huruf \nmaka program akan terjadi eror!");
         System.out.print(">>>Silahkan pilih : ");         
         pilih = scan.nextInt();
         if (pilih == 1){
           System.out.println("\n\n-----menghitung luas segitiga-----");
           System.out.print("Alas : ");
           alas = scan.nextInt();
           System.out.print("Tinggi : ");
           tinggi = scan.nextInt();
           double hasil = 0.5*alas*tinggi;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 2){
           System.out.println("\n\n-----menghitung luas persegi-----");
           System.out.print("Sisi persegi : ");
           angka1 = scan.nextInt();
           float hasil = angka1 * angka1;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 3){
           System.out.println("\n\n-----menghitung jarak tempuh-----");
           System.out.print("Kecepatan[km/jam]: ");
           kec = scan.nextInt();
           System.out.print("Waktu[jam] : ");
           waktu = scan.nextInt();
           float hasil = kec * waktu;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 4){
           System.out.println("\n\n-----menghitung luas persegi panjang-----");
           System.out.print("Panjang : ");
           panjang = scan.nextInt();
           System.out.print("Lebar : ");
           lebar = scan.nextInt();
           float hasil = panjang * lebar;
           System.out.print(">>hasil "+hasil); 
         }
         else if(pilih == 5){
           System.out.println("\n\n-----menghitung perkalian-----");
           System.out.print("masukan angka : ");
           angka1 = scan.nextInt();
           System.out.print("masukan angka : ");
           angka2 = scan.nextInt();
           float hasil = angka1*angka2;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 6){
           System.out.println("\n\n-----menghitung pembagian-----");
           System.out.print("masukan angka : ");
           angka1 =scan.nextInt();
           System.out.print("masukan angka : ");
           angka2 = scan.nextInt();
           float hasil = angka1 / angka2;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 7){
           System.out.println("\n\n-----menghitung pengurangan-----");
           System.out.print("masukan angka : ");
           angka1 =scan.nextInt();
           System.out.print("masukan angka : ");
           angka2 = scan.nextInt();
           float hasil = angka1 - angka2;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 8){
           System.out.println("\n\n-----menghitung pertambahan-----");
           System.out.print("masukan angka : ");
           angka1 =scan.nextInt();
           System.out.print("masukan angka : ");
           angka2 = scan.nextInt();
           float hasil = angka1 + angka2;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 9){
           System.out.println("\n\n-----menghitung luas lingkaran-----");
           System.out.print("jari2 : ");
           angka1 = scan.nextInt();
           double hasil = 3.14 * angka1 * angka1;
           System.out.println(">>Hasil : "+hasil);
         }
         else if(pilih == 10){
           System.out.println("\n\n-----menghitung volume balok-----");
           System.out.print("panjang : ");
           angka1 = scan.nextInt();
           System.out.print("lebar : ");
           angka2 = scan.nextInt();
           System.out.print("tinggi : ");
           tinggi = scan.nextInt();
           int hasil = angka1 * angka2 * tinggi;
           System.out.println(">>hasil : "+hasil);
         }
         else{
           System.out.println("Format yang anda masukan salah!!!");
           System.out.println("\nformat not found!!!");
         }
         ulangi++;
          }
       }
       else{
         System.out.println("\n-------------------------------");
         System.out.println("password incorrect!!");
           }
      }
    }
     else{
       
       System.out.println("\nerror404!!!!.......");
       System.out.print("username not availabel!!!... : ");
       System.out.println("\n-------------------------------");
     }
     ulangi++;
     
     }
    }  
}  
