package com.example.databaseproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import java.util.Date;

public class Book {
    private int bookID;
    private String title;
    private String AutherFname;
    private String AutherLname;
    private int sectionID;
    private String language;
    private int numberOfPages;
    private int totalCopy;

    private Date publishDate;
    private IntegerProperty idd = new SimpleIntegerProperty();
    private StringProperty titleProperty = new SimpleStringProperty();
    private ObjectProperty<Date> publishDateProperty = new SimpleObjectProperty<>();

   private StringProperty languageProperty =new SimpleStringProperty();
   private StringProperty Fname=new SimpleStringProperty();
   private StringProperty Lname=new SimpleStringProperty();
   private IntegerProperty sectionIDProrperty=new SimpleIntegerProperty();
   private IntegerProperty PageInteger=new SimpleIntegerProperty();
   private IntegerProperty TotalPer=new SimpleIntegerProperty();

    public Book(int bookID, String title, String autherFname, String autherLname, int sectionID, String language, int numberOfPages, int totalCopy, Date publishDate) {

        this.bookID = bookID;
        this.title = title;
        AutherFname = autherFname.trim();
        AutherLname = autherLname.trim();
        this.sectionID = sectionID;
        this.language = language;
        this.numberOfPages = numberOfPages;
        this.totalCopy = totalCopy;
        this.publishDate = publishDate;

        this.idd.set(bookID);
        this.titleProperty.set(title);
        this.Fname.set(autherFname.trim());
        this.Lname.set(autherLname);
        this.sectionIDProrperty.set(sectionID);
        this.languageProperty.set(language);
        this.PageInteger.set(numberOfPages);
        this.TotalPer.set(totalCopy);
        this.publishDateProperty.set(publishDate);
    }


    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutherFname() {
        return AutherFname;
    }

    public void setAutherFname(String autherFname) {
        AutherFname = autherFname;
    }

    public String getAutherLname() {
        return AutherLname;
    }

    public void setAutherLname(String autherLname) {
        AutherLname = autherLname;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getTotalCopy() {
        return totalCopy;
    }

    public void setTotalCopy(int totalCopy) {
        this.totalCopy = totalCopy;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getIdd() {
        return idd.get();
    }
    public IntegerProperty idProperty() {
        return idd;
    }

    public IntegerProperty iddProperty() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd.set(idd);
    }

    public String getTitleProperty() {
        return titleProperty.get();
    }

    public StringProperty titlePropertyProperty() {
        return titleProperty;
    }

    public void setTitleProperty(String titleProperty) {
        this.titleProperty.set(titleProperty);
    }

    public Date getPublishDateProperty() {
        return publishDateProperty.get();
    }

    public ObjectProperty<Date> publishDatePropertyProperty() {
        return publishDateProperty;
    }

    public void setPublishDateProperty(Date publishDateProperty) {
        this.publishDateProperty.set(publishDateProperty);
    }

    public String getLanguageProperty() {
        return languageProperty.get();
    }

    public StringProperty languagePropertyProperty() {
        return languageProperty;
    }

    public void setLanguageProperty(String languageProperty) {
        this.languageProperty.set(languageProperty);
    }

    public String getFname() {
        return Fname.get();
    }

    public StringProperty fnameProperty() {
        return Fname;
    }

    public void setFname(String fname) {
        this.Fname.set(fname);
    }

    public String getLname() {
        return Lname.get();
    }

    public StringProperty lnameProperty() {
        return Lname;
    }

    public void setLname(String lname) {
        this.Lname.set(lname);
    }

    public int getSectionIDProrperty() {
        return sectionIDProrperty.get();
    }

    public IntegerProperty sectionIDProrpertyProperty() {
        return sectionIDProrperty;
    }

    public void setSectionIDProrperty(int sectionIDProrperty) {
        this.sectionIDProrperty.set(sectionIDProrperty);
    }

    public int getPageInteger() {
        return PageInteger.get();
    }

    public IntegerProperty pageIntegerProperty() {
        return PageInteger;
    }

    public void setPageInteger(int pageInteger) {
        this.PageInteger.set(pageInteger);
    }

    public int getTotalPer() {
        return TotalPer.get();
    }

    public IntegerProperty totalPerProperty() {
        return TotalPer;
    }

    public void setTotalPer(int totalPer) {
        this.TotalPer.set(totalPer);
    }
}
