package com.cognizant.orm_learn.controller;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    @GetMapping("/search/{keyword}")
    public List<Country> searchCountry(@PathVariable("keyword") String keyword) {
        return countryService.getCountryByKeywords(keyword);
    }

    @PostMapping("/")
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.addCountry(country));
    }

    @PutMapping("/{code}")
    public ResponseEntity<Country> updateCountry(@PathVariable String code, @RequestBody Country country) {
        Country updated = countryService.updateCountry(code, country);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String code) {
        boolean deleted = countryService.deleteCountry(code);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}
