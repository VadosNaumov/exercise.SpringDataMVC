package ru.exercise.mvcsecurity.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.exercise.mvcsecurity.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
