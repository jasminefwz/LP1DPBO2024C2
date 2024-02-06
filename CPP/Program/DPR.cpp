/*
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin
*/

//import library
//#pragma once //header yang dipake sekali jika ada beberapa file
#include <iostream>
#include <string>

//menggunakan standard namespace
using namespace std;

//mendeklarasi class -> untuk C++, huruf pertama tidak perlu kapital, namun akan lebih baik jika kapital
class DPR{
    //private atribut
    private:
    string id;      //deklarasi atribut untuk id
    string nama;    //deklarasi atribut untuk nama
    string bidang;  //deklarasi atribut untuk nama bidang
    string partai;  //deklarasi atribut untuk nama partai

    //public method
    public:
    //constructur (tidak ada return type)
    DPR(){
        //set id, nama, bidang, dan partai untuk default value
        this->id = "";      //untuk id
        this->nama = "";    //untuk nama
        this->bidang = "";  //untuk bidang
        this->partai = "";  //untuk partai

    }

    //constructur lain menggunakan parameter dapat digunakan jika objek rerdapat parameter
    DPR(string id, string nama, string bidang, string partai){
        //"this" akan di set dengan parameter
        this->id = id;          //untuk id
        this->nama = nama;      //untuk nama
        this->bidang = bidang;  //untuk bidang
        this->partai = partai;  //untuk partai
    }

    //get id
    string get_id(){
        return this->id;
    }

    //set id
    void set_id(string id){
        this->id = id;
    }
    
    //get nama
    string get_nama(){
        return this->nama;
    }

    //set nama
    void set_nama(string nama){
        this->nama = nama;
    }

    //get bidang
    string get_bidang(){
        return this->bidang;
    }

    //set bidang
    void set_bidang(string bidang){
        this->bidang = bidang;
    }

    //get partai
    string get_partai(){
        return this->partai;
    }

    //set partai
    void set_partai(string partai){
        this->partai = partai;
    }

    //public method "behaviors"
    //tambah anggota DPR
    void tambahDPR(list<DPR>& llist){
        DPR anggota;//membuat atribut dari class private DPR

        cout << "Masukkan ID Anggota: ";    //menampilkan masukkan id
        cin >> anggota.id;                  //memasukkan id
        cout << "Masukkan Nama Anggota: ";  //menampilkan masukkan nama
        cin >> anggota.nama;                //memasukkan nama
        cout << "Masukkan Nama Bidang: ";   //menampilkan masukkan bidang
        cin >> anggota.bidang;              //memasukkan bidang
        cout << "Masukkan Nama Partai: ";   //menampilkan masukkan partai
        cin >> anggota.partai;              //memasukkan partai

        llist.push_back(anggota);
        cout << "Data Anggota DPR berhasil ditambahkan.\n";//menampilkan bahwa anggota dpr sudah ditambahkan
    }

    //ubah anggota DPR
    void ubahDPR(list<DPR>& llist){
        string idModify;//membuat atribut untuk menginput id yang akan diubah
        cout << "Masukkan ID Anggota DPR yang ingin diubah: "; //menampilkan masukkan id
        cin >> idModify; //memasukkan id

        //membandingkan id yang sudah ada dengan id yang diinput
        auto it = find_if(llist.begin(), llist.end(), [idModify](const DPR& anggota){return anggota.id == idModify;});

        //jika id yang dibandingkan sama
        if(it != llist.end()){
            cout << "Masukkan perubahan data Anggota DPR:\n"; //menampilkan masukkan partai
            cout << "Nama: ";   //menampilkan masukkan nama
            cin >> it->nama;    //memasukkan nama
            cout << "Bidang: "; //menampilkan masukkan bidang
            cin >> it->bidang;  //memasukkan bidang
            cout << "Partai: "; //menampilkan masukkan partai
            cin >> it->partai;  //memasukkan partai
            cout << "Data Anggota DPR berhasil diubah.\n";//menampilkan bahwa anggota dpr sudah ditambahkan
        }
        //jika id yang dibandingkan berbeda
        else{
            cout << "ID Anggota DPR tersebut tidak ditemukan.\n";//menampilkan bahwa id tidak ada
        }
    }

    //hapus anggota DPR
    void hapusDPR(list<DPR>& llist){
        string idDelete;//membuat atribut untuk menginput id yang akan dihapus
        cout << "Masukkan ID Anggota DPR yang ingin dihapus: "; //menampilkan masukkan id
        cin >> idDelete;//memasukkan id

        //membandingkan id yang sudah ada dengan id yang diinput
        auto it = find_if(llist.begin(), llist.end(), [idDelete](const DPR& anggota){return anggota.id == idDelete;});

        //jika id yang dibandingkan sama
        if(it != llist.end()){
            llist.erase(it);//menghapus data
            cout << "Data Anggota DPR berhasil dihapus.\n";//menampilkan bahwa anggota dpr sudah dihapus
        }
        //jika id yang dibandingkan berbeda
        else{
            cout << "ID Anggota DPR tersebut tidak ditemukan.\n";//menampilkan bahwa id tidak ada
        }
    }

    //menampilkan anggota DPR
    void tampilkanData(list<DPR>& llist) {
        int i = 0;//inisialisasi
        if(llist.empty()){
            cout << "Belum ada data Anggota DPR" << endl;
        }
        else{
            cout << "\nData Anggota DPR:\n";//menampilkan data anggota dpr
            //perulangan untuk menampilkan data
            for(list<DPR>::iterator it = llist.begin(); it != llist.end(); it++){
                cout << (i + 1) << ". " << endl << "ID Anggota DPR: " << it->get_id() << endl << "Nama Anggota DPR: " << it->get_nama() << endl << "Nama Bidang Anggota: " << it->get_bidang() << endl << "Nama Partai Anggota: " << it->get_partai() << endl;
                i++;//iterasi
            }
        }
    }

    //destructors
    ~DPR(){

    }
};