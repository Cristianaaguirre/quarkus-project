package org.quarkus.services;

import org.quarkus.dtos.Temperatura;

import java.util.List;
import java.util.Optional;

public interface ITemperaturaService {

    void addTemperatura(Temperatura t);
    List<Temperatura> getTemperaturas();
    Optional<Temperatura> getByName(String ciudad);
    boolean isEmpty();
    int maxima();
}
