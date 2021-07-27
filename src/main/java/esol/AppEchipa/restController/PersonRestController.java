package esol.AppEchipa.restController;

import esol.AppEchipa.model.PersonModel;
import esol.AppEchipa.service.PersonService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonRestController {
    @NonNull
    PersonService personService;

    @GetMapping("/{pageNumber}")
    public List<PersonModel> getPersons(@PathVariable Integer pageNumber) {
           return personService.getSetOfTenPersonsByPageNumber(pageNumber);
    }
}
