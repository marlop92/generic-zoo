package pl.mlopatka.service.zoo;

import pl.mlopatka.model.ZooElement;
import pl.mlopatka.repo.employees.EmployeeRepo;
import pl.mlopatka.repo.employees.InMemoryEmployeeRepo;
import pl.mlopatka.service.animal.AnimalService;
import pl.mlopatka.service.animal.AnimalServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ZooServiceImpl implements ZooService {

    private final AnimalService animalService;
    private final EmployeeRepo employeeRepo;

    public ZooServiceImpl() {
        this.animalService = new AnimalServiceImpl();
        this.employeeRepo = new InMemoryEmployeeRepo();
    }

    @Override
    public void displayAllZooElements() {
        List<ZooElement> zooElements = new ArrayList<>(employeeRepo.getEmployees());
        animalService.getAnimals(zooElements);
        zooElements.forEach(System.out::println);
    }
}
