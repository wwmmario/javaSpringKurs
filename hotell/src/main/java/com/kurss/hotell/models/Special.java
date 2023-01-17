package com.kurss.hotell.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Special {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_offers, text_offers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_offers() {
        return name_offers;
    }

    public void setName_offers(String name_offers) {
        this.name_offers = name_offers;
    }

    public String getText_offers() {
        return text_offers;
    }

    public void setText_offers(String text_offers) {
        this.text_offers = text_offers;
    }

    public Special(String name_offers, String text_offers) {
        this.name_offers = name_offers;
        this.text_offers = text_offers;
    }

    public Special() {
    }
}
