package com.example.demo.mapper;

import com.example.demo.dto.BookDTO;
import com.example.demo.model.Book;

public class BookMapper {

    public static Book toEntity(BookDTO dto) {
        return new Book(dto.getTitle(), dto.getAuthor(), dto.getPublishedYear());
    }

    public static BookDTO toDTO(Book entity) {
        return new BookDTO(entity.getTitle(), entity.getAuthor(), entity.getPublishedYear());
    }
}