package com.qualco.nationscasestudy.country_language.mapper;

import com.qualco.nationscasestudy.country.dto.CountryLanguageDTO;
import com.qualco.nationscasestudy.country_language.entity.CountryLanguage;
import org.mapstruct.AfterMapping;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CountryLanguageMapper {

    @Mapping(source = "country.name", target = "countryName")
    @Mapping(source = "language.name", target = "language")
    @Mapping(source = "official", target = "officialLanguage")
    CountryLanguageDTO countryLanguageToCountryLanguageDTO(CountryLanguage countryLanguage);
    List<CountryLanguageDTO> countryLanguagesToCountryLanguageDTOs(List<CountryLanguage> countryLanguages);
}
