package com.kurss.hotell.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String data_in, data_out, room;

    String name_book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_in() {
        return data_in;
    }

    public void setData_in(String data_in) {
        this.data_in = data_in;
    }

    public String getData_out() {
        return data_out;
    }

    public void setData_out(String data_out) {
        this.data_out = data_out;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public Book() {
    }

    public Book(String data_in, String data_out, String room, String name_book) {
        this.data_in = data_in;
        this.data_out = data_out;
        this.room = room;
        this.name_book = name_book;
    }
}
