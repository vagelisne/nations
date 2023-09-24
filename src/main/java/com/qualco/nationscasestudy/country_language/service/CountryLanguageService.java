package com.qualco.nationscasestudy.country_language.service;

import com.qualco.nationscasestudy.country_language.entity.CountryLanguage;
import com.qualco.nationscasestudy.country_language.repository.CountryLanguageRepository;
import com.qualco.nationscasestudy.language.entity.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Component
@RequiredArgsConstructor
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;

    public List<CountryLanguage> fetchByCountryID(long countryID) {
        return countryLanguageRepository.findCountryLanguageByCountry_Id(countryID);
    }
}
