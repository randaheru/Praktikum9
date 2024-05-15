import java.util.Scanner;

// Kelas Point untuk merepresentasikan setiap poin dalam linked list
class Point {
    String question;
    String answer;
    Point nextPoint;

    public Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
    }
}