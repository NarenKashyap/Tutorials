package ibs.service.integration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ibs.domain.model.DomainCourse;

@Repository
public interface CourseRepository extends JpaRepository<DomainCourse, Integer> {

}
