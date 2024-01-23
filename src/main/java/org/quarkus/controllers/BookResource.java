package org.quarkus.controllers;

import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.quarkus.dtos.Book;
import org.quarkus.dtos.PaginatedResponse;
import org.quarkus.repository.BookRepository;

import java.util.List;

@Path("/books")
@Transactional
public class BookResource {

    @Inject
    private BookRepository repository;


    @GET
    @Path("{id}")
    public Book getById(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @GET
    @Path("/all")
    public PaginatedResponse<Book> getAll(@QueryParam("page") @DefaultValue("1") int page) {
//        return repository.listAll();
//        return q == null
//                ? repository.listAll(Sort.by("id", Sort.Direction.Descending))
//                : repository.list("description ILIKE ?1", "%" + q + "%");

//        return repository.findAll()
//                .page(page - 1, 2)
//                .list();

        Page p = new Page(page - 1, 2);
        var query = repository.findAll(Sort.descending("id")).page(p);
        return new PaginatedResponse<>(query);
    }


    @POST
    public Book insert(Book insertedBook) {
        repository.persist(insertedBook);
//        insertedBook.persist();
        return insertedBook;
    }


    @DELETE
    @Path("{id}")
    public String delete(@PathParam("id") Long id) {
        return repository.deleteById(id)
                ? "Eliminado exitosamente"
                : "Libro no encontrado";
    }


}
