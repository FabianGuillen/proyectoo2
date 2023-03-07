import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PROYECTO {
    public static void main(String[] args) {

        try (Scanner Teclado = new Scanner(System.in)) {
            String Nombres[];
            int nElemento;


            nElemento = Integer.parseInt(JOptionPane.showInputDialog("Dijita la cantidad de elementos que quieras comprar de la tienda ")); 
            Nombres = new String[nElemento];


            for(int i = 0;i < nElemento; i++) {
                System.out.print("Digite un nombre de producto :  ");
                Nombres[i] = Teclado.next();

            }

      System.out.println("");
            System.out.println("El arreglo desordenado");
            for(int i = 0;i < nElemento; i++) {
            System.out.println(Nombres[i] + "");

            }

            System.out.println("");

            //MTODO BURBUJA
            String Auxiliar;
      for(int i = 0;i < (nElemento - 1); i++) {  
               for(int j = 0;j < (nElemento - 1); j++) {
               if(Nombres[j].compareTo(Nombres[j+1]) > 0){
                   Auxiliar =  Nombres[j];
                   Nombres[j] = Nombres[j+1];
                   Nombres[j+1] = Auxiliar;
               }

            }
    }
      System.out.println("El areglo ordenado de los productos es : ");
      for(int i = 0;i < nElemento; i++) {
                System.out.println(Nombres[i] + "");
      }
        } catch (NumberFormatException | HeadlessException e) {

            e.printStackTrace();
        }

     }
     // Edgar Fabian Cruz Guillen
}