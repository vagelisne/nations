package com.qualco.nationscasestudy.country.controller;

import com.qualco.nationscasestudy.country.dto.CountryAreaDTO;
import com.qualco.nationscasestudy.country.entity.Country;
import com.qualco.nationscasestudy.country.mapper.CountryMapper;
import com.qualco.nationscasestudy.country.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @GetMapping("/countries/find-with-area")
    public List<CountryAreaDTO> getCountriesWithArea() {
        List<Country> countries = countryService.getCountriesWithArea();
        return countryMapper.countriesToCountryAreas(countries);
    }
}
