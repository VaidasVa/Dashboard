package com.preinternship.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Table(name="quotes")
public class Quote {

    @Column(name = "QUOTE")
    private String quote;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

}
