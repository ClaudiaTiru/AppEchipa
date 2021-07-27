package esol.AppEchipa.service;

import esol.AppEchipa.model.PersonModel;
import esol.AppEchipa.repository.PersonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class PersonService {

    @NonNull
  private final PersonRepository personRepository;

    public List<PersonModel> getAllPersons()
    {

        List<PersonModel> personsModel = personRepository.findAll()
                .stream()
                .map(person -> new PersonModel(person.getId(), person.getName(), person.getAge()))
                .collect(Collectors.toList());

        return personsModel;
    }
    public List<PersonModel> getSetOfTenPersonsByPageNumber( Integer pageNumber) {
        Pageable setsPageNumber = PageRequest.of(pageNumber, 10);
        List<PersonModel> personsModel = personRepository.findAll(setsPageNumber)
                .stream()
                .map(person -> new PersonModel(person.getId(), person.getName(), person.getAge()))
                .collect(Collectors.toList());
        return personsModel;
    }
}
