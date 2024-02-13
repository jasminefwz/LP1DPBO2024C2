# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# import class file
from DPR import DPR

# inisialisasi
dpr = DPR()

# print judul
print("$================================================$")
print("$ SELAMAT DATANG DI SISTEM INFORMASI ANGGOTA DPR $")
print("$================================================$")

while True:
    # pilihan menu
    print("\nPilihan menu yang tersedia:")
    print("0. Keluar")
    print("1. Tambah Data Anggota DPR")
    print("2. Ubah Data Anggota DPR")
    print("3. Hapus Data Anggota DPR")
    print("4. Tampilkan Data Anggota DPR")

    # memasukkan nomor menu
    pilihan = input("\nPilih menu: ")
    print()
    
    # keluar program
    if pilihan == "0":
        print("Program selesai, sampai jumpa!")
        break

    # tambah data
    elif pilihan == "1":
        print("Silahkan masukkan data Anggota DPR!")
        # memasukkan data
        id = str(input("Masukkan ID: "))
        name = str(input("Masukkan Nama: "))
        bidang = str(input("Masukkan Bidang: "))
        partai = str(input("Masukkan Partai: "))
        dpr.tambah(id, name, bidang, partai)

    # ubah data
    elif pilihan == "2":
        dpr.ubah(id, name, bidang, partai)

    # hapus data
    elif pilihan == "3":
        dpr.hapus(id)

    # menampilkan data
    elif pilihan == "4":
        dpr.tampilkan_data()

    # jika pilihan tidak sesuai
    else:
        print("Pilihan tidak valid.")