package model;

public class Patient extends Personne {
    // Attributs spécifiques à la classe Patient
    private int idPatient;
    private String emailP;
    private String motDePasseP;
    private String adresseP;
    private int numtelP;
    private int typeP;

    // Constructeur
    public Patient(int idPersonne, String nom, String prenom, int idPatient, String emailP, String motDePasseP,
                   String adresseP, int numtelP, int typeP) {
        super(idPersonne, nom, prenom);
        this.idPatient = idPatient;
        this.emailP = emailP;
        this.motDePasseP = motDePasseP;
        this.adresseP = adresseP;
        this.numtelP = numtelP;
        this.typeP = typeP;
    }

    // Getters et setters pour idPatient
    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    // Getters et setters pour emailP
    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    // Getters et setters pour motDePasseP
    public String getMotDePasseP() {
        return motDePasseP;
    }

    public void setMotDePasseP(String motDePasseP) {
        this.motDePasseP = motDePasseP;
    }

    // Getters et setters pour adresseP
    public String getAdresseP() {
        return adresseP;
    }

    public void setAdresseP(String adresseP) {
        this.adresseP = adresseP;
    }

    // Getters et setters pour numtelP
    public int getNumtelP() {
        return numtelP;
    }

    public void setNumtelP(int numtelP) {
        this.numtelP = numtelP;
    }

    // Getters et setters pour typeP
    public int getTypeP() {
        return typeP;
    }

    public void setTypeP(int typeP) {
        this.typeP = typeP;
    }
}
