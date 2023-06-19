/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */


public class Opciones {
    char sino;
    String cancion, artista, album, genero;
    int numero, año;

    private List<Cancion> canciones;

    public void Canciones() {
        sino = 's';
        numero = 0;
        
        System.out.println("\t\t\t\tLista de Canciones\t\t\t\t"
        + "\n" + "No." + "\t\t" + "Cancion"+ "\t\t" + "Artita" + "\t\t" + "Album" + "\t\t" + "Año" + "\t\t" + "Genero" );

        canciones = new ArrayList<>();

        while (sino == 's') {
            numero++;
            cancion = JOptionPane.showInputDialog(null, "Ingresa el nombre de la cancion:");
            artista = JOptionPane.showInputDialog(null, "Ingresa el nombre del artista:");
            album = JOptionPane.showInputDialog(null, "Ingresa el nombre del album:");
            año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año de estreno:"));
            genero = JOptionPane.showInputDialog(null, "Ingresa el genero al que pertenece");
            
            //Cancion cancion = new Cancion(numero, cancion, artista, album, año, genero);
            //canciones.add(cancion);

            System.out.print("\n" + numero + "\t\t" + cancion + "\t\t" + artista + "\t\t" + album + "\t\t" + año + "\t\t" + genero);

            sino = JOptionPane.showInputDialog(null, "¿Desea agregar otra cancion (s/n)").charAt(0);
        }
    }

    public void Artistas(List<Cancion> canciones) {
        List<String> artistas = new ArrayList<>();

        for (Cancion cancion : canciones) {
            if (!artistas.contains(cancion.getArtista())) {
                artistas.add(cancion.getArtista());
            }
        }

        System.out.println("\nArtistas:");
        for (String artista : artistas) {
            System.out.println(artista);
        }
    }

    public void Albumes(List<Cancion> canciones) {
        List<String> albumes = new ArrayList<>();

        for (Cancion cancion : canciones) {
            if (!albumes.contains(cancion.getAlbum())) {
                albumes.add(cancion.getAlbum());
            }
        }

        System.out.println("\nÁlbumes:");
        for (String album : albumes) {
            System.out.println(album);
        }
    }

    public void ListaDeReproduccion(List<Cancion> canciones) {
        List<String> listaReproduccion = new ArrayList<>();

        for (Cancion cancion : canciones) {
            listaReproduccion.add(cancion.getCancion());
        }

        System.out.println("\nLista de Reproducción:");
        for (String cancion : listaReproduccion) {
            System.out.println(cancion);
        }
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }
}


