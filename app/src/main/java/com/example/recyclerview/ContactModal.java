package com.example.recyclerview;
//7. creating a modal class
public class ContactModal {
    private String name;
    private String number;
    private String imageUrl;
//8.creating constructor (alt + insert)
    public ContactModal(String name, String number, String imageUrl) {
        this.name = name;
        this.number = number;
        this.imageUrl = imageUrl;
    }
    //9. creating getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
