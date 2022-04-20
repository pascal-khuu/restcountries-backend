package co.simplon.restcountries.services;

import java.util.List;

import co.simplon.restcountries.dtos.CountryName;
import co.simplon.restcountries.dtos.CountryTable;
import co.simplon.restcountries.entities.Country;

public interface CountryService {

    List<Country> getCountries();

    List<CountryName> getCountryNames();

    List<CountryTable> getCountryDatas();

}
