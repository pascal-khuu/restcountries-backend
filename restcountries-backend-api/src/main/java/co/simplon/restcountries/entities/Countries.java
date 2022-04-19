package co.simplon.restcountries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "capital")
    private String capital;

    @Column(name = "area")
    private float area;

    @Column(name = "population")
    private int population;

    @Column(name = "flag")
    private String flag;

    @Column(name = "map")
    private String map;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;
}
