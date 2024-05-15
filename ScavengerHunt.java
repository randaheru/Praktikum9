// Kelas ScavengerHunt untuk mengatur seluruh permainan

import java.util.Scanner;

class ScavengerHunt {
    Point startPoint;
    Point currentPoint;

    public ScavengerHunt() {
        startPoint = null;
        currentPoint = null;
    }

    // Method untuk menambahkan poin baru ke linked list
    public void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (startPoint == null) {
            startPoint = newPoint;
            currentPoint = startPoint;
        } else {
            Point temp = startPoint;
            while (temp.nextPoint != null) {
                temp = temp.nextPoint;
            }
            temp.nextPoint = newPoint;
        }
    }

    // Method untuk memulai perburuan
    public void startHunt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Scavenger Hunt!");
        System.out.println("Setiap pertanyaan memiliki sebuah kunci jawaban. Jawablah dengan benar untuk melanjutkan perburuan.");
        System.out.println("Mari kita mulai!");
        currentPoint = startPoint;
        while (currentPoint != null) {
            System.out.println("\n" + currentPoint.question);
            System.out.print("Jawaban: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            if (userAnswer.equals(currentPoint.answer)) {
                System.out.println("Selamat! Jawaban kamu benar!");
                if (currentPoint.nextPoint != null) {
                    System.out.println("Langsung ke pertanyaan berikutnya...");
                    currentPoint = currentPoint.nextPoint;
                } else {
                    System.out.println("Selamat! Kamu telah menemukan harta karun!");
                    break;
                }
            } else {
                System.out.println("Jawaban kamu salah. Coba lagi!");
            }
        }
        scanner.close();
    }
}