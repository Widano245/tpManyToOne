package com.example.manytoone;

import com.example.manytoone.entities.Client;
import com.example.manytoone.entities.Command;
import com.example.manytoone.repositories.ClientRepository;
import com.example.manytoone.repositories.CommandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository, CommandRepository commandRepository)
	{ return args -> {
		Client cl1 = Client.builder()
				.nom("Mohammed")
				.build();
		clientRepository.save(cl1);

		Client cl2= Client.builder()
				.nom("Aicha")
				.build();
		clientRepository.save(cl2);

		Client cl3 = Client.builder()
				.nom("Amine")
				.build();
		clientRepository.save(cl3);

		Command cm1 =  Command.builder()
				.montant(9000.0)
				.client(cl1)

				.build();
		commandRepository.save(cm1);

		Command cm2 =  Command.builder()
				.montant(7000.0)
				.client(cl1)

				.build();
		commandRepository.save(cm2);

		Command cm3 =  Command.builder()
				.montant(8000.0)
				.client(cl2)

				.build();
		commandRepository.save(cm3);

	};
	}
}
