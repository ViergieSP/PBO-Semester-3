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
