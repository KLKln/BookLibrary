package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Book;
import beans.BookInfo;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
		bean.setTitle("The Painted Bird");
		bean.setAuthor("Jerzy Kosinski");
		bean.setIsbn("9780802134226");
		return bean;
	}
	
	@Bean
	public BookInfo bookInfo() {
		BookInfo bean = new BookInfo();
		return bean;
	}

}
