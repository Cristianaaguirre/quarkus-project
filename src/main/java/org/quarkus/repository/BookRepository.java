package org.quarkus.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.quarkus.dtos.Book;

@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {
}
