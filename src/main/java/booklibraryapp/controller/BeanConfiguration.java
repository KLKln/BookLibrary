package booklibraryapp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import booklibraryapp.beans.Book;
import booklibraryapp.beans.BookInfo;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
		//bean.setTitle("The Painted Bird");
		//bean.setAuthor("Jerzy Kosinski");
		//bean.setIsbn("9780802134226");
		return bean;
	}
	
	@Bean
	public BookInfo bookInfo() {
		BookInfo bean1 = new booklibraryapp.beans.BookInfo();
		return bean1;
	}

}
