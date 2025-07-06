package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code) {
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);
    }

    public List<Country> getCountryByKeywords(String keyword) {
        return countryRepository.findByNameContaining(keyword);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, Country country) {
        if (countryRepository.existsById(code)) {
            country.setId(code);
            return countryRepository.save(country);
        }
        return null;
    }

    public boolean deleteCountry(String code) {
        if (countryRepository.existsById(code)) {
            countryRepository.deleteById(code);
            return true;
        }
        return false;
    }
}
