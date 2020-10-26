package br.com.gmdtmusic;

import br.com.gmdtmusic.domain.Pessoa;
import br.com.gmdtmusic.repositories.PessoaRepository;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmdtMusicApplication implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(GmdtMusicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.setId(1L);
        p1.setDataNascimento(OffsetDateTime.of(1987, 5, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        p1.setNome("Luiz Antonio");
        p1.setSobrenome("Machinesque");
        p1.setSexo("Masculino");
        
        p2.setId(2L);
        p2.setDataNascimento(OffsetDateTime.of(1981, 9, 5, 0, 0, 0, 0, ZoneOffset.UTC));
        p2.setNome("Simone Pirrotti Ferreira");
        p2.setSobrenome("Machinesque");
        p2.setSexo("Feminino");
        
        pessoaRepository.saveAll(Arrays.asList(p1, p2));
        
    }

}
