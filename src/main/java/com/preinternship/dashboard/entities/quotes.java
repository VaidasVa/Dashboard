package com.preinternship.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name="quotes")
public class quotes {

    @Column(name = "quote")
    private String quote;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

}
