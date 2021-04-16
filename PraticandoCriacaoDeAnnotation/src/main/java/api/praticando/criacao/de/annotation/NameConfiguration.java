package api.praticando.criacao.de.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NameConfiguration {

    @Bean
    public String applicationName(){
        return "Nome da Applicação";
    }
}
