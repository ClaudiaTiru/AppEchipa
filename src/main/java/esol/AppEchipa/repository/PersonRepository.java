package esol.AppEchipa.repository;

import esol.AppEchipa.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>, PagingAndSortingRepository<Person,Long> {
        List<Person> findAll();


}
