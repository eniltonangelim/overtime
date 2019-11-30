package br.com.angelim.overtime.application;

import br.com.angelim.overtime.domain.comptime.entity.CompensatoryTimeType;
import br.com.angelim.overtime.domain.comptime.entity.chain.AbstractCompensatoryTime;
import br.com.angelim.overtime.domain.contact.entity.Contact;
import br.com.angelim.overtime.domain.credential.entity.Credential;
import br.com.angelim.overtime.domain.period.entity.Period;
import br.com.angelim.overtime.domain.user.entity.User;
import br.com.angelim.overtime.usecase.comptime.CalculateCompTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class OvertimeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OvertimeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Main - Test
		Period periodA = Period.create().ofType(CompensatoryTimeType.EXTRA)
				.startAt(new Date())
				.endAt(new Date());

		Period periodB = Period.create().ofType(CompensatoryTimeType.ATRASO)
				.startAt(new Date())
				.endAt(new Date());

		Period periodC = Period.create().ofType(CompensatoryTimeType.ATRASO)
				.startAt(new Date())
				.endAt(new Date());

		Period periodD = Period.create().ofType(CompensatoryTimeType.EXTRA)
				.startAt(new Date())
				.endAt(new Date());

		User user = User.create()
				.withName("Foo")
				.withContact(Contact.of("foo@bar"))
				.withCredential(Credential.create()
						.withUsername("foo")
						.withPassword("bar"))
				.withPeriods(Arrays.asList(periodA, periodB, periodC))
				.withPeriod(periodD);

		CalculateCompTime calculateCompTime = new CalculateCompTime();
		user.getPeriods().forEach(calculateCompTime::calculate);

	}
}
