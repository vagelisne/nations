package com.qualco.nationscasestudy.country_language.controller;

import com.qualco.nationscasestudy.country.dto.CountryLanguageDTO;
import com.qualco.nationscasestudy.country_language.mapper.CountryLanguageMapper;
import com.qualco.nationscasestudy.country_language.service.CountryLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryLanguageController {

    private final CountryLanguageService countryLanguageService;
    private final CountryLanguageMapper countryLanguageMapper;

    @GetMapping("/country/{countryID}/languages")
    public List<CountryLanguageDTO> getByCountryID(@PathVariable long countryID) {
         return countryLanguageMapper.countryLanguagesToCountryLanguageDTOs(countryLanguageService.fetchByCountryID(countryID));
    }
}
