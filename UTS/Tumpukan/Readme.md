# 📝 Simulasi Teks Editor UNISLA

**Tugas Struktur Data – Implementasi Stack (Linked List)**

## 📖 Deskripsi

Program ini merupakan simulasi sederhana dari **teks editor** berbasis **struktur data Stack**.  
Konsep utama yang digunakan adalah **operasi LIFO (Last In, First Out)**, di mana kata terakhir yang ditulis akan menjadi kata pertama yang dihapus saat melakukan _undo_.

Program ini ditulis menggunakan **bahasa pemrograman Java**, dan menggunakan **Linked List** sebagai implementasi struktur stack.

---

## ⚙️ Fitur Program

1. **Menulis kata baru** – pengguna dapat menambahkan kata ke dalam teks.
2. **Undo (hapus kata terakhir)** – menghapus kata terakhir yang dimasukkan.
3. **Melihat teks saat ini** – menampilkan seluruh teks yang sudah ditulis.
4. **Keluar dari program** – menghentikan simulasi editor.

---

## 🧠 Konsep Struktur Data yang Digunakan

Program ini menggunakan **stack** yang diimplementasikan dengan **Linked List** melalui kelas `Node` dan `stackEditor`.

- **Push(String word)** → Menambahkan kata baru ke bagian atas stack.
- **Pop()** → Menghapus kata terakhir dari stack.
- **Display()** → Menampilkan seluruh isi stack dari bawah ke atas (urutan penulisan sebenarnya).
- **isEmpty()** → Mengecek apakah stack kosong.

---

## 🧩 Contoh Interaksi Program

```
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 1
Masukkan kata: Aku
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 1
Masukkan kata: Jawa
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 3
=====================================================
Aku Jawa
=====================================================
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 2
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 3
=====================================================
Aku
=====================================================
>>> SIMULASI TEKS EDITOR UNISLA <<<
1. Tulis kata baru
2. Undo (hapus kata terakhir)
3. Lihat teks saat ini
4. Keluar
Pilih menu: 4
Keluar dari program.
```

---

## 🧾 Penjelasan Singkat

- **Stack** digunakan agar operasi Undo berjalan efisien.
- Setiap kali pengguna menulis kata baru, kata tersebut ditambahkan ke puncak stack `Push()`.
- Saat pengguna melakukan Undo, kata terakhir dihapus dari puncak stack `Pop()`.
- Saat menampilkan teks, seluruh isi stack dicetak dari bawah ke atas agar urutannya sesuai teks asli.

---
