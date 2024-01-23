package org.quarkus.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;

@Path("/test")
public class EcoResource {


    @GET
    public String saludar() {
        return "Testeando";
    }

    @GET
    @Path("/otro")
    public String otroGet() {
        return "otro get";
    }


    @GET
    @Path("/saludar")
    public String parametros(@QueryParam("nombre") String nombre) {
        return Optional
                .ofNullable(nombre)
                .map(n -> "> %s".formatted(nombre))
                .orElse("No se envio un mensaje");
    }




}
