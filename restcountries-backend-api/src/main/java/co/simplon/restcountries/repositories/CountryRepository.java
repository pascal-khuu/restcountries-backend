package co.simplon.restcountries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.restcountries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findbyCountryName();
}
