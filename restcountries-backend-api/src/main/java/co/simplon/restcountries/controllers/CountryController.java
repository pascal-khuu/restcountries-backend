package co.simplon.restcountries.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.restcountries.dtos.CountryName;
import co.simplon.restcountries.dtos.CountryTable;
import co.simplon.restcountries.entities.Country;
import co.simplon.restcountries.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
	this.service = service;

    }

    @GetMapping
    public List<Country> getCountries() {
	return service.getCountries();
    }

    @GetMapping("/country-names")
    public List<CountryName> getCountryNames() {
	return service.getCountryNames();
    }

    @GetMapping("/country-datas")
    public List<CountryTable> getCountryDatas() {
	return service.getCountryDatas();
    }
}
