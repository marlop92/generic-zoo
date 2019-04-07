package pl.mlopatka.repo.animals;

import pl.mlopatka.model.animals.amphibians.Amphibian;
import pl.mlopatka.model.animals.amphibians.Frog;
import pl.mlopatka.repo.animals.AmphibianRepo;

import java.util.List;

public class InMemoryAmphibianRepo implements AmphibianRepo {

    @Override
    public List<Amphibian> getAmphibians() {
        return List.of(new Frog());
    }
}
