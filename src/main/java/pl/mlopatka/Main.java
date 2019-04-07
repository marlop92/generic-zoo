package pl.mlopatka;

import pl.mlopatka.service.zoo.ZooService;
import pl.mlopatka.service.zoo.ZooServiceImpl;

public class Main {

    public static void main(String[] args) {
        ZooService service = new ZooServiceImpl();
        service.displayAllZooElements();
    }
}
