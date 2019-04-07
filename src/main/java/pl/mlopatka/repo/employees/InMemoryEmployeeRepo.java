package pl.mlopatka.repo.employees;

import pl.mlopatka.model.employees.Employee;

import java.util.List;

public class InMemoryEmployeeRepo implements EmployeeRepo {

    @Override
    public List<Employee> getEmployees() {
        return List.of(new Employee(), new Employee(), new Employee());
    }
}
