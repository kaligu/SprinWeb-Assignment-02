/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 6:35 PM
*/
package lk.pmc.service;

import lk.pmc.dto.ProjectDTO;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 6:35 PM
 */
public interface ProjectService {
    boolean saveProject(ProjectDTO projectDTO);
}
