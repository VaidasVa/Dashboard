package com.preinternship.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name="quotes")
public class quotes {

    @Column(name = "quote")
    private String QUOTE;

    @Column(name = "title")
    private String TITLE;

    @Column(name = "author")
    private String AUTHOR;

}
