# 🏥 Simulasi Sistem Antrian Klinik UNISLA

**Tugas Struktur Data – Implementasi Queue (Linked List)**

## 📖 Deskripsi

Program ini merupakan simulasi sederhana dari **sistem antrian pasien di klinik**,  
yang menggunakan **struktur data Queue (antrian)** berbasis **Linked List**.

Konsep utama yang digunakan adalah **operasi FIFO (First In, First Out)**,  
di mana pasien yang pertama datang akan menjadi pasien pertama yang dilayani.

Program ini ditulis menggunakan **bahasa pemrograman Java**, dan seluruh operasi antrian diatur melalui kelas `queueEditor` serta node pasien melalui kelas `Node`.

---

## ⚙️ Fitur Program

1. **Tambah pasien baru** – menambahkan data pasien ke dalam antrian.
2. **Layani pasien** – menghapus pasien paling depan dari antrian (Dequeue).
3. **Lihat pasien di depan** – menampilkan pasien yang sedang menunggu untuk dilayani.
4. **Lihat semua antrian** – menampilkan seluruh daftar pasien dalam urutan antrian.
5. **Keluar dari program** – menghentikan simulasi sistem antrian.

---

## 🧠 Konsep Struktur Data yang Digunakan

Program ini menggunakan **Queue (antrian)** dengan implementasi **Linked List**.  
Struktur `Node` menyimpan data pasien dan pointer `next` untuk menghubungkan antar node.

Kelas `queueEditor` mengelola operasi utama:

- **Enqueue(int number, String name, String complaint)** → Menambahkan pasien ke antrian.
- **Dequeue()** → Menghapus dan mengembalikan pasien yang ada di depan.
- **Peek()** → Melihat pasien paling depan tanpa menghapusnya.
- **front** dan **rear** → Menunjukkan posisi pasien pertama dan terakhir dalam antrian.

---

## 🧩 Contoh Interaksi Program

```
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 1
Masukkan nomor antrian pasien: 1
Masukkan nama pasien: Ambatukam
Keluhan singkat pasien: Gangguan Jawa
Pasien [1] "Ambatukam" telah ditambahkan ke antrian.
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 1
Masukkan nomor antrian pasien: 2
Masukkan nama pasien: Mas Rusdi
Keluhan singkat pasien: Masuk Angin
Pasien [2] "Mas Rusdi" telah ditambahkan ke antrian.
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 3
Pasien di depan: [1] Ambatukam - Gangguan Jawa
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 4
=====================================================
============== Daftar Antrian Pasien ================
=====================================================
1. [1] Ambatukam - Gangguan Jawa
2. [2] Mas Rusdi - Masuk Angin
=====================================================
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 2
Pasien yang dilayani: [1] Ambatukam - Gangguan Jawa
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 4
=====================================================
============== Daftar Antrian Pasien ================
=====================================================
1. [2] Mas Rusdi - Masuk Angin
=====================================================
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 2
Pasien yang dilayani: [2] Mas Rusdi - Masuk Angin
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 4
=====================================================
============== Daftar Antrian Pasien ================
=====================================================
Antrian kosong.
=====================================================
>>> SISTEM ANTRIAN KLINIK UNISLA<<<
1. Tambah pasien baru
2. Layani pasien
3. Lihat pasien di Depan
4. Lihat semua antrian
5. Keluar
Pilih menu: 5
Keluar dari program.
```

---

## 🧾 Penjelasan Singkat

- **Queue** digunakan karena mekanisme antrian pasien bersifat **masuk duluan, dilayani duluan (FIFO)**.
- **`Enqueue()`** menambahkan pasien baru ke bagian belakang antrian.
- **`Dequeue()`** melayani pasien paling depan dan menghapusnya dari antrian.
- **`Peek()`** digunakan untuk melihat siapa pasien berikutnya tanpa menghapus data.
- Program menggunakan **Linked List** agar penambahan dan penghapusan node lebih efisien tanpa perlu menggeser elemen seperti pada array.
