package pl.mlopatka.repo.animals;

import pl.mlopatka.model.animals.mammals.Lion;
import pl.mlopatka.model.animals.mammals.Mammal;
import pl.mlopatka.model.animals.mammals.Zebra;

import java.util.List;

public class InMemoryMammalRepo implements MammalRepo {

    public List<Mammal> getMammals() {
        return List.of(new Lion(), new Zebra());
    }
}
