package br.eleicao.app.repository;

public class EleicaoApplication {

	package br.eleicao.app;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	import br.eleicao.app.model.Municipio;
	import br.eleicao.app.repository.MunicipioRepository;

	@SpringBootApplication
	public class EleicaoApplication  implements CommandLineRunner {
		
		final MunicipioRepository _municipioRepository;	//Criando propriedade da Interface Município
		
		public EleicaoApplication(MunicipioRepository municipioRepository) {
			_municipioRepository = municipioRepository; //Alimentando a propriedade com a construção da classe
		}

		public static void main(String[] args) {
			SpringApplication.run(EleicaoApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {			

	}
}