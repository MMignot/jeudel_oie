package fr.dampierre;

import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        Random generateur = new Random();

        int plateau = 0;
        int jeu = 20;

        for (int i = 1; i <= 5; i++){
            int lancer = generateur.nextInt(6) + 1;
            plateau = plateau + lancer;
            int avancement = jeu - plateau;
            System.out.println("Lancer " + i + " : vous avez fait " + lancer + ". Vous êtes sur la case " + plateau + 
            " (encore " + avancement + " cases)");    
        }
        if (plateau == jeu) {
                System.out.println("Vous avez gagné !");
            } else {
                System.out.println("Vous avez perdu !");
            }
    }

}