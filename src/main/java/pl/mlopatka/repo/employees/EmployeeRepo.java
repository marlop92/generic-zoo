package pl.mlopatka.repo.employees;

import pl.mlopatka.model.employees.Employee;

import java.util.List;

public interface EmployeeRepo {

    List<Employee> getEmployees();
}
