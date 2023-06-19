/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Cancion {
    private int numero;
    private String cancion;
    private String artista;
    private String album;
    private int año;
    private String genero;

    public Cancion(int numero, String cancion, String artista, String album, int año, String genero) {
        this.numero = numero;
        this.cancion = cancion;
        this.artista = artista;
        this.album = album;
        this.año = año;
        this.genero = genero;
    }

    public String getCancion() {
        return cancion;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }
}
