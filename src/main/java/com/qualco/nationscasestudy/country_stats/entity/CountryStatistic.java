package com.qualco.nationscasestudy.country_stats.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "country_stats")
@Getter
@Setter
public class CountryStatistic {

    @EmbeddedId
    private CountryStatId countryStatId;

    private int population;

    private double gdp;
}
