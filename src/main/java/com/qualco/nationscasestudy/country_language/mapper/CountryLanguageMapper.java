package com.qualco.nationscasestudy.country_language;

import com.qualco.nationscasestudy.country.dto.CountryLanguageDTO;
import com.qualco.nationscasestudy.country_language.entity.CountryLanguage;
import org.mapstruct.AfterMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CountryLanguageMapper {

    @Mapping(source = "country.name", target = "countryName")
    CountryLanguageDTO countryLanguageToCountryLanguageDTO(CountryLanguage countryLanguage);

    @AfterMapping
    default void setLanguages(CountryLanguage countryLanguage, @MappingTarget CountryLanguageDTO dto) {
        countryLanguage.
    }
}
