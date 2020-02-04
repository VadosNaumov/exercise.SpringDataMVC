package ru.exercise.mvcsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.exercise.mvcsecurity.domain.Person;
import ru.exercise.mvcsecurity.repostory.PersonRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MvcSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSecurityApplication.class, args);
    }

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void init() {
        repository.save(new Person("Pushkin"));
        repository.save(new Person("Lermontov"));
        repository.save(new Person("Nekrasov"));
        repository.save(new Person("Tolstoy"));
    }

}
