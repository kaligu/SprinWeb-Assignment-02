package lk.pmc.repo;


import lk.ijse.TechLeadManageSystem.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechLeadRepo extends JpaRepository<TechLead,String> {
    TechLead getTechLeadsById(String id);
}
