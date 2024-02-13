# Saya Jasmine Noor Fawzia [2200598] mengerjakan soal LP1 dalam Mata Kuliah DPBO
# untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan
# Aamiin

# deklarasi class
class DPR:
    
    # atribut private. tidak ada tipe data dan instansiasi
    # untuk private ( __ ), untuk protected ( _ ), untuk public tidak ada
    __id = ""       #deklarasi atribut untuk id
    __name = ""     #deklarasi atribut untuk nama
    __bidang = ""   #deklarasi atribut untuk bidang
    __partai = ""   #deklarasi atribut untuk partai
    
    # hanya menggunakan satu constructor, gunakan default value
    def __init__(self, id = "", name = "", bidang = "", partai = ""):
        self.__id = id          #set id
        self.__name = name      #set nama
        self.__bidang = bidang  #set bidang
        self.__partai = partai  #set partai
        
    # get id
    def get_id(self):
        return self.__id
    
    # set id
    def set_id(self, id):
        self.__id = id
    
    # get name
    def get_name(self):
        return self.__name
    
    # set name
    def set_name(self, name):
        self.__name = name
        
    # get bidang
    def get_bidang(self):
        return self.__bidang
    
    # set bidang
    def set_bidang(self, bidang):
        self.__bidang = bidang
        
    # get partai
    def get_partai(self):
        return self.__partai
    
    # set partai
    def set_partai(self, partai):
        self.__partai = partai
        
    # public method
    def __init__(self):
        self.anggota_dpr = []
    
    # tambah anggota dpr
    def tambah(self, id, name, bidang, partai):
        anggota_baru = {"id": id, "name": name, "bidang": bidang, "partai": partai}
        self.anggota_dpr.append(anggota_baru)
        print("Data Anggota DPR berhasil ditambahkan.")
    
    # ubah anggota dpr
    def ubah(self, id, name, bidang, partai):
        id = str(input("Masukkan ID Anggota DPR yang ingin diubah: "))
        for anggota in self.anggota_dpr:
            # jika id ketemu
            if anggota["id"] == id:
                print("ID Anggota DPR ditemukan. Masukkan data baru!")
                name = str(input("Masukkan Nama baru: "))
                bidang = str(input("Masukkan Bidang baru: "))
                partai = str(input("Masukkan Partai baru: "))
                anggota["name"] = name
                anggota["bidang"] = bidang
                anggota["partai"] = partai
                print("Data Anggota DPR berhasil diubah.")
                return
        # jika id tidak ada
        print("ID Anggota DPR tersebut tidak ditemukan.")

    # hapus anggota dpr
    def hapus(self, id):
        # jika belum memasukkan data
        if len(self.anggota_dpr) == 0:
            print("Belum ada data anggota DPR.")
            return
        
        id = str(input("Masukkan ID Anggota DPR yang ingin dihapus: "))
        for anggota in self.anggota_dpr:
            # jika id ketemu
            if anggota["id"] == id:
                self.anggota_dpr.remove(anggota)
                print("ID anggota DPR ditemukan. Data berhasil dihapus.")
                return
        # jika id tidak ada
        print("ID Anggota DPR tersebut tidak ditemukan.")
    
    # tampilkan data
    def tampilkan_data(self):
        # jika belum memasukkan data
        if len(self.anggota_dpr) == 0:
            print("Belum ada data anggota DPR.")
            return

        # mencari panjang maksimum untuk setiap kolom
        max_id_length = max(len(anggota['id']) for anggota in self.anggota_dpr)
        max_name_length = max(len(anggota['name']) for anggota in self.anggota_dpr)
        max_bidang_length = max(len(anggota['bidang']) for anggota in self.anggota_dpr)
        max_partai_length = max(len(anggota['partai']) for anggota in self.anggota_dpr)
        
        # menentukan panjang untuk judul kolom
        max_id_length = max(max_id_length, len("ID Anggota"))
        max_name_length = max(max_name_length, len("Nama Anggota"))
        max_bidang_length = max(max_bidang_length, len("Bidang"))
        max_partai_length = max(max_partai_length, len("Partai"))
    
        # membuat tabel dengan lebar kolom yang sesuai dengan panjang maksimum
        print("Data Anggota DPR")
        # mencetak garis bawah tabel
        print(f"+{'-' * 4}+{'-' * (max_id_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_bidang_length + 2)}+{'-' * (max_partai_length + 2)}+")
        # menampilkan judul kolom
        print(f"| {'No'} | {'ID Anggota':<{max_id_length}} | {'Nama Anggota':<{max_name_length}} | {'Bidang':<{max_bidang_length}} | {'Partai':<{max_partai_length}} |")
        # mencetak garis bawah tabel
        print(f"+{'=' * 4}+{'=' * (max_id_length + 2)}+{'=' * (max_name_length + 2)}+{'=' * (max_bidang_length + 2)}+{'=' * (max_partai_length + 2)}+")


        # menampilkan data dalam bentuk tabel
        for idx, anggota in enumerate(self.anggota_dpr, start = 1):
            id_col = anggota['id'] if len(anggota['id']) >= max_id_length else anggota['id'].ljust(max_id_length)
            name_col = anggota['name'] if len(anggota['name']) >= max_name_length else anggota['name'].ljust(max_name_length)
            bidang_col = anggota['bidang'] if len(anggota['bidang']) >= max_bidang_length else anggota['bidang'].ljust(max_bidang_length)
            partai_col = anggota['partai'] if len(anggota['partai']) >= max_partai_length else anggota['partai'].ljust(max_partai_length)
            print(f"| {idx:2} | {id_col} | {name_col} | {bidang_col} | {partai_col} |")
        
        # mencetak garis bawah tabel
        print(f"+{'-' * 4}+{'-' * (max_id_length + 2)}+{'-' * (max_name_length + 2)}+{'-' * (max_bidang_length + 2)}+{'-' * (max_partai_length + 2)}+")
