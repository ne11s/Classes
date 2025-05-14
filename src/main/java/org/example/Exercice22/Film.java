package org.example.Exercice22;

import java.util.Date;

public class Film {
    private String titre;
    private String real;
    private String dateDeSortie;
    private String genre;

    public Film(String titre, String real, String dateDeSortie, String genre) {
        this.titre = titre;
        this.real = real;
        this.dateDeSortie = dateDeSortie;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public String getdateDeSortie() {
        return dateDeSortie;
    }

    public void setdateDeSortie(String dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", réalisateur='" + real + '\'' +
                ", date De Sortie=" + dateDeSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}
