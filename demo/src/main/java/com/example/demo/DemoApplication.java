package com.example.demo;

import model.ReadExcelFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		ReadExcelFile ref = new ReadExcelFile();
		ref.getCellValue();
	}

}
