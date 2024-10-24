public class Main {
    public static void main(String[] args) {
        try {
            // Creation de l'equipe
            Equipe equipe = new Equipe(1, "Esperance Sportive de Tunis");

            // Ajout de joueurs (avec des noms de joueurs de l'EST)
            Joueur joueur1 = new Joueur("Anice Badri", 33, 1.78, 74.0, 120, "Attaque");
            Joueur joueur2 = new Joueur("Mohamed Ali Ben Romdhane", 24, 1.85, 78.0, 80, "Centre");
            Joueur joueur3 = new Joueur("Hamdi Nagguez", 31, 1.91, 81.0, 90, "Défense");
            Joueur joueur4 = new Joueur("Yassine Meriah", 31, 1.89, 82.0, 75, "Défense");
            Joueur joueur5 = new Joueur("Moez Ben Cherifia", 32, 1.87, 80.0, 150, "Gardien");

            // Ajout des joueurs à l'equipe
            equipe.ajouterJoueur(joueur1);
            equipe.ajouterJoueur(joueur2);
            equipe.ajouterJoueur(joueur3);
            equipe.ajouterJoueur(joueur4);
            equipe.ajouterJoueur(joueur5);

            // Ajout de titres
            Titre titre1 = new Titre("Championnat de Tunisie", 2023);
            Titre titre2 = new Titre("Ligue des Champions CAF", 2021);
            equipe.ajouterTitre(titre1);
            equipe.ajouterTitre(titre2);

            // Affichage de l'equipe et des joueurs
            equipe.afficher();

            // Test des methodes get
            System.out.println("\nDetails du joueur 1: " + equipe.getJoueur(0));

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
