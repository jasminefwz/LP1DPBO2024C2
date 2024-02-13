//import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //struktur data
        ArrayList<DPR> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //tampilan awal
        System.out.println("#================================================#");
        System.out.println("# SELAMAT DATANG DI SISTEM INFORMASI ANGGOTA DPR #");
        System.out.println("#================================================#");
       
        int pilihan;//atribut untuk nomor pilihan menu
        do{
            //menu pilihan
            System.out.println("\nPilihan menu yang tersedia:");
            System.out.println("0. Keluar");
            System.out.println("1. Tambah Data Anggota DPR");
            System.out.println("2. Ubah Data Anggota DPR");
            System.out.println("3. Hapus Data Anggota DPR");
            System.out.println("4. Tampilkan Data Anggota DPR");
            System.out.print("\nPilih menu: ");
            pilihan = sc.nextInt();//masukkan nomor menu
            sc.nextLine();

            switch(pilihan){
                case 0:
                    System.out.println("Program selesai, sampai jumpa!");
                    break;
                case 1:
                    DPR.tambah(list);//tambah data anggota dpr
                    break;
                case 2:
                    DPR.ubah(list);//ubah data anggota dpr
                    break;
                case 3:
                    DPR.hapus(list);//hapus data anggota dpr
                    break;
                case 4:
                    DPR.tampilkanData(list);//menampilkan data anggota dpr
                    break;
                //jika nomor pilihan selain diatas
                    default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }while(pilihan != 0);

        //close scanner
        sc.close();
    }
}