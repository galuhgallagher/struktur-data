package UTS.Tumpukan;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    stackEditor editor = new stackEditor();

    while (true) {
      System.out.println(">>> SIMULASI TEKS EDITOR UNISLA <<<");
      System.out.println("1. Tulis kata baru");
      System.out.println("2. Undo (hapus kata terakhir)");
      System.out.println("3. Lihat teks saat ini");
      System.out.println("4. Keluar");
      System.out.print("Pilih menu: ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Masukkan kata: ");
          String word = scanner.nextLine();
          editor.Push(word);
          break;

        case 2:
          editor.Pop();
          break;

        case 3:
          System.out.println("=====================================================");
          editor.Display();
          System.out.println("=====================================================");
          break;

        case 4:
          System.out.println("Keluar dari program.");
          scanner.close();
          return;

        default:
          System.out.println("Pilihan tidak valid, silakan coba lagi.");
      }
    }
  }
}

class stackEditor {
    private Node top;

    public void Push(String word) {
      Node newNode = new Node(word);
      newNode.next = top;
      top = newNode;
    }

    public String Pop() {
      if (top == null) {
        return null;
      }
      String removed = top.data;
      top = top.next;
      return removed;
    }

    public boolean isEmpty() {
      return top == null;
    }

    public void Display() {
      if (isEmpty()) {
        System.out.println("[kosong]");
        return;
      }

      int count = 0;
      Node current = top;
      while (current != null) {
        count++;
        current = current.next;
      }

      String[] words = new String[count];
      current = top;
      int index = 0;

      while (current != null) {
        words[index++] = current.data;
        current = current.next;
      }

      for (int i = count - 1; i >= 0; i--) {
        System.out.print(words[i]);
        if (i != 0) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

class Node {
  String data;
  Node next;

  Node(String data) {
    this.data = data;
    this.next = null;
  }
}
