package vn.edu.crs.course_service.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.crs.course_service.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existsByTenMonHocIgnoreCase(String tenMonHoc);

    // Buổi 3: Spring Data JPA tự sinh câu lệnh SQL LIKE %keyword% không phân biệt hoa/thường
    Page<Course> findByTenMonHocContainingIgnoreCase(String keyword, Pageable pageable);
}
