package br.com.angelim.overtime.application;

import br.com.angelim.overtime.domain.comptime.entity.chain.AbstractCompensatoryTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OvertimeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OvertimeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AbstractCompensatoryTime compensatoryTime;
	}
}
