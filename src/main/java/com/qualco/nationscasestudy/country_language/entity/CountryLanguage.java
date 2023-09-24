package com.qualco.nationscasestudy.country_language.entity;

import com.qualco.nationscasestudy.country.entity.Country;
import com.qualco.nationscasestudy.country_stats.entity.CountryStatId;
import com.qualco.nationscasestudy.language.entity.Language;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "country_languages")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CountryLanguage implements Serializable {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @MapsId("languageId")
    @JoinColumn(name = "language_id")
    private Language language;

    private boolean official;
}
