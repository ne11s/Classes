package org.example.Exercice25;

import org.example.Exercice23.Joueur;

public class WaterTank {
    private double poidsVide;
    private double capaciteMax;
    private double niveauRemplissage;
    private static int nombreDeCiterne= 0;
    private int numeroDeCiterne;
    private static double totaleDesVolume;
    public WaterTank(double poidsVide, double capaciteMax, double niveauRemplissage) {
        this.poidsVide = poidsVide;
        this.capaciteMax = capaciteMax;
        this.niveauRemplissage = niveauRemplissage;
        System.out.println();
        numeroDeCiterne= ++nombreDeCiterne;
    }
    public void remplir(double volume) {

        if (niveauRemplissage < volume) {
            niveauRemplissage+= volume;
        } else if( niveauRemplissage>volume){
            niveauRemplissage=capaciteMax;
        }
       totaleDesVolume = niveauRemplissage;
    }
    public void vider(double volume) {
        if (niveauRemplissage >= volume) {
            niveauRemplissage-= volume;
        } else if( niveauRemplissage <volume){
            niveauRemplissage=0;
        }
        totaleDesVolume = niveauRemplissage;
    }
    public static double getTotaleDesVolume() {
        return totaleDesVolume;
    }
    public int getNumeroDeCiterne() {
        return this.numeroDeCiterne;
    }

}
