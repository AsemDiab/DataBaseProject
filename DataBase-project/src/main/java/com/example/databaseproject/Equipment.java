package com.example.databaseproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Equipment {
    String type;
    int id;
    int SectionID;
    StringProperty typep=new SimpleStringProperty();
    IntegerProperty idp=new SimpleIntegerProperty();
    IntegerProperty SectionIDP=new SimpleIntegerProperty();

    public Equipment(String type, int id, int sectionID) {
        this.type = type;
        this.id = id;
        SectionID = sectionID;
        typep.set(type);
        idp.set(id);
        SectionIDP.set(SectionID);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSectionID() {
        return SectionID;
    }

    public void setSectionID(int sectionID) {
        SectionID = sectionID;
    }

    public String getTypep() {
        return typep.get();
    }

    public StringProperty typepProperty() {
        return typep;
    }

    public void setTypep(String typep) {
        this.typep.set(typep);
    }

    public int getIdp() {
        return idp.get();
    }

    public IntegerProperty idpProperty() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp.set(idp);
    }

    public int getSectionIDP() {
        return SectionIDP.get();
    }

    public IntegerProperty sectionIDPProperty() {
        return SectionIDP;
    }

    public void setSectionIDP(int sectionIDP) {
        this.SectionIDP.set(sectionIDP);
    }
}
