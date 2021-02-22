import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        boolean abbruch= scanner.hasNext("4");

        System.out.println("Schreibe ein Wort in Großbuchstaben");

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
            if (wort.contains("D")){
                wort=wort.replace("D", "D");
            }
            if (wort.contains("E")){
                wort=wort.replace("E", "3");
            }
            if (wort.contains("F")){
                wort=wort.replace("F", "F");
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
            if (wort.contains("J")){
                wort=wort.replace("J", "J");
            }
            if (wort.contains("K")){
                wort=wort.replace("K", "K");
            }
            if (wort.contains("L")){
                wort=wort.replace("L", "1");
            }
            if (wort.contains("M")){
                wort=wort.replace("M", "M");
            }
            if (wort.contains("N")){
                wort=wort.replace("N", "N");
            }
            if (wort.contains("O")){
                wort=wort.replace("O", "0");
            }
            if (wort.contains("P")){
                wort=wort.replace("P", "P");
            }
            if (wort.contains("Q")){
                wort=wort.replace("Q", "Q");
            }
            if (wort.contains("R")){
                wort=wort.replace("R", "R");
            }
            if (wort.contains("S")){
                wort=wort.replace("S", "$");
            }
            if (wort.contains("T")){
                wort=wort.replace("T", "7");
            }
            if (wort.contains("U")){
                wort=wort.replace("U", "U");
            }
            if (wort.contains("V")){
                wort=wort.replace("V", "V");
            }
            if (wort.contains("W")){
                wort=wort.replace("W", "W");
            }
            if (wort.contains("X")){
                wort=wort.replace("X", "X");
            }
            if (wort.contains("Y")){
                wort=wort.replace("Y", "Y");
            }
            if (wort.contains("Z")){
                wort=wort.replace("Z", "Z");
            }
            System.out.println(wort);
        }

    }
}
