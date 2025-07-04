package com.LibManagement;

import com.LibManagement.repository.BookRepository;
import com.LibManagement.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository repo = context.getBean(BookRepository.class);
        repo.repo();

        BookService service = context.getBean(BookService.class);
        service.service();
    }
}
