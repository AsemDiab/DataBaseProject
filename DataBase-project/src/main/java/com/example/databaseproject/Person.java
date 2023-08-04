package com.example.databaseproject;

import javafx.beans.property.*;

import java.util.Date;

public class Person {



    private int ID;
    private String name;
    private String sectionID;
    private String Gender;
    private Date date;
    private String PersonShip;
    private IntegerProperty IDP=new SimpleIntegerProperty();
    private StringProperty nameP=new SimpleStringProperty();
    private StringProperty sectionIDP=new SimpleStringProperty();
    private StringProperty GenderP=new SimpleStringProperty();
    private ObjectProperty<Date> dateP=new SimpleObjectProperty<>();
    private StringProperty PersonShipP=new SimpleStringProperty();

    public Person(int ID, String name, Date date , String personShip , String gender, String sectionID) {
        this.ID = ID;
        this.name = name;
        this.sectionID = sectionID;
        Gender = gender;
        this.date = date;
        PersonShip = personShip;
        this.IDP.set(ID);
        this.nameP.set( name);
        this.sectionIDP.set(sectionID);
        GenderP.set(gender);
        this.dateP.set(date);
        PersonShipP.set(personShip);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSectionID() {
        return sectionID;
    }

    public void setSectionID(String sectionID) {
        this.sectionID = sectionID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPersonShip() {
        return PersonShip;
    }

    public void setPersonShip(String personShip) {
        PersonShip = personShip;
    }

    public int getIDP() {
        return IDP.get();
    }

    public IntegerProperty IDPProperty() {
        return IDP;
    }

    public void setIDP(int IDP) {
        this.IDP.set(IDP);
    }

    public String getNameP() {
        return nameP.get();
    }

    public StringProperty namePProperty() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP.set(nameP);
    }

    public String getSectionIDP() {
        return sectionIDP.get();
    }

    public StringProperty sectionIDPProperty() {
        return sectionIDP;
    }

    public void setSectionIDP(String sectionIDP) {
        this.sectionIDP.set(sectionIDP);
    }

    public String getGenderP() {
        return GenderP.get();
    }

    public StringProperty genderPProperty() {
        return GenderP;
    }

    public void setGenderP(String genderP) {
        this.GenderP.set(genderP);
    }

    public Date getDateP() {
        return dateP.get();
    }

    public ObjectProperty<Date> datePProperty() {
        return dateP;
    }

    public void setDateP(Date dateP) {
        this.dateP.set(dateP);
    }

    public String getPersonShipP() {
        return PersonShipP.get();
    }

    public StringProperty personShipPProperty() {
        return PersonShipP;
    }

    public void setPersonShipP(String personShipP) {
        this.PersonShipP.set(personShipP);
    }
}
