package org.example.Exercice23;

public class Joueur {
    private String nom;
    private int niveau;
    private int xp;
    private int queteEffectuer = 0;

    public Joueur(String nom) {
        this.nom = nom;
        this.niveau = 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        System.out.println(this.nom + " change de pseudo : " + nom);
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    private void levelUp() {
        if (this.xp >= 100) {
            this.niveau++;
            this.xp = 0;
            System.out.println("le joueur "+ this.nom + " passe au niveaux :"+ this.niveau);
        }

    }
    public void effectuerUneQuete() {
        this.xp += 10;
        this.queteEffectuer++;
        System.out.println("Le joueur " +this.nom+" effectue la quête n° " + this.queteEffectuer);
        levelUp();
        }

}
