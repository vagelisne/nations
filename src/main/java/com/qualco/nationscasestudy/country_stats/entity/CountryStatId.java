package com.qualco.nationscasestudy.country_stats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CountryStatId implements Serializable {

    @Column(name = "country_id")
    private long country;

    @Column
    private int year;
}
