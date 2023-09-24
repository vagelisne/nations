package com.qualco.nationscasestudy.country_language.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class CountryLanguageId implements Serializable {

    private long country;

    private long language;
}
