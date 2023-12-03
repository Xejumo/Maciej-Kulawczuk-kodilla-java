package com.example.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Book 1", "Author 1", LocalDate.of(2020, 1, 1)));
        library.getBooks().add(new Book("Book 2", "Author 2", LocalDate.of(2021, 2, 2)));
        library.getBooks().add(new Book("Book 3", "Author 3", LocalDate.of(2022, 3, 3)));

        // When
        Library shallowCopy = null;
        Library deepCopy = null;
        try {
            shallowCopy = library.clone();
            deepCopy = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Then
        assertEquals(library.getBooks().size(), Objects.requireNonNull(shallowCopy).getBooks().size());
        assertEquals(library.getBooks().size(), Objects.requireNonNull(deepCopy).getBooks().size());
        assertBooksEqual(library.getBooks(), shallowCopy.getBooks());
        assertBooksEqual(library.getBooks(), deepCopy.getBooks());
    }

    private void assertBooksEqual(Set<Book> expected, Set<Book> actual) {
        for (Book expectedBook : expected) {
            for (Book actualBook : actual) {
                if (expectedBook.getTitle().equals(actualBook.getTitle())) {
                    assertEquals(expectedBook.getAuthor(), actualBook.getAuthor());
                    assertEquals(expectedBook.getPublicationDate(), actualBook.getPublicationDate());
                }
            }
        }
    }
}