package pl.mlopatka.service.animal;

import pl.mlopatka.model.animals.Animal;
import pl.mlopatka.repo.animals.AmphibianRepo;
import pl.mlopatka.repo.animals.BirdRepo;
import pl.mlopatka.repo.animals.InMemoryAmphibianRepo;
import pl.mlopatka.repo.animals.InMemoryBirdRepo;
import pl.mlopatka.repo.animals.InMemoryMammalRepo;
import pl.mlopatka.repo.animals.MammalRepo;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {

    private final MammalRepo mammalRepo;
    private final AmphibianRepo amphibianRepo;
    private final BirdRepo birdRepo;

    public AnimalServiceImpl() {
        this.mammalRepo = new InMemoryMammalRepo();
        this.amphibianRepo = new InMemoryAmphibianRepo();
        this.birdRepo = new InMemoryBirdRepo();
    }

    public AnimalServiceImpl(MammalRepo mammalRepo, AmphibianRepo amphibianRepo, BirdRepo birdRepo) {
        this.mammalRepo = mammalRepo;
        this.amphibianRepo = amphibianRepo;
        this.birdRepo = birdRepo;
    }

    public void getAnimals(List<? super Animal> initList) {
        initList.addAll(mammalRepo.getMammals());
        initList.addAll(amphibianRepo.getAmphibians());
        initList.addAll(birdRepo.getBirds());
    }
}
