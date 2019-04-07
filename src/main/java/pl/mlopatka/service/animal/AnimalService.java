package pl.mlopatka.service.animal;

import pl.mlopatka.model.animals.Animal;

import java.util.List;

public interface AnimalService {

    void getAnimals(List<? super Animal> initList);
}
