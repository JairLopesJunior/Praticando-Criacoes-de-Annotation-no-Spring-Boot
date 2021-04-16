package api.praticando.criacao.de.annotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class NameConfiguration {

    @Bean
    @Homolog
    public CommandLineRunner onlyHolomog(){
        return args -> {
            System.out.println("VOCE ESTA VENDO ISTO POR QUE É AMBIENTE DE HOMOLOG :D");
        };
    }

    @Bean
    public String applicationName(){
        return "Nome da Applicação";
    }
}
