package br.com.gmdtmusic;

import br.com.gmdtmusic.domain.Bairro;
import br.com.gmdtmusic.domain.Cidade;
import br.com.gmdtmusic.domain.Email;
import br.com.gmdtmusic.domain.Endereco;
import br.com.gmdtmusic.domain.Estado;
import br.com.gmdtmusic.domain.Pais;
import br.com.gmdtmusic.domain.Pessoa;
import br.com.gmdtmusic.domain.enums.EnumRegiao;
import br.com.gmdtmusic.domain.enums.EnumTipoEmail;
import br.com.gmdtmusic.domain.enums.EnumTipoEndereco;
import br.com.gmdtmusic.domain.enums.EnumTipoSexo;
import br.com.gmdtmusic.repositories.BairroRepository;
import br.com.gmdtmusic.repositories.CidadeRepository;
import br.com.gmdtmusic.repositories.EmailRepository;
import br.com.gmdtmusic.repositories.EnderecoRepository;
import br.com.gmdtmusic.repositories.EstadoRepository;
import br.com.gmdtmusic.repositories.PaisRepository;
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
    
    @Autowired
    private PaisRepository paisRepository;
    
    @Autowired
    private EstadoRepository estadoRepository;
    
    @Autowired
    private CidadeRepository cidadeRepository;
    
    @Autowired
    private BairroRepository bairroRepository;
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    private EmailRepository emailRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(GmdtMusicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        Pais pais1 = new Pais();
        Estado estado1 = new Estado();
        Cidade cidade1 = new Cidade();
        Bairro bairro1 = new Bairro();
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        Email email1 = new Email();
        Email email2 = new Email();
        
        pais1.setNome("Brasil");

        estado1.setNome("Paraná");
        estado1.setPais(pais1);
        estado1.setRegiao(EnumRegiao.SUL);
        
        cidade1.setNome("Cascavel");
        cidade1.setEstado(estado1);
        cidade1.setRegiao(EnumRegiao.OESTE);
        
        bairro1.setNome("Parque São Paulo");
        bairro1.setCidade(cidade1);
        bairro1.setRegiao(EnumRegiao.SUL);
        
        pais1.getEstados().addAll(Arrays.asList(estado1));
        estado1.getCidades().addAll(Arrays.asList(cidade1));
        cidade1.getBairros().addAll(Arrays.asList(bairro1));
        
        paisRepository.saveAll(Arrays.asList(pais1));
        estadoRepository.saveAll(Arrays.asList(estado1));
        cidadeRepository.saveAll(Arrays.asList(cidade1));
        
        p1.setId(1L);
        p1.setDataNascimento(OffsetDateTime.of(1987, 5, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        p1.setNome("Luiz Antonio");
        p1.setSobrenome("Machinesque");
        p1.setSexo(EnumTipoSexo.MASCULINO);
        
        p2.setId(2L);
        p2.setDataNascimento(OffsetDateTime.of(1981, 9, 5, 0, 0, 0, 0, ZoneOffset.UTC));
        p2.setNome("Simone Pirrotti Ferreira");
        p2.setSobrenome("Machinesque");
        p2.setSexo(EnumTipoSexo.FEMININO);
        
        endereco1.setLogradouro("Rua Carlos de Carvalho");
        endereco1.setNumero("1500");
        endereco1.setCep("85803-780");
        endereco1.setComplemento("Casa");
        endereco1.setTipoEndereco(EnumTipoEndereco.RESIDENCIAL);
        endereco1.setBairro(bairro1);
        endereco1.setPessoa(p1);
        
        endereco2.setLogradouro("Rua Carlos de Carvalho");
        endereco2.setNumero("1500");
        endereco2.setCep("85803-780");
        endereco2.setComplemento("Casa");
        endereco2.setTipoEndereco(EnumTipoEndereco.RESIDENCIAL);
        endereco2.setBairro(bairro1);
        endereco2.setPessoa(p2);
        
        email1.setEnderecoEmail("machinesque@gmail.com");
        email1.setTipoEmail(EnumTipoEmail.PRINCIPAL);
        email1.setPessoa(p1);
        
        email2.setEnderecoEmail("simonepirrottiferreira@gmail.com");
        email2.setTipoEmail(EnumTipoEmail.PRINCIPAL);
        email2.setPessoa(p2);
        
        bairro1.getEnderecos().addAll(Arrays.asList(endereco1, endereco2));
        
        p1.getEnderecos().addAll(Arrays.asList(endereco1));
        p2.getEnderecos().addAll(Arrays.asList(endereco2));
        
        p1.getEmails().addAll(Arrays.asList(email1));
        p2.getEmails().addAll(Arrays.asList(email2));
        
        pessoaRepository.saveAll(Arrays.asList(p1, p2));
        bairroRepository.saveAll(Arrays.asList(bairro1));
        enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2));
        emailRepository.saveAll(Arrays.asList(email1, email2));
        
        
        
    }

}
