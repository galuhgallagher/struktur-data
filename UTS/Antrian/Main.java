package UTS.Antrian;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    queueEditor editor = new queueEditor();

    while(true) {
      System.out.println(">>> SISTEM ANTRIAN KLINIK UNISLA<<<");
      System.out.println("1. Tambah pasien baru");
      System.out.println("2. Layani pasien");
      System.out.println("3. Lihat pasien di Depan");
      System.out.println("4. Lihat semua antrian");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Masukkan nomor antrian pasien: ");
          int number = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Masukkan nama pasien: ");
          String name = scanner.nextLine();
          System.out.print("Keluhan singkat pasien: ");
          String complaint = scanner.nextLine();
          editor.Enqueue(number, name, complaint);
          System.out.println("Pasien [" + number + "] \"" + name + "\" telah ditambahkan ke antrian.");
          break;

        case 2:
          Node served = editor.Dequeue();
          if (served != null) {
            System.out.println("Pasien yang dilayani: [" + served.number + "] " + served.name + " - " + served.complaint);
          } else {
            System.out.println("Tidak ada pasien untuk dilayani (antrian kosong).");
          }
          break;

        case 3:
          editor.Peek();
          break;

        case 4:
          System.out.println("=====================================================");
          System.out.println("============== Daftar Antrian Pasien ================");
          System.out.println("=====================================================");
          Node current = editor.front;
          if (current == null) {
            System.out.println("Antrian kosong.");
          } else {
            int position = 1;
            while (current != null) {
              System.out.println(position + ". [" + current.number + "] " + current.name + " - " + current.complaint);
              current = current.next;
              position++;
            }
          }
          System.out.println("=====================================================");
          break;

        case 5:
          System.out.println("Keluar dari program.");
          scanner.close();
          return;

        default:
          System.out.println("Pilihan tidak valid, silakan coba lagi.");
    }
  }
  }
}

class queueEditor {
  Node front;
  Node rear;

  public void Enqueue(int number, String name, String complaint) {
    Node newNode = new Node(number, name, complaint);
    if (rear != null) {
      rear.next = newNode;
    }
    rear = newNode;
    if (front == null) {
      front = newNode;
    }
  }

  public Node Dequeue() {
    if (front != null) {
      Node served = front;
      front = front.next;
      if (front == null) {
        rear = null;
      }
      served.next = null;
      return served;
    }
    return null;
  }

  public void Peek() {
    if (front == null) {
      System.out.println("Antrian kosong.");
      return;
    }
    System.out.println("Pasien di depan: [" + front.number + "] " + front.name + " - " + front.complaint);
  }
}

class Node {
  int number;
  String name;
  String complaint;
  Node next;

  public Node(int number, String name, String complaint) {
    this.number = number;
    this.name = name;
    this.complaint = complaint;
    this.next = null;
  }

  public Node(String word) {
    this.number = -1;
    this.name = word;
    this.complaint = "";
    this.next = null;
  }
}


