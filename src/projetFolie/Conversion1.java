package projetFolie;

import java.util.Scanner;
class Conversion1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Entrez une seule lettre A..Z ou a..z : ");
        char c = scanner.next().charAt(0);
        /*if (((int) c > 122) || ((int) c < 65) ||
                (((int) c > 90) && ((int) c < 97))) {
            System.out.println("Caractère non valable");
        } else if ((int) c < 91) {
            System.out.println("Version minuscule : " 
                       + (char) (c + 32));
        } else {
            System.out.println("Version majuscule : " 
                       + (char) (c - 32));
        }*/
    	 if (( c <= 'z' ) && ( c >='a')){
             c= (char) ((int)c + (int)'Z' - (int)'z');
             System.out.println("Version majuscule : " + c);
         } else if (( c <= 'Z' )&& ( c >= 'A')){
             c=(char)((int)c - (int)'Z' + (int)'z');
             System.out.println("Version minuscule : " + c);
         } else {
             System.out.println("Caractère non valable");
         }
    }

}