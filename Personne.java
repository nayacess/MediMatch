package model;

public class Personne {
    // Attributs
    private int idPersonne;
    private String nom;
    private String prenom;

    // Constructeur
    public Personne(int idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et setters pour idPersonne
    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    // Getters et setters pour nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getters et setters pour prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
