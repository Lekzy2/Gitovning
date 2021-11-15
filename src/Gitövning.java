import java.util.Scanner;


public class Medelvärde {
    public static void main(String[] args) {

                int[] resultat = new int[24];

                Scanner tgb = new Scanner(System.in);

                for (int i = 0; i < resultat.length; i++) {
                    System.out.println("ange resultat" + (i + 1) + i++);
                    resultat[i] = tgb.nextInt();
                }
                int summa = 0;

                for (int i = 0; i < resultat.length; i++) {
                    summa = resultat[i];
                }
                double medel = summa / (double) resultat.length;
                System.out.printf("medelresultatet är:" + medel);

    }
}


