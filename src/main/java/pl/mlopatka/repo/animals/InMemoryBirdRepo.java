package pl.mlopatka.repo.animals;

import pl.mlopatka.model.animals.birds.Bird;
import pl.mlopatka.model.animals.birds.Eagle;
import pl.mlopatka.model.animals.birds.Falcon;
import pl.mlopatka.repo.animals.BirdRepo;

import java.util.List;

public class InMemoryBirdRepo implements BirdRepo {

    @Override
    public List<Bird> getBirds() {
        return List.of(new Eagle(), new Falcon());
    }
}
