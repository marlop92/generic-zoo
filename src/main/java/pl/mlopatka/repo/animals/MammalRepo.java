package pl.mlopatka.repo.animals;

import pl.mlopatka.model.animals.mammals.Mammal;

import java.util.List;

public interface MammalRepo {

    List<Mammal> getMammals();
}
