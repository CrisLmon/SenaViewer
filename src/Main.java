import java.util.InputMismatchException;
import java.util.Scanner;
import edu.misena.senaviewer.model.*;

public class Main {
 public static void main(String[] args) {
   Scanner miScanner = new Scanner(System.in);


   System.out.println("\nMenú principal\n\n");
   System.out.println("1. Movies\n2. Series\n3. Books\n4. Magazines\n5. Exit\n");
   System.out.println("\nSeleccione una de las opciones.\n");
   
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
   while (option != 5) {
      switch (option) {
         case 1:
            Movie.mostrarNombres();
         case 2:
            Serie.mostrarNombres
         case 3:
            Book.mostrarNombres();
         case 4:
            Magazine.mostrarNombres();
         default:
            break;
      };
   
   }
 }
}
