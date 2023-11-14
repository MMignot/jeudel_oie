package fr.dampierre;

import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        Random generateur = new Random();

        int plateau = 0;
        int jeu = 20;
        String perdu = "Vous avez perdu !";
        String gagne = "Vous avez gagné !";
        int cpt = 0;
        
        while (plateau != jeu) {
            
            for (int i = 1; i <= 5; i++){
            int lancer = generateur.nextInt(6) + 1;
            plateau = plateau + lancer;
            int avancement = jeu - plateau;
            System.out.println("Lancer " + i + " : vous avez fait " + lancer + ". Vous êtes sur la case " + plateau + 
            " (encore " + avancement + " cases)");    
            }
            if (plateau != jeu) {
            System.out.println(perdu);
            plateau = 0;
            cpt = cpt + 1;
            } else {
            System.out.println(gagne);
            cpt = cpt + 1;
            System.out.println("Nombre de parties : " + cpt);
            }
        }
    }
    
}