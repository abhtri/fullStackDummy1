package abhi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.List;

@Repository
public class FetchEmployeeCriteria {
    @Autowired
    EntityManager entityManager;

    public  List<Employee> findEmployeewithA(){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> employeeRoot = criteriaQuery.from(Employee.class);
        criteriaQuery.select(employeeRoot);
        List<String> parentList = Arrays.asList(new String[]{"Monika", "Vishal"});
        Predicate predicate =employeeRoot.get("name").in(parentList);
        criteriaQuery.where(predicate);
        TypedQuery<Employee> employeeTypedQuery = entityManager.createQuery(criteriaQuery);
        return employeeTypedQuery.getResultList();

    }
}
