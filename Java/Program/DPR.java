//deklarasi class -> untuk Java, huruf pertama pada class harus kapital

import java.util.ArrayList;
import java.util.Scanner;

public class DPR{
    //atribut private
    private String id;      //deklarasi atribut id anggota
    private String name;    //deklarasi atribut nama anggota
    private String bidang;  //deklarasi atribut bidang
    private String partai;  //deklarasi atribut partai

    //constructors
    //tidak ada return type
    public DPR(){
        this.id = "";
        this.name = "";
        this.bidang = "";
        this.partai = "";
    }

    //constructor lain yang terdapat parameter
    public DPR(String id, String name, String bidang, String partai){
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;
    }

    //get id
    public String getId(){
        return this.id;
    }

    //set id
    public void setId(String id){
        this.id = id;
    }

    //get name
    public String getName(){
        return this.name;
    }

    //set name
    public void setName(String name){
        this.name = name;
    }

    //get bidang
    public String getBidang(){
        return this.bidang;
    }

    //set bidang
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    //get partai
    public String getPartai(){
        return this.partai;
    }

    //set partai
    public void setPartai(String partai){
        this.partai = partai;
    }

    //public method "behaviors"
    //tambah anggota dpr
    public static void tambah(ArrayList<DPR> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah anggota DPR yang ingin ditambahkan: ");
        int n = 0;
        //exception handling
        try{
            n = sc.nextInt();//masukkan banyaknya data
        }
        catch(Exception e){
            System.out.println("The input is not an integer!");
        }
        sc.nextLine();

        System.out.println("\nSilahkan masukkan data Anggota DPR!");
        //masukkan data
        for (int i = 0; i < n; i++){
            System.out.println("\nData Anggota DPR ke-" + (i + 1));
            System.out.print("Masukkan ID: ");
            String id = sc.nextLine();

            System.out.print("Masukkan Nama: ");
            String name = sc.nextLine();

            System.out.print("Masukkan Bidang: ");
            String bidang = sc.nextLine();

            System.out.print("Masukkan Partai: ");
            String partai = sc.nextLine();

            DPR anggotaBaru = new DPR(id, name, bidang, partai);
            list.add(anggotaBaru);
        }
        System.out.println("\nData Anggota DPR berhasil ditambahkan.");
    }

    //ubah anggota dpr
    public static void ubah(ArrayList<DPR> list){
        //jika data belum ada
        if(list.isEmpty()){
            System.out.println("Belum ada data anggota DPR.");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan ID Anggota DPR yang ingin diubah: ");
            String idUbah = sc.nextLine();//mencari id
            boolean ditemukan = false;

            //mengubah data
            for(DPR anggota : list){
                if(anggota.getId().equals(idUbah)){
                    System.out.println("\nID Anggota DPR ditemukan. Masukkan data baru!");
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru = sc.nextLine();
                    anggota.setName(namaBaru);

                    System.out.print("Masukkan Bidang Baru: ");
                    String bidangBaru = sc.nextLine();
                    anggota.setBidang(bidangBaru);

                    System.out.print("Masukkan Partai Baru: ");
                    String partaiBaru = sc.nextLine();
                    anggota.setPartai(partaiBaru);
                    System.out.println("Data anggota DPR berhasil diubah.");
                    ditemukan = true;
                    break;
                }
            }

            //jika id tidak ditemukan
            if(!ditemukan){
                System.out.println("ID Anggota DPR tidak ditemukan.");
            }
        }
    }

    //hapus anggota dpr
    public static void hapus(ArrayList<DPR> list){
        //jika belum ada data
        if(list.isEmpty()){
            System.out.println("Belum ada data anggota DPR.");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan ID Anggota DPR yang ingin dihapus: ");
            String idHapus = sc.nextLine();//mencari id
            boolean ditemukan = false;

            //menghapus data
            for(DPR anggota : list){
                if(anggota.getId().equals(idHapus)){
                    list.remove(anggota);
                    System.out.println("ID anggota DPR ditemukan. Data berhasil dihapus.");
                    ditemukan = true;
                    break;
                }
            }

            //jika id tidak ditemukan
            if(!ditemukan){
                System.out.println("ID Anggota DPR tidak ditemukan.");
            }
        }
    }

    //menampilkan data
    public static void tampilkanData(ArrayList<DPR> list){
        System.out.println("\nData Anggota DPR");
        //jika tidak ada data
        if(list.isEmpty()){
            System.out.println("Belum ada data anggota DPR.");
        }else{
            //menentukan lebar maksimum untuk setiap kolom
            int maxIdLength = 10;//panjang minimal untuk judul kolom id
            int maxNamaLength = 12;//panjang minimal untuk judul kolom nama
            int maxBidangLength = 6;//panjang minimal untuk judul kolom bidang
            int maxPartaiLength = 6;//panjang minimal untuk judul kolom partai

            //menentukan lebar maksimum isi kolom
            for(DPR anggota : list){
                maxIdLength = Math.max(maxIdLength, anggota.getId().length());
                maxNamaLength = Math.max(maxNamaLength, anggota.getName().length());
                maxBidangLength = Math.max(maxBidangLength, anggota.getBidang().length());
                maxPartaiLength = Math.max(maxPartaiLength, anggota.getPartai().length());
            }

            //menentukan lebar kolom agar tidak terlalu sempit
            maxIdLength = Math.max(maxIdLength, "ID Anggota".length());
            maxNamaLength = Math.max(maxNamaLength, "Nama Anggota".length());
            maxBidangLength = Math.max(maxBidangLength, "Bidang".length());
            maxPartaiLength = Math.max(maxPartaiLength, "Partai".length());

            //output
            //menentukan lebar judul kolom
            String format = "| %-"+ (maxIdLength) + "s | %-"+ (maxNamaLength) + "s | %-"+ (maxBidangLength) + "s | %-"+ (maxPartaiLength) + "s |%n";
            //menentukan lebar garis pembatas baris
            String line = "+-" + "-".repeat(maxIdLength) + "-+-" + "-".repeat(maxNamaLength) + "-+-" + "-".repeat(maxBidangLength) + "-+-" + "-".repeat(maxPartaiLength) + "-+";
            System.out.println(line);
            System.out.printf(format, "ID Anggota", "Nama Anggota", "Bidang", "Partai");
            String linee = "+=" + "=".repeat(maxIdLength) + "=+=" + "=".repeat(maxNamaLength) + "=+=" + "=".repeat(maxBidangLength) + "=+=" + "=".repeat(maxPartaiLength) + "=+";
            System.out.println(linee);
            //menampilkan data
            for(DPR anggota : list){
                System.out.printf(format, anggota.getId(), anggota.getName(), anggota.getBidang(), anggota.getPartai());
                System.out.println(line);
            }
        }
    }

    //Java tidak ada destructor
}