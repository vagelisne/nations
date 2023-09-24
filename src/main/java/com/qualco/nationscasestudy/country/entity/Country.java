package com.qualco.nationscasestudy.country.entity;

import com.qualco.nationscasestudy.region.entity.Region;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "countries")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Country {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "country_id")
    private long id;

    @Column
    private String name;

    @Column
    private double area;

    @Column
    private LocalDate nationalDay;

    @Column
    private String countryCode2;

    @Column
    private String countryCode3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
//    private List<CountryStatistic> statistics;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
//    private List<CountryLanguage> languages;

    public Country(long id, String name, double area, String countryCode2) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.countryCode2 = countryCode2;
    }
}
