package com.example.jpademo.book;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {
    @Id @GeneratedValue
    private Long id;

    private String name;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
