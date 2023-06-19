/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class MenuPrincipal {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char sino;
    
    public void Menu(){
        JOptionPane.showMessageDialog(null, "Bienvenido al Reproductor de Musica");
        sino='s';
        
        while (sino=='s') {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion del siguiente Menu:"
            + "\n" + "1. Canciones"
            + "\n" + "2. Artistas" 
            + "\n" + "3. Albunes" 
            + "\n" + "4. Lista de Reproducción" 
            + "\n" + "5. Salir" ));
            
            Opciones Ope = new Opciones();
            
            switch (opcion) {
                case 1:
                    Ope.Canciones();
                break;
                case 2:
                    Ope.Artistas();
                break;
                case 3:
                    Ope.Albumes();
                break;
                case 4:
                    Ope.ListaDeReproduccion();
                break;
                default:
                    System.out.println("Gracias vuelva pronto");
                break;
            }
            sino = JOptionPane.showInputDialog(null, "¿Desea realizar otra accion (s/n)").charAt(0);
        }
    }    
}