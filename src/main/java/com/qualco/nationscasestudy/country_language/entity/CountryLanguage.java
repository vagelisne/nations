package com.qualco.nationscasestudy.country_language.entity;

import com.qualco.nationscasestudy.country_stats.entity.CountryStatId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "country_languages")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    @JoinColumn(name = "country_id")
    private long country;

    @Id
    @JoinColumn(name = "language_id")
    private long language;
}
