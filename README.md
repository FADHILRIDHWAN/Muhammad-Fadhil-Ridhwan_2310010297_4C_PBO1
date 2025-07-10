# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah simulasi sistem antrian dan layanan barbershop berbasis Java. Proyek ini dibuat sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi menerima input berupa nama dan no HP pelanggan. Kemudian pelanggan memilih layanan yang tersedia, dimasukkan ke dalam antrian, dan dilayani sesuai urutan. Aplikasi juga menghitung total pemasukan dari layanan yang diberikan.

Aplikasi ini mengimplementasikan berbagai konsep OOP (Object Oriented Programming) secara lengkap.

---

## Penjelasan Kode Berdasarkan Konsep OOP

### 1. **Class**
Class digunakan sebagai blueprint dari objek. Program ini memiliki class:
- `Pelanggan`
- `Layanan`
- `LayananPremium`
- `Antrian`
- `MainApp`

### 2. **Object**
Objek dibuat dari class-class tersebut:
```java
Pelanggan pelanggan = new Pelanggan(nama, noHP, daftarLayanan[layananIndex]);
Layanan layanan = new Layanan("Pangkas Biasa", 15000, 20);
```

### 3. **Atribut**
Atribut menyimpan data dalam class:
```java
private String nama;
private int harga;
private int durasi;
```
Contohnya ada dalam class `Layanan` dan `Pelanggan`.

### 4. **Constructor**
Method yang digunakan saat pembuatan objek:
```java
public Layanan(String nama, int harga, int durasi) {
    this.nama = nama;
    this.harga = harga;
    this.durasi = durasi;
}
```

### 5. **Mutator (Setter)**
Method untuk mengubah nilai atribut:
```java
public void setNama(String nama) {
    this.nama = nama;
}
```
Terdapat di class `Pelanggan`.

### 6. **Accessor (Getter)**
Method untuk mengambil nilai atribut:
```java
public String getNama() {
    return nama;
}
```
Terdapat di hampir semua class.

### 7. **Encapsulation**
Menyembunyikan data dengan modifier `private` dan memberi akses lewat getter/setter:
```java
private String nama;
public String getNama() { return nama; }
```

### 8. **Inheritance**
Pewarisan atribut dan method:
```java
class LayananPremium extends Layanan {
    ...
}
```
`LayananPremium` mewarisi class `Layanan`.

### 9. **Polymorphism**
Kemampuan objek memiliki banyak bentuk. Misalnya:
```java
@Override
public void deskripsiLayanan() {
    System.out.println("[PREMIUM] " + getNama() + ...);
}
```
Method tersebut menimpa `deskripsiLayanan` di `Layanan`.

### 10. **Seleksi**
Logika percabangan menggunakan `if`, `else`, `switch`, dll:
```java
if (layananIndex < 0 || layananIndex >= daftarLayanan.length) {
    System.out.println("Layanan tidak valid.");
}
```

### 11. **Perulangan**
Digunakan untuk menampilkan seluruh data layanan:
```java
for (int i = 0; i < daftarLayanan.length; i++) {
    daftarLayanan[i].deskripsiLayanan();
}
```

### 12. **IO Sederhana**
Berupa interaksi input dan output:
```java
Scanner input = new Scanner(System.in);
System.out.print("Nama: ");
String nama = input.nextLine();
```

### 13. **Array**
Menyimpan beberapa objek layanan:
```java
Layanan[] daftarLayanan = new Layanan[4];
```

### 14. **Error Handling**
Menangani kesalahan input:
```java
try {
    pilihan = Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid.");
}
```

---

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

---

## Pembuat

Nama: Muhammad Fadhil Ridhwan  
NPM: 2310010297
