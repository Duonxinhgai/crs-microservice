package vn.edu.crs.course_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenMonHoc;

    private Integer soTinChi;     // Đảm bảo là Integer, KHÔNG để String

    private Integer soChoToiDa;   // Đảm bảo là Integer, KHÔNG để String

    private Integer soChoConLai;  // Đảm bảo là Integer, KHÔNG để String
}