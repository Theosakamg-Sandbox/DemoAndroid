package com.tactfactory.mademo;


public class Contact {

    private String photoPath;
    private String firstName;
    private String lastName;
    private String note;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDisplayName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
}













