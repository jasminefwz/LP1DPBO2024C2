<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php

class DPR{
    //atribut private
    private $id = '';       //atribut untuk id
    private $name = '';     //atribut untuk nama
    private $bidang = '';   //atribut untuk bidang
    private $partai = '';   //atribut untuk partai
    private $profil = '';   //atribut untuk foto profil

    //atribut public
    //constructor
    public function __construct($id = '', $name = '', $bidang = '', $partai = '', $profil = ''){
        $this->id = $id;            //set id
        $this->name = $name;        //set nama
        $this->bidang = $bidang;    //set bidang
        $this->partai = $partai;    //set partai
        $this->profil = $profil;    //set foto profil
    }

    //set id
    public function setId($id){
        $this->id = $id;
    }

    //get id
    public function getId(){
        return $this->id;
    }

    //set name
    public function setName($name){
        $this->name = $name;
    }

    //get name
    public function getName(){
        return $this->name;
    }

    //set bidang
    public function setBidang($bidang){
        $this->bidang = $bidang;
    }

    //get bidang
    public function getBidang(){
        return $this->bidang;
    }

    //set partai
    public function setPartai($partai){
        $this->partai = $partai;
    }

    //get partai
    public function getPartai(){
        return $this->partai;
    }

    //set foto profil
    public function setProfil($profil){
        $this->profil = $profil;
    }

    //get foto profil
    public function getProfil(){
        return $this->profil;
    }

    //public method
    private $anggotaDPR = [];

    //tambah anggota dpr
    public function tambahDPR($anggota){
        $this->anggotaDPR[] = $anggota;
    }

    //ubah anggota dpr
    public function ubahDPR($index, $anggota){
        $this->anggotaDPR[$index] = $anggota;
    }

    //hapus anggota dpr
    public function hapusDPR($index){
        unset($this->anggotaDPR[$index]);
    }

    //menampilkan anggota dpr
    public function tampilkanData(){
        echo "<table border='1'>";//membuat tabel
        echo "<b>　　　　　　　　　　Data Anggota DPR</b>" . "<br>";//menampilkan data
        echo "<tr><td><b>ID Anggota</b></td><td><b>Nama Anggota</b></td><td><b>Bidang</b></td><td><b>Partai</b></td><td><b>Foto Profil</b></td></tr>";//judul isi tabel
        //perulangan untuk menampilkan data
        foreach($this->anggotaDPR as $anggota){
            echo "<tr>";
            echo "<td>{$anggota->id}</td>";     //untuk menampilkan id
            echo "<td>{$anggota->name}</td>";   //untuk menampilkan nama
            echo "<td>{$anggota->bidang}</td>"; //untuk menampilkan bidang
            echo "<td>{$anggota->partai}</td>"; //untuk menampilkan partai
            echo "<td><img src='{$anggota->getProfil()}' alt='{$anggota->name}' width='50' height='50'></td>";//untuk menampilkan foto profil
            echo "</tr>";
        }
        echo "</table>";
    }

    //mencari id berdasarkan index
    public function findId($index){
        if(isset($this->anggotaDPR[$index])){
            return $this->anggotaDPR[$index]->id;
        }
        return null;
    }
}

?>