package www;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(
                    new User("Bilbo Baggins", "burglar", 38.2612468266, 48.4428980527)));
            log.info("Preloading " + repository.save(
                    new User("Frodo Baggins", "thief", 38.3903443965,  48.6968317769)));
        };
    }
}
