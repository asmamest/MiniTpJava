public class Joueur {
    private String nomPrenom;
    private int age;
    private double taille;
    private double poids;
    private int nombreMatchs;
    private String role;
    private static final String[] ROLES = {"Gardien", "Défense", "Centre", "Attaque"};

    // Constructeur

    public Joueur(String nomPrenom, int age, double taille, double poid, int nbreMatchsJoues, String role)throws IllegalArgumentException {
        if (age < 0 || taille < 0 || poids < 0 || nombreMatchs < 0) {
            throw new IllegalArgumentException("Les valeurs doivent être positives.");
        }
        if (!isValidRole(role)) {
            throw new IllegalArgumentException("Le rôle doit être Gardien, Défense, Centre, ou Attaque.");
        }

        this.nomPrenom = nomPrenom;
        this.age = age;
        this.taille = taille;
        this.poids = poid;
        this.nombreMatchs = 0;
        this.role = role;
    }

    /**************** Les Getteurs ******************/
    public String getnomPrenom() {
        return nomPrenom;
    }
    public int getAge() {
        return age;
    }
    public double getTaille() {
        return taille;
    }
    public double getPoid() {
        return poids;
    }
    public int getNbreMatchsJoues() {
        return nombreMatchs;
    }
    public String getRole() {
        return role;
    }

    /**************** Les Setteurs ******************/
    public void setnomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTaille(double taille) {
        this.taille = taille;
    }
    public void setPoid(double poids) {
        this.poids = poids;
    }
    public void setNbreMatchsJoues(int nombreMatchs) {
        this.nombreMatchs = nombreMatchs;
    }
    public void setRole(String role) {
        this.role = role;
    }


    private boolean isValidRole(String role) {
        for (String r : ROLES) {
            if (r.equalsIgnoreCase(role)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Joueur{" +
                "Nom-Prénom='" + nomPrenom + '\'' +
                ", Âge=" + age +
                ", Taille=" + taille +
                ", Poids=" + poids +
                ", Nombre de matchs=" + nombreMatchs +
                ", Rôle='" + role + '\'' +
                '}';
    }


}