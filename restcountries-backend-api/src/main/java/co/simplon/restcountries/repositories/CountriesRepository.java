package co.simplon.restcountries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.restcountries.entities.Countries;

public interface CountriesRepository extends JpaRepository<Countries, Long> {

}
