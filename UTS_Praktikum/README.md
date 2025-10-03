# Sistem Manajemen Hewan Peliharaan (Pet Management System)

## Deskripsi Program

**Sistem Manajemen Hewan Peliharaan** adalah sebuah aplikasi konsol sederhana yang ditulis dalam bahasa Java. Program ini mendemonstrasikan konsep-konsep dasar Pemrograman Berorientasi Objek (PBO) seperti *Inheritance*, *Polymorphism*, *Abstraction*, dan *Interfaces*.

Pengguna dapat melakukan beberapa aksi dasar untuk mengelola hewan peliharaan virtual, yaitu anjing (Dog) dan kucing (Cat).

### Fitur Utama
- **Menambah Hewan Peliharaan**: Pengguna dapat menambahkan hewan baru (Anjing atau Kucing) dengan memasukkan nama dan umurnya.
- **Melihat Daftar Hewan**: Menampilkan semua hewan peliharaan yang telah ditambahkan beserta statusnya (nama, umur, dan level energi).
- **Berinteraksi dengan Hewan**: Pengguna dapat memilih hewan dari daftar untuk melakukan berbagai interaksi, seperti:
    - Memberi makan (untuk memulihkan energi).
    - Menidurkan (untuk memulihkan energi sepenuhnya).
    - Mendengar suara khas hewan.
    - Mengajak bermain (mengurangi energi).
    - Memberi makan spesial (demonstrasi *Method Overloading*).

## Struktur Class

Proyek ini disusun dalam beberapa paket untuk mengorganisir kelas berdasarkan fungsinya. Struktur ini menonjolkan prinsip-prinsip desain PBO.

```
.
├── base/
│   └── Pet.java        // Kelas abstract dasar untuk semua hewan
├── behavior/
│   └── Interactable.java // Interface untuk perilaku yang bisa diajak bermain
├── model/
│   ├── Cat.java        // Kelas konkret untuk Kucing
│   └── Dog.java        // Kelas konkret untuk Anjing
└── main/
    └── PetManagementSystem.java // Kelas utama yang berisi logika program dan UI
```

### Penjelasan Komponen

1.  **`base.Pet`**
    - Merupakan sebuah `abstract class` yang menjadi blueprint untuk semua jenis hewan peliharaan.
    - Mengelola atribut umum seperti `name`, `age`, dan `energy`.
    - Menyediakan metode umum seperti `eat()`, `sleep()`, dan `displayInfo()`.
    - Memiliki satu `abstract method` yaitu `makeSound()`, yang wajib diimplementasikan oleh setiap kelas turunannya.

2.  **`behavior.Interactable`**
    - Merupakan sebuah `interface` yang mendefinisikan "kontrak" perilaku.
    - Kelas mana pun yang mengimplementasikan interface ini *harus* menyediakan implementasi untuk metode `play()`.
    - Ini memisahkan kemampuan "bermain" dari kelas dasar `Pet`, sehingga di masa depan bisa saja ada `Pet` yang tidak bisa diajak bermain.

3.  **`model.Dog` dan `model.Cat`**
    - Kelas konkret yang merupakan turunan (`extends`) dari `Pet` dan mengimplementasikan (`implements`) `Interactable`.
    - **Inheritance**: Mewarisi semua properti dan metode dari kelas `Pet`.
    - **Abstraction**: Memberikan implementasi konkret untuk metode abstrak `makeSound()`.
    - **Interface**: Memberikan implementasi untuk metode `play()` dari interface `Interactable`.
    - **Overloading**: Kedua kelas ini juga mendemonstrasikan *method overloading* dengan memiliki metode `eat(String treat)` yang berbeda dari `eat()` yang diwarisi dari `Pet`.

4.  **`main.PetManagementSystem`**
    - Kelas utama yang berisi method `main()` sebagai titik masuk program.
    - Bertanggung jawab untuk menampilkan menu, menerima input dari pengguna, dan mengelola `ArrayList` yang berisi semua objek hewan peliharaan.
    - Mendemonstrasikan **Polymorphism**, di mana objek `Dog` dan `Cat` disimpan dalam sebuah `ArrayList<Pet>` dan metode yang dipanggil akan sesuai dengan tipe objek aslinya pada saat runtime.

## Cara Menjalankan Program

Untuk menjalankan program ini, Anda memerlukan Java Development Kit (JDK) versi 8 atau yang lebih baru terpasang di sistem Anda.

### 1. Struktur Folder

Pastikan semua file Java Anda tersimpan dalam struktur direktori yang sesuai dengan nama paketnya.

```
ProjectRoot/
├── base/
│   └── Pet.java
├── behavior/
│   └── Interactable.java
├── main/
│   └── PetManagementSystem.java
└── model/
    ├── Cat.java
    └── Dog.java
```

### 2. Kompilasi (Compile)

