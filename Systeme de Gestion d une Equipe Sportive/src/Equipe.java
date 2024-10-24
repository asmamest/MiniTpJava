import java.util.ArrayList;
import java.util.Iterator;

public class Equipe {
    private int id;
    private String nomEquipe;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Titre> titres;

    // Constructeur
    public Equipe(int id, String nomEquipe) {
        this.id = id;
        this.nomEquipe = nomEquipe;
        this.joueurs = new ArrayList<>();
        this.titres = new ArrayList<>();
    }

    /**************** Les Getteurs ******************/
    public int getId() {
        return id;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    // Recuperer un joueur par index
    public Joueur getJoueur(int index) {
        if (index < 0 || index >= joueurs.size()) {
            throw new IndexOutOfBoundsException("Index de joueur invalide.");
        }
        return joueurs.get(index);
    }

    public ArrayList<Titre> getTitres() {
        return titres;
    }

    /**************** Les Setteurs ******************/
    public void setId(int id) {
        this.id = id;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public void setTitres(ArrayList<Titre> titres) {
        this.titres = titres;
    }

    public void ajouterTitre(Titre titre) {
        titres.add(titre);
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    // Afficher toutes les donnees
    public void afficher() {
        System.out.println("Equipe: " + nomEquipe + " (ID: " + id + ")");
        System.out.println("Joueurs:");
        afficherJoueurs();
        System.out.println("Titres:");
        afficherTitres();
    }

    // Afficher tous les titres
    public void afficherTitres() {
        for (Titre titre : titres) {
            System.out.println(titre);
        }
    }

    // Afficher tous les joueurs
    public void afficherJoueurs() {
        for (Joueur joueur : joueurs) {
            System.out.println(joueur);
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Equipe ").append(nomEquipe).append(" (ID: ").append(id).append(")\n");
        sb.append("Joueurs:\n");
        for (Joueur joueur : joueurs) {
            sb.append(joueur.toString()).append("\n");
        }
        sb.append("Titres:\n");
        for (Titre titre : titres) {
            sb.append(titre.toString()).append("\n");
        }
        return sb.toString();
    }
}