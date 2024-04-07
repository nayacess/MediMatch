package model;

import java.util.Date;

public class RDV {
    private int idRDV;
    private int idPatient;
    private int idMed;
    private Date dateRDV;
    private Date heureRDV;
    private String lieuRDV;
    private String noteRDV;
    private int dispoRDV;

    public RDV(int idRDV, int idPatient, int idMed, Date dateRDV, Date heureRDV, String lieuRDV, String noteRDV, int dispoRDV) {
        this.idRDV = idRDV;
        this.idPatient = idPatient;
        this.idMed = idMed;
        this.dateRDV = dateRDV;
        this.heureRDV = heureRDV;
        this.lieuRDV = lieuRDV;
        this.noteRDV = noteRDV;
        this.dispoRDV = dispoRDV;
    }

    // Getters et setters pour les attributs
    public int getIdRDV() {
        return idRDV;
    }

    public void setIdRDV(int idRDV) {
        this.idRDV = idRDV;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public Date getDateRDV() {
        return dateRDV;
    }

    public void setDateRDV(Date dateRDV) {
        this.dateRDV = dateRDV;
    }

    public Date getHeureRDV() {
        return heureRDV;
    }

    public void setHeureRDV(Date heureRDV) {
        this.heureRDV = heureRDV;
    }

    public String getLieuRDV() {
        return lieuRDV;
    }

    public void setLieuRDV(String lieuRDV) {
        this.lieuRDV = lieuRDV;
    }

    public String getNoteRDV() {
        return noteRDV;
    }

    public void setNoteRDV(String noteRDV) {
        this.noteRDV = noteRDV;
    }

    public int getDispoRDV() {
        return dispoRDV;
    }

    public void setDispoRDV(int dispoRDV) {
        this.dispoRDV = dispoRDV;
    }
}

