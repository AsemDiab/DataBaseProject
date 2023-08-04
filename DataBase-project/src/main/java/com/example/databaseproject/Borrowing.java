package com.example.databaseproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Date;

public class Borrowing {
    int ID;
    int BorrowerID;
    int BookID;
    Date dateB;
    Date dateR;
    IntegerProperty IDP=new SimpleIntegerProperty();
    IntegerProperty BorrowerIDP =new SimpleIntegerProperty();
    IntegerProperty BookIDP=new SimpleIntegerProperty();
    ObjectProperty<Date> dateBP=new SimpleObjectProperty<>();
    ObjectProperty<Date> dateRP=new SimpleObjectProperty<>();

    public Borrowing(int ID, int borrowerID, int bookID, Date dateB, Date dateR) {
        this.ID = ID;
        BorrowerID = borrowerID;
        BookID = bookID;
        this.dateB = dateB;
        this.dateR = dateR;
        BorrowerIDP.set(borrowerID);
        IDP.set(ID);
        BookIDP.set(bookID);
        dateBP.set(dateB);
        dateRP.set(dateR);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBorrowerID() {
        return BorrowerID;
    }

    public void setBorrowerID(int borrowerID) {
        BorrowerID = borrowerID;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public Date getDateB() {
        return dateB;
    }

    public void setDateB(Date dateB) {
        this.dateB = dateB;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
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

    public int getBorrowerIDP() {
        return BorrowerIDP.get();
    }

    public IntegerProperty borrowerIDPProperty() {
        return BorrowerIDP;
    }

    public void setBorrowerIDP(int borrowerIDP) {
        this.BorrowerIDP.set(borrowerIDP);
    }

    public int getBookIDP() {
        return BookIDP.get();
    }

    public IntegerProperty bookIDPProperty() {
        return BookIDP;
    }

    public void setBookIDP(int bookIDP) {
        this.BookIDP.set(bookIDP);
    }

    public Date getDateBP() {
        return dateBP.get();
    }

    public ObjectProperty<Date> dateBPProperty() {
        return dateBP;
    }

    public void setDateBP(Date dateBP) {
        this.dateBP.set(dateBP);
    }

    public Date getDateRP() {
        return dateRP.get();
    }

    public ObjectProperty<Date> dateRPProperty() {
        return dateRP;
    }

    public void setDateRP(Date dateRP) {
        this.dateRP.set(dateRP);
    }
}
