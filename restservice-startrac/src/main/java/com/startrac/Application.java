package com.startrac;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.startrac.dao.TruckRepository;
import com.startrac.model.Truck;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	TruckRepository truckRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("DATASOURCE = " + dataSource);

		System.out.println("\n1.findAll()...");
		for (Truck truck : truckRepository.findAll()) {
			System.out.println(truck);
		}

		System.out.println("Done!");

	}

}
