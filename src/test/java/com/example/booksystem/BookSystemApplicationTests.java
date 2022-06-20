package com.example.booksystem;

import com.example.booksystem.entity.Book;
import com.example.booksystem.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootTest
class BookSystemApplicationTests {
    @Autowired
    BookMapper mapper;

    @Test
    void test1() {
        final Book book = mapper.queryById(1);
        if (book != null) {
            System.out.println(book.getbAuthor());
        }
    }

}
