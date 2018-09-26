package abhi.controller;

import abhi.dao.Employee;
import abhi.dao.FetchEmployeeCriteria;
import abhi.dao.SimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestController1 {

    @Autowired
    private SimpleRepository simpleRepository;
    @Autowired
    private FetchEmployeeCriteria fetchEmployeeCriteria;
    @GetMapping(path = "/all")
    public Iterable<Employee> getEmployee(){
        return simpleRepository.findAll();
    }

    @GetMapping(path = "/emp")
    public List<Employee> getEmployeeName(){
        return simpleRepository.findTitleById(1,2);
    }
    @GetMapping(path = "/emp1")
    public List<Employee> getEmployeeNameA() {
        return fetchEmployeeCriteria.findEmployeewithA();
    }
}