Buka terminal atau command prompt, navigasikan ke direktori `ProjectRoot`, lalu kompilasi semua file Java dengan perintah berikut:

```bash
javac main/PetManagementSystem.java
```

Perintah ini akan secara otomatis mengkompilasi semua file lain yang menjadi dependensi, dan menghasilkan file `.class` di dalam direktori masing-masing.

### 3. Menjalankan (Run)

Setelah kompilasi berhasil, jalankan program dari direktori `ProjectRoot` dengan menyebutkan nama kelas yang berisi method `main` secara lengkap (termasuk nama paketnya):

```bash
java main.PetManagementSystem
```

Program akan berjalan di konsol, dan Anda dapat mulai berinteraksi dengan menu yang ditampilkan.

## Cara Menggunakan Program (Panduan Langkah Demi Langkah)

Setelah program berjalan, Anda akan disambut dengan menu utama. Berikut adalah panduan untuk menggunakan setiap fiturnya.

### 1. Menambah Hewan Peliharaan Baru

Ini adalah langkah pertama yang harus dilakukan jika daftar hewan masih kosong.

1.  Dari menu utama, pilih opsi `1` dan tekan Enter.
    ```
    Masukkan pilihan Anda: 1
    ```
2.  Pilih jenis hewan yang ingin ditambahkan (misalnya, `1` untuk Anjing).
    ```
    Pilih jenis hewan:
    1. Anjing
    2. Kucing
    Pilihan: 1
    ```
3.  Masukkan nama hewan, lalu tekan Enter.
    ```
    Masukkan nama hewan: Milo
    ```
4.  Masukkan umur hewan, lalu tekan Enter.
    ```
    Masukkan umur hewan: 3
    ```
5.  Anda akan mendapatkan pesan konfirmasi bahwa hewan telah berhasil ditambahkan.
    ```
    Milo berhasil ditambahkan ke dalam daftar!
    ```
6.  Ulangi langkah ini untuk menambahkan hewan lain, misalnya seekor kucing.

### 2. Menampilkan Daftar Hewan Peliharaan

Gunakan opsi ini untuk melihat semua hewan yang sudah Anda tambahkan.

1.  Dari menu utama, pilih opsi `2` dan tekan Enter.
2.  Program akan menampilkan daftar semua hewan beserta detailnya (nama, umur, dan energi).
    ```
    --- Daftar Hewan Peliharaan ---
    1. Nama: Milo, Umur: 3, Energi: 100
    2. Nama: Luna, Umur: 2, Energi: 100
    ```
    Jika belum ada hewan, pesan "Belum ada hewan peliharaan yang terdaftar." akan muncul.

### 3. Berinteraksi dengan Hewan Peliharaan

Ini adalah fitur inti dari program.

1.  Dari menu utama, pilih opsi `3` dan tekan Enter.
2.  Program akan menampilkan daftar hewan yang tersedia. Pilih hewan yang ingin Anda ajak berinteraksi dengan memasukkan nomornya.
    ```
    Pilih nomor hewan untuk berinteraksi: 1
    ```
3.  Setelah memilih hewan (misalnya Milo), menu interaksi akan muncul.
    ```
    Anda memilih: Milo
    Pilih Aksi:
    1. Beri Makan
    2. Ajak Tidur
    3. Dengar Suara
    4. Ajak Bermain
    5. Beri Makan Spesial (Overloading)
    Pilihan Aksi:
    ```
4.  Pilih aksi yang diinginkan:
    *   **Pilih `1` (Beri Makan):** Energi hewan akan bertambah 20.
        ```
        Milo sedang makan...
        Energi Milo bertambah menjadi 100
        ```
    *   **Pilih `2` (Ajak Tidur):** Energi hewan akan pulih sepenuhnya menjadi 100.
        ```
        Milo sedang tidur...
        Energi Milo pulih sepenuhnya!
        ```
    *   **Pilih `3` (Dengar Suara):** Hewan akan mengeluarkan suara khasnya.
        ```
        Milo bersuara: Guk! Guk!
        ```
    *   **Pilih `4` (Ajak Bermain):** Energi hewan akan berkurang. Jika energi habis, hewan tidak bisa bermain.
        ```
        Milo sedang bermain lempar tangkap!
        Energi Milo sekarang: 85
        ```
    *   **Pilih `5` (Beri Makan Spesial):** Aksi ini menunjukkan *method overloading*. Anjing akan makan "Tulang" dan kucing akan makan "Tuna", dengan pemulihan energi yang lebih besar daripada makan biasa.
        ```
        Milo sedang makan cemilan favoritnya: Tulang
        Energi Milo bertambah menjadi 100
        ```

### 4. Keluar

Untuk menghentikan program.

1.  Dari menu utama, pilih opsi `4` dan tekan Enter.
2.  Program akan menampilkan pesan "Program selesai." dan aplikasi akan tertutup.
