package pl.mlopatka.repo.animals;

import pl.mlopatka.model.animals.birds.Bird;

import java.util.List;

public interface BirdRepo {

    List<Bird> getBirds();
}
