package functions;

import java.util.Locale;
import java.util.function.Function;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

import org.apache.commons.text.WordUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PipelineApp {

	private NumberFormat formatter = new RuleBasedNumberFormat(Locale.US, RuleBasedNumberFormat.SPELLOUT);

	@Bean
	public Function<String, String> upper() {
		return s -> s.toUpperCase();
	}

	@Bean
	public Function<Long, Long> square() {
		return n -> n * n;
	}

	@Bean
	public Function<Long, String> format() {
		return l -> formatter.format(l);
	}

	@Bean
	public Function<String, String> capitalize() {
		return s -> WordUtils.capitalizeFully(s);
	}

	// public static void main(String[] args) {
	// 	SpringApplication.run(PipelineApp.class, args);
	// }

}

