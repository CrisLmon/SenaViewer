import java.util.InputMismatchException;
import java.util.Scanner;

import edu.misena.senaviewer.model.*;

public class Main {
 public static void main(String[] args) {
   Scanner miScanner = new Scanner(System.in);
   String menuPrincipal = """
         _________________________
         Menú Principal

         1. Movies
         2. Series
         3. Books
         4. Magazines
         5. Exit
         _________________________

         """;

   System.out.println(menuPrincipal);
   
   int option = 0;
   boolean valid = false;

   while (valid == false) {
      try {
         option = miScanner.nextInt();
         if (option < 1) {
            System.out.println("Ingrese una de las opciones del menú");
         } else if (option > 5) {
            System.out.println("Ingrese una de las opciones del menú");
         } else {
            valid = true;
         }
      } catch (InputMismatchException e) {
         System.out.println("Ingrese una opción valida.");
         miScanner.nextLine();
      }
   }
   while (option != 6) {
      switch (option) {
         case 1:
            Movie.mostrarNombres();
            System.out.println("\n5) Menú principal");
            System.out.println("6) Salir");
            option = miScanner.nextInt();
            break;
         case 2:
            Series.mostrarNombres();
            System.out.println("\n5) Menú principal");
            System.out.println("6) Salir");
            option = miScanner.nextInt();
            break;
         case 3:
            Book.mostrarNombres();
            System.out.println("\n5) Menú principal");
            System.out.println("6) Salir");
            option = miScanner.nextInt();
            break;
         case 4:
            Magazine.mostrarNombres();
            System.out.println("\n5) Menú principal");
            System.out.println("6) Salir");
            option = miScanner.nextInt();
            break;
         case 5:
            System.out.println(menuPrincipal);
            option = miScanner.nextInt();
         default:
            break;
      };
   
   }
 }
}
