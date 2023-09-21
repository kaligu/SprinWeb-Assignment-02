package lk.pmc.service;



import lk.pmc.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {

    public void saveProject(ProjectDTO dto);

    public void deleteProject(String id);

    public void updateProject(ProjectDTO dto);

    public ProjectDTO searchProject(String id);

    public List<ProjectDTO> getAllProject();

}
