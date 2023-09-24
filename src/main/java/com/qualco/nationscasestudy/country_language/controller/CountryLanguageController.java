package com.qualco.nationscasestudy.language.controller;

import com.qualco.nationscasestudy.country.dto.CountryLanguageDTO;
import com.qualco.nationscasestudy.country_language.service.CountryLanguageService;
import com.qualco.nationscasestudy.language.entity.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LanguageController {

    private final CountryLanguageService countryLanguageService;

    @GetMapping("/country/{countryID}/languages")
    public List<Language> getByCountryID(@PathVariable long countryID) {
        return countryLanguageService.fetchByCountryID(countryID);
    }
}
