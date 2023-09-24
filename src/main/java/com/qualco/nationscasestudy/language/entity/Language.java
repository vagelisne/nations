package com.qualco.nationscasestudy.language.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "languages")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Language {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "language_id")
    private long id;

    @Column(name = "language")
    private String name;
}
