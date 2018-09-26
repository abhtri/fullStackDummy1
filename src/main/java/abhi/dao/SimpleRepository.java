package abhi.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SimpleRepository extends CrudRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e where e.id in (:id,:id2)")
    List<Employee> findTitleById(@Param("id") Integer id,@Param("id2") Integer id2);
}
