package in.ashokIT.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokIT.entity.Student;


public interface StudentRepository extends CrudRepository<Student, Integer> {

}
