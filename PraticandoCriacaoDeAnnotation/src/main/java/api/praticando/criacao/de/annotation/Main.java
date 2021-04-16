package api.praticando.criacao.de.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

//    @Autowired
//    @Qualifier("applicationName")
//    private String name;

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/applicationName")
    public String getApplicationName(){
        return applicationName;
    }

//    @GetMapping("/name")
//    public String getName(){
//        return name;
//    }

    @GetMapping("/")
    public String theFirst(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
