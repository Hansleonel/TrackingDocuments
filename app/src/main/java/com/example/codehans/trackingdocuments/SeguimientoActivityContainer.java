package com.example.codehans.trackingdocuments;

/**
 * Created by ogtie05 on 25/04/2018.
 */

public class SeguimientoActivityContainer {
    String idOficina;
    String dateAll;
    String dateYear;
    String codOficina;
    String codDescripcion;
    String codEstado;
    String descEstado;

    public SeguimientoActivityContainer() {
    }

    public SeguimientoActivityContainer(String idOficina, String dateAll, String dateYear, String codOficina, String codDescripcion, String codEstado, String descEstado) {
        this.idOficina = idOficina;
        this.dateAll = dateAll;
        this.dateYear = dateYear;
        this.codOficina = codOficina;
        this.codDescripcion = codDescripcion;
        this.codEstado = codEstado;
        this.descEstado = descEstado;
    }

    public String getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(String idOficina) {
        this.idOficina = idOficina;
    }

    public String getDateAll() {
        return dateAll;
    }

    public void setDateAll(String dateAll) {
        this.dateAll = dateAll;
    }

    public String getDateYear() {
        return dateYear;
    }

    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }

    public String getCodOficina() {
        return codOficina;
    }

    public void setCodOficina(String codOficina) {
        this.codOficina = codOficina;
    }

    public String getCodDescripcion() {
        return codDescripcion;
    }

    public void setCodDescripcion(String codDescripcion) {
        this.codDescripcion = codDescripcion;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public String getDescEstado() {
        return descEstado;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
    }
}
