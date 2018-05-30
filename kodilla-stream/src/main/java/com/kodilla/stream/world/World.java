package com.kodilla.stream.world;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    private final List<Continent> continentsList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){

        return continentsList.stream()
                .flatMap(country -> country.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public String toString() {
        return "World{" +
                "continentsList=" + continentsList +
                '}';
    }
}
