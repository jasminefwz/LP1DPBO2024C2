<!-- 
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin 
-->

<?php

require('DPR.php');//berdasarkan nama class

//menampilkan tampilan awal
echo "<b><i>Selamat Datang di Sistem Informasi Anggota DPR</i></b>" . "<br>" . "<br>";
echo "Pilihan menu yang tersedia:" . "<br>";
echo "1. Tambah Data Anggota DPR" . "<br>";
echo "2. Ubah Data Anggota DPR" . "<br>";
echo "3. Hapus Data Anggota DPR" . "<br>";
echo "*Catatan: Data akan otomatis ditampilkan setelah Anda berhasil" . "<br>";
echo "<hr>";

//memilih menu tambah anggota dpr
echo "Pilih menu: 1" . "<br>";
echo "<i>Data Anggota DPR berhasil ditambahkan.</i>" . "<br>" . "<br>";
$dpr = new DPR();//inisialisasi
//menambah 5 anggota
$dpr->tambahDPR(new DPR("A1", "Kim Mingyu", "Keolahragaan", "Sukses", "img\mingyu.jpg"));
$dpr->tambahDPR(new DPR("B2", "Kwon Soonyoung", "Kehutanan", "Horanghae", "img\hoshi.jpg"));
$dpr->tambahDPR(new DPR("C3", "Lee Jihoon", "Musik", "Alunan", "img\woozi.jpg"));
$dpr->tambahDPR(new DPR("D4", "Yoon Jeonghan", "Keamanan", "Cheat", "img\jeonghan.jpg"));
$dpr->tambahDPR(new DPR("E5", "Hong Jisoo", "Kekonyolan", "Love Shot", "img\joshua.jpg"));
$dpr->tampilkanData();//menampilkan data
echo "<hr>";

//memilih menu ubah anggota dpr
echo "Pilih menu: 2" . "<br>";
echo "<i>Data Anggota DPR dengan ID </i>" . $dpr->findId(2) . "<i> berhasil diperbaharui.</i>" . "<br>" . "<br>";
//mengubah partai
$dpr->ubahDPR(2, new DPR("C3", "Lee Jihoon", "Musik", "Melodi", "img\woozi.jpg"));
$dpr->tampilkanData();//menampilkan data
echo "<hr>";

//memilih menu hapus anggota dpr
echo "Pilih menu: 3" . "<br>";
echo "<i>Data Anggota DPR dengan ID </i>" . $dpr->findId(0) . "<i> berhasil dihapus.</i>" . "<br>" . "<br>";
//menghapus anggota di index ke-0 atau anggota pertama
$dpr->hapusDPR(0);
$dpr->tampilkanData();//menampilkan data
echo "<hr>";

?>