package org.quarkus.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.quarkus.dtos.Temperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class TemperaturaService implements ITemperaturaService{

    private final List<Temperatura> temperaturas = new ArrayList<>();

    public void addTemperatura(Temperatura t) {
        temperaturas.add(t);
    }

    public List<Temperatura> getTemperaturas() {
        return temperaturas;
    }

    public boolean isEmpty() {
        return temperaturas.isEmpty();
    }

    public int maxima() {
        return temperaturas.stream()
                .mapToInt(Temperatura::getMaxima)
                .max()
                .getAsInt();
    }

    @Override
    public Optional<Temperatura> getByName(String ciudad) {
        return temperaturas.stream()
                .filter(t -> t.getCiudad().equals(ciudad))
                .findFirst();

    }
}
