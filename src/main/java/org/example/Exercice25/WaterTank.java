package org.example.Exercice25;

public class WaterTank {
    private double poidsVide;
    private double capaciteMax;
    private double niveauRemplissage;
    private static int nombreDeCiterne= 0;
    private static int totaleDesVolume;
    public WaterTank(double poidsVide, double capaciteMax, double niveauRemplissage) {
        this.poidsVide = poidsVide;
        this.capaciteMax = capaciteMax;
        this.niveauRemplissage = niveauRemplissage;
        System.out.println();
        nombreDeCiterne++;
    }

}
