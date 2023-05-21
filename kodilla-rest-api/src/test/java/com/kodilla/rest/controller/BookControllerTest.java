package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);
    BookDto bookHarryPotter1 = new BookDto("Harry Potter 1", "J.K. Rowling");
    BookDto bookHarryPotter2 = new BookDto("Harry Potter 2", "J.K. Rowling");

    @Test
    void shouldFetchBooks() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(bookHarryPotter1);
        booksList.add(bookHarryPotter2);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBooks() {
        bookController.addBook(bookHarryPotter1);
        Mockito.verify(bookServiceMock).addBook(bookHarryPotter1);
    }
}