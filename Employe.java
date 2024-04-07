package model;

import java.util.Date;
import java.util.List;

public class Employe extends Personne {
    // Attributs spécifiques à la classe Employe
    private int idEmp;
    private String emailE;
    private String motDePasseE;

    // Constructeur
    public Employe(int idPersonne, String nom, String prenom, int idEmp, String emailE, String motDePasseE) {
        super(idPersonne, nom, prenom);
        this.idEmp = idEmp;
        this.emailE = emailE;
        this.motDePasseE = motDePasseE;
    }

    // Getters et setters pour idEmp
    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    // Getters et setters pour emailE
    public String getEmailE() {
        return emailE;
    }

    public void setEmailE(String emailE) {
        this.emailE = emailE;
    }

    // Getters et setters pour motDePasseE
    public String getMotDePasseE() {
        return motDePasseE;
    }

    public void setMotDePasseE(String motDePasseE) {
        this.motDePasseE = motDePasseE;
    }

    // Méthode pour ajouter un médecin
    public void ajouterMedecin(Medecin medecin) {
        // Implémentation de l'ajout d'un médecin
    }

    // Méthode pour ajouter un créneau de rendez-vous pour un médecin
    ///public void ajouterRDVMedecin(Medecin medecin) {
        // Implémentation de l'ajout d'un créneau de rendez-vous pour un médecin
    }

    // Méthode pour supprimer un créneau de rendez-vous pour un médecin
    ///public void supprimerRDVMedecin(Creneau creneau, Medecin medecin) {
        // Implémentation de la suppression d'un créneau de rendez-vous pour un médecin
    }

    // Méthode pour ajouter un rendez-vous
    public void ajouterRDV(int idMedecin, int idClient, Date date, Date heure) {
        // Implémentation de l'ajout d'un rendez-vous
    }

    // Méthode pour examiner l'historique d'un patient
    public void examinerHistoriquePatient(Patient patient) {
        // Implémentation de l'examen de l'historique d'un patient
    }

    // Méthode pour récupérer tous les rendez-vous futurs pris
    ///public List<RDV> voirRdvFuturs() {
        // Implémentation de la récupération de tous les rendez-vous futurs pris
        ///return null; // Retourne une liste vide pour le moment, à implémenter
    }
}
