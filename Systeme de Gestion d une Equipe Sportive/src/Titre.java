public class Titre {
    private String nomTitre;
    private int annee;

    // Constructeur
    public Titre(String nomTitre, int annee) {
        this.nomTitre = nomTitre;
        this.annee = annee;
    }

    /**************** Les Getteurs ******************/

    public String getNomTitre() {
        return nomTitre;
    }
    public int getAnnee() {
        return annee;
    }

    /**************** Les Setteurs ******************/

    public void setNomTitre(String nomTitre) {
        this.nomTitre = nomTitre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return nomTitre + " (" + annee + ")";
    }


}