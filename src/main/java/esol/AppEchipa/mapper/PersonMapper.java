package esol.AppEchipa.mapper;

import esol.AppEchipa.entity.Person;
import esol.AppEchipa.model.PersonModel;

public class PersonMapper {

    public static PersonModel entityToModel(Person person)
    {
        return PersonModel.builder()
                .id(person.getId())
                .name(person.getName())
                .age(person.getAge())
                .build();

    }
}
