package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        public static void main(String[] args) {
            int noOfLines;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no of lines for pattern you want: ");
            noOfLines = sc.nextInt();
            System.out.println("Left Staircase Pattern:");
            for(int row = 0; row < noOfLines; row++) {
                for(int col = 0; col < noOfLines; col++) {
                    if(row >= col)
                        System.out.print("#");
                }
                System.out.println();
            }

        }

    }

    }

    //todo Task 3
    public void printPyramid(String[] args){
        // input your solution here
        int rows = 6, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Bitte Höhe eingeben:");
                int h = sc.nextInt();

                if (h >= 0 && h % 2 != 0) {

                    System.out.println("Bitte char eingeben:");
                    char c = sc.next().charAt(0);

                    int cAlsInt = 9;

                    int mitte = h / 2;

                    int kleinsterWertUeberhaupt = cAlsInt - mitte;

                    for (int i = 0; i < h; i++) {

                        // Anzahl der Leerzeichen
                        int x = 0;

                        if (i <= mitte) {
                            x = mitte - i;
                        } else {
                            x = i - mitte;
                        }


                        int kleinsterWertInDerItenZeile = 0;

                        if (i <= mitte) {
                            kleinsterWertInDerItenZeile = cAlsInt - i;
                        } else {
                            kleinsterWertInDerItenZeile = kleinsterWertUeberhaupt + (i - mitte);
                        }

                        for (int k = kleinsterWertInDerItenZeile; k <= cAlsInt; k++) {
                            System.out.print(k);
                        }

                        for (int k = cAlsInt - 1; k >= kleinsterWertInDerItenZeile; k--) {
                            System.out.print(k);
                        }

                        // Zeilenumbruch
                        System.out.print("\n");

                    }

                } else
                    System.out.println("Inkorrekte Eingabe!");

            }

            private static void gebeXLeerzeichenAus(int x) {
                for (int k = 0; k < x; k++) {
                    System.out.print(" ");
                }
            }
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        public static void main(String[] args) {

            Scanner in = new Scanner (System.in);

            double note;
            int notenanzahl=0;
            double summe = 0;
            double durchschnitt = 0;


            do {
                System.out.println("Geben Sie ihre Noten ein");
                note = in.nextDouble();

                notenanzahl ++;

                summe = summe + notenanzahl;
                summe++;

            }while ( note<6);

            durchschnitt = summe / (notenanzahl) ;

            System.out.println("Der Durchschnitt der Noten ist " + durchschnitt);
        }

    }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        public static int isHappyNumber(int num){
            int rem = 0, sum = 0;

            while(num > 0){
                rem = num%10;
                sum = sum + (rem*rem);
                num = num/10;
            }
            return sum;
        }
        public static void main(String[] args) {
            int num = 82;
            int result = num;

            while(result != 1 && result != 4){
                result = isHappyNumber(result);
            }
            if(result == 1)
                System.out.println(num + " is a happy number");
            else if(result == 4)
                System.out.println(num + " is not a happy number");
        }
    }

}

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}