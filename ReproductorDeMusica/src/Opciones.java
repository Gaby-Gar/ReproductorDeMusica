/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Opciones {
    char sino;
    String cancion, artista, album, genero;
    int numero, año;
    
    public void Canciones(){
        sino = 's';
        numero = 0;
        
        System.out.println("\t\t\t\tLista de Canciones\t\t\t\t"
        + "\n" + "No." + "\t\t" + "Cancion"+ "\t\t" + "Artita" + "\t\t" + "Album" + "\t\t" + "Año" + "\t\t" + "Genero" );
        
        while(sino=='s'){
            numero++;
            cancion = JOptionPane.showInputDialog(null, "Ingresa el nombre de la cancion:");
            artista = JOptionPane.showInputDialog(null, "Ingresa el nombre del artista:");
            album = JOptionPane.showInputDialog(null, "Ingresa el nombre del album:");
            año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año de estreno:"));
            genero = JOptionPane.showInputDialog(null, "Ingresa el genero al que pertenece");
            
            System.out.print("\n" + numero + "\t\t" + cancion + "\t\t" + artista + "\t\t" + album + "\t\t" + año + "\t\t" + genero);
            
            sino = JOptionPane.showInputDialog(null, "¿Desea agregar otra cancion (s/n)").charAt(0);
        }
    }
    
    public void Artistas(){
    
    }
    
    public void Albumes(){
    
    }
    
    public void ListaDeReproduccion(){
    
    }
}

