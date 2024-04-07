package model;

import java.util.List;
import java.util.Date;

public class Medecin extends Personne {
    // Attributs spécifiques à la classe Medecin
    private int idMed;
    private String speM;
    private String qualifM;
    private List<Date> rdvDispo;
    private List<String> lieuM;

    // Constructeur
    public Medecin(int idPersonne, String nom, String prenom, int idMed, String speM, String qualifM,
                   List<Date> rdvDispo, List<String> lieuM) {
        super(idPersonne, nom, prenom);
        this.idMed = idMed;
        this.speM = speM;
        this.qualifM = qualifM;
        this.rdvDispo = rdvDispo;
        this.lieuM = lieuM;
    }

    // Getters et setters pour idMed
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    // Getters et setters pour speM
    public String getSpeM() {
        return speM;
    }

    public void setSpeM(String speM) {
        this.speM = speM;
    }

    // Getters et setters pour qualifM
    public String getQualifM() {
        return qualifM;
    }

    public void setQualifM(String qualifM) {
        this.qualifM = qualifM;
    }

    // Getters et setters pour rdvDispo
    public List<Date> getRdvDispo() {
        return rdvDispo;
    }

    public void setRdvDispo(List<Date> rdvDispo) {
        this.rdvDispo = rdvDispo;
    }

    // Getters et setters pour lieuM
    public List<String> getLieuM() {
        return lieuM;
    }

    public void setLieuM(List<String> lieuM) {
        this.lieuM = lieuM;
    }
}
