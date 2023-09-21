package lk.pmc.service;




import lk.pmc.dto.TechLeadDTO;

import java.util.List;

public interface TechLeadService {
    public void saveTechLead(TechLeadDTO dto);

    public void deleteTechLead(String id);

    public void updateTechLead(TechLeadDTO dto);

    public TechLeadDTO searchTechLead(String id);

    public List<TechLeadDTO> getAllTechLead();

}
