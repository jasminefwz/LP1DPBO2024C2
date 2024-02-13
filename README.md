# LP1DPBO2024C2

## Janji
Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
Aamiin

### Bahasa Java

## Desain Program
  Pada program berbasis OOP tentang informasi daftar Anggota DPR yang setiap anggota terdapat ID, Nama, Bidang, dan Partai ini memiliki fitur untuk menambah, mengubah, menghapus, dan menampilkan data, serta dapat keluar dari program. 
  Memiliki dua file yaitu "DPR.java" yang berisi method dan "Main.java" yang berisi main. User dapat memilih salah satu menu fitur tersebut menggunakan switch case dan akan berulang memilih menu hingga program keluar jika memilih menu _0_. Seluruh fitur berada di dalam method yang nantinya akan dipanggil di main.
  Pada fitur tambah data, terdapat inputan untuk banyaknya jumlah data serta datanya, kemudian data tersebut akan di _add_. Pada fitur ubah data, ada kondisi untuk data belum ada atau data sudah ada dan akan mengecek ID yang jika sesuai makan datanya akan di _set_. Fitur hapus data pun hampir sama seperti ubah data, namun bedanya data akan di _remove_. Pada fitur tampilkan data menggunakan tabel untuk menampilkan datanya dengan menentukan panjang maksimal dan minimal dari panjangnya kata pada inputan juga panjangnya kata pada judul kolom tersebut untuk mengatur spasi serta menentukan panjang garis pembatas tabel agar tabel rapi.

## Penjelasan Alur
**1. File "DPR.java"**
    Pertama, dalam file "DPR.java" impor class untuk array list dan scanner. Kemudian mendeklarasi class _**DPR**_ yang huruf pertamanya wajib kapital, didalamnya deklarasi atribut private untuk data anggota DPR, yaitu ID, Nama, Bidang, dan Partai. Selanjutnya public untuk constructor yang tidak ada return type dan terdapat parameter. Lalu public get dan set untuk seluruh atribut.
    Method tambah data berisi scan untuk input banyaknya jumlah data yang diinginkan, terdapat error handling jika inputan bukan integer maka akan muncul tampilan "The input is not an integer". Kemudian perulangan untuk input data anggota DPR sesuai banyaknya jumlah yang sudah diinput, data akan di _add_ list anggotaBaru dan menampilkan bahwa data anggota DPR berhasil ditambahkan.
    Method ubah data memiliki kondisi jika data sudah ada atau belum. Jika data belum ada, maka akan menampilkan "Belum ada data anggota DPR". Namun, jika sudah ada data, maka user akan diminta untuk input ID anggota DPR mana yang akan diubah datanya. Lalu cek ID setiap anggota, jika sesuai maka data akan _set_ atau diubah sesuai inputan baru lalu menampilkan bahwa data berhasil diubah, tetapi jika ID tidak ditemukan akan menampilkan bahwa ID anggota tersebut tidak ada.
    Sama halnya seperti ubah data, method hapus data pun terdapat kondisi jika data sudah ada atau belum serta akan cek ID apabila memang sudah ada data. Akan tetapi, pada method ini data anggota DPR yang sudah sesuai ID nya akan dihapus atau _remove_ dari daftar dan menampilkan data berhasil dihapus.
    Method tampilkan data juga ada kondisi untuk data sudah ada atau belum. Dikarenakan menampilkan data ini dalam bentuk tabel, menentukan panjang maksimal dan minimal dari panjangnya kata pada data sesuai inputan juga panjangnya kata pada judul kolom untuk mengatur spasi serta menentukan panjang garis pembatas agar tabel rapi. Lalu perulangan untuk menampilkan data anggota DPR menggunakan _get_ sesuai dengan menu-menu yang sudah dipilih, seperti menambah, mengubah, dan/atau menghapus.

**2. File "Main.java"**
    Dalam file "Main.java" pun import class terlebih dahulu sama seperti "DPR.java". Deklarasi class _**Main**_, lalu akan menampilkan tampilan awal selamat datang, dan pilihan menu-menu tersedia yang bisa diinput user untuk memilih menu tersebut dengan menggunakan _do while_, yaitu selama user tidak memilih menu _0_, maka program akan terus _looping_ meminta user memilih menu, sedangkan saat user memilih menu _0_ program akan keluar.
   Untuk pilihan menu tersebut menggunakan _switch case_. Jika memilih menu _1_, maka akan memanggil method tambah data. Lalu jika _case 2_ program memanggil method ubah data. Jika menu _3_ akan menghapus data, dan jika memilih menu pada case 4 maka program akan memanggil method untuk menampilkan daftar data anggota DPR. Namun, saat menu yang dimasukkan lebih dari angka 4 atau kurang dari 0, maka program menampilkan bahwa pilihan tidak valid

## Dokumentasi Program saat Dijalankan
1. Tampilan awal
   <img width="694" alt="1  awal" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/9a13dc5c-d0e3-4dfb-b447-1fe0b84ce13c">

2. Memilih '0' untuk menu keluar program
   <img width="223" alt="2  keluar program" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/f3e8e871-656e-4fb0-98d7-886c6cae0303">

3. Memilih menu selain yang sudah tersedia
   <img width="221" alt="3  salah pilih menu" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/1de8490b-fd57-493f-85f1-9835c3e3b92f">

4. Memilih '2' untuk menu ubah data, tetapi belum ada data
   <img width="222" alt="4  ubah blm ada data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/8c213e82-3137-499f-a924-2ac3bfb4b5bb">

5. Memilih '3' untuk menu hapus data, tetapi belum ada data
   <img width="224" alt="5  hapus blm ada data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/c7656d11-7061-4f6f-ac09-ecfd2ae613e8">

6. Memilih '4' untuk menu menampilkan data, tetapi belum ada data
   <img width="243" alt="6  output blm ada data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/541457cd-2030-451a-927d-d02c99b83651">

7. Memilih '1' untuk menu tambah data
   <img width="263" alt="7  tambah data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/44cf962a-af6d-4349-906a-a7e2d1960e7c">

8. Memilih '4' untuk menu menampilkan data (setelah ditambah)
   <img width="480" alt="8  output stlh tambah" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/07156eb2-1fa8-4b75-b3ba-71fa687f718f">

9. Memilih '2' untuk menu ubah data, tetapi salah id
   <img width="317" alt="9  ubah salah id" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/27918a3f-3786-45c0-a016-dda6995a77d2">

10. Memilih '2' untuk menu ubah data
    <img width="319" alt="10  ubah data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/149a1086-71ed-49ed-be65-2b1c9f85e0a7">

11. Memilih '4' untuk menu menampilkan data (setelah diubah)
    <img width="553" alt="11  output stlh ubah" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/5858d569-3b64-414d-a1cf-adc7a784450d">

12. Memilih '3' untuk menu hapus data, tetapi salah id
    <img width="331" alt="12  hapus salah id" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/8a3be615-d344-4078-a73a-0ccd1cd3aa65">

13. Memilih '3' untuk menu hapus data
    <img width="301" alt="13  hapus data" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/615803ec-89d1-424c-8145-79f0c3c4a091">

14. Memilih '4' untuk menu menampilkan data (setelah dihapus)
    <img width="520" alt="14  output stlh hapus" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/dfc98748-3623-42ec-ab7c-cf2ab3329df5">

15. Memilih menu selain angka (integer)
    <img width="338" alt="15  error bkn int" src="https://github.com/jasminefwz/LP1DPBO2024C2/assets/147362810/a830bc7f-4262-480a-84c0-54f64ec4e81c">
