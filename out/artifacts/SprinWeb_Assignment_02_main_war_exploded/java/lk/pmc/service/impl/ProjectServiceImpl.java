/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 6:36 PM
*/
package lk.pmc.service.impl;

import lk.pmc.dto.ProjectDTO;
import lk.pmc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 6:36 PM
 */

@Service
@Primary
public class ProjectServiceImpl implements ProjectService{

    @Override
    public boolean saveProject(ProjectDTO projectDTO) {
        return false;
    }


}
