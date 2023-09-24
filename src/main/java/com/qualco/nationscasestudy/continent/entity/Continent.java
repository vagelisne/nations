package com.qualco.nationscasestudy.continent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "continents")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Continent {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "continent_id")
    private long id;

    private String name;
}
