/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
#include <bits/stdc++.h>
#include "DPR.cpp"

//menggunakan standard namespace
using namespace std;

int main(){
    int i, n = 0;//inisialisasi
    string id;      //deklarasi atribut untuk id
    string nama;    //deklarasi atribut untuk nama
    string bidang;  //deklarasi atribut untuk nama bidang
    string partai;  //deklarasi atribut untuk nama partai

    //premade linked list library
    list<DPR> llist;

    int pilihan;//deklarasi atribut untuk memilih menu
    do{
        cout << "\nPilihan menu yang dapat Anda pilih:\n";  //menampilkan judul
        cout << "0. Keluar\n";                              //menampilkan pilihan pertama
        cout << "1. Tambah Data Anggota DPR\n";             //menampilkan pilihan kedua
        cout << "2. Ubah Data Anggota DPR\n";               //menampilkan pilihan ketiga
        cout << "3. Hapus Data Anggota DPR\n";              //menampilkan pilihan keempat
        cout << "4. Tampilkan Data Anggota DPR\n";          //menampilkan pilihan kelima
        cout << "Pilih menu: ";                             //menampilkan masukkan pilihan
        cin >> pilihan;//memasukkan nomor pilihan

        cin.ignore();//membersihkan newline di buffer

        DPR dpr;//deklarasi atribut
        switch(pilihan){
            case 0:
                cout << "Program selesai, sampai jumpa!\n";
                break;
            case 1:
                dpr.tambahDPR(llist);//memanggil method untuk menambah data
                break;
            case 2:
                dpr.ubahDPR(llist);//memanggil method untuk mengubah data
                break;
            case 3:
                dpr.hapusDPR(llist);//memanggil method untuk menghapus data
                break;
            case 4:
                dpr.tampilkanData(llist);//memanggil method untuk menampilkan data
                break;
            default:
                cout << "Pilihan tidak valid.\n";//jika nomor yang dimasukkan tidak sesuai
                break;
        }
    }while(pilihan != 0);

    return 0;
}