package com.qualco.nationscasestudy.country.mapper;

import com.qualco.nationscasestudy.country.dto.CountryAreaDTO;
import com.qualco.nationscasestudy.country.entity.Country;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CountryMapper {

    @Mapping(source = "countryCode2", target = "countryCode")
    CountryAreaDTO countryToCountryArea(Country country);

    List<CountryAreaDTO> countriesToCountryAreas(List<Country> countries);
}
