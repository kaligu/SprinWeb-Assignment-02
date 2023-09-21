package lk.pmc.repo;


import lk.ijse.TechLeadManageSystem.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, String> {
}
