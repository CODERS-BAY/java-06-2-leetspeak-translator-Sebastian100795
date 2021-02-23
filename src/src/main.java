import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        boolean abbruch= scanner.hasNext("4");

        System.out.println("Schreibe ein Wort in Großbuchstaben und und in der nächsten Zeile 4 zum Bestätigen");

        while (!abbruch){
            String wort= scanner.next();
            if (wort.contains("A")){
                wort=wort.replace("A", "@");
            }
            if (wort.contains("B")){
                wort=wort.replace("B", "8");
            }
            if (wort.contains("C")){
                wort=wort.replace("C", "(");
            }
            if (wort.contains("E")){
                wort=wort.replace("E", "3");
            }
            if (wort.contains("G")){
                wort=wort.replace("G", "6");
            }
            if (wort.contains("H")){
                wort=wort.replace("H", "#");
            }
            if (wort.contains("I")){
                wort=wort.replace("I", "!");
            }
            if (wort.contains("L")){
                wort=wort.replace("L", "1");
            }
            if (wort.contains("O")){
                wort=wort.replace("O", "0");
            }
            if (wort.contains("S")){
                wort=wort.replace("S", "$");
            }
            if (wort.contains("T")){
                wort=wort.replace("T", "7");
            }
            System.out.println(wort);
        }

    }
}
