package com.qualco.nationscasestudy.country.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter
public class CountryLanguageDTO {
    private String countryName;
    private String language;
    private boolean officialLanguage;
}
