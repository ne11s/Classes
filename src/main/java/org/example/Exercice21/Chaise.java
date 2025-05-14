package org.example.Exercice21;

public class Chaise {
    private int nbrPieds;
    private String matier;
    private String couleur;
    private double prix;

    public Chaise(int nbrPieds, String matier,String couleur, double prix ) {
        this.nbrPieds = nbrPieds;
        this.matier = matier;
        this.prix = prix;
        this.couleur = couleur;
    }
    public int getNbrPieds() {
        return nbrPieds;
    }

    public void setNbrPieds(int nbrPieds) {
        this.nbrPieds = nbrPieds;
    }

    public String getMatier() {
        return matier;
    }

    public void setMatier(String matier) {
        this.matier = matier;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Je suis une chaise avec " + nbrPieds + " pied" + (nbrPieds > 1 ? "s " : ' ' ) + "en " + matier + " de couleur " + couleur +" à un prix de " + prix ;
    }
}
