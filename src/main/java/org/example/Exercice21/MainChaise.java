package org.example.Exercice21;

public class MainChaise {
    public static void main(String[] args) {
        Chaise chaise1 = new Chaise(4,"Chaine","bleu",14.4);
        Chaise chaise2 = new Chaise(3,"Bambou","gris",130.99);
        Chaise chaise3 = new Chaise(1,"métal","orange",76.25);

        System.out.println(chaise1);
        System.out.println(chaise2);
        System.out.println(chaise3);
    }
}
