/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 4:59 PM
*/
package lk.pmc.controller;

import lk.pmc.dto.ProjectDTO;
import lk.pmc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 4:59 PM
 */

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Save Project
    @PostMapping(path = "/save", consumes = {"application/json"} )

    public String saveProject(@RequestBody ProjectDTO  projectDTO ) {
        System.out.println("method invoked");
        System.out.println(projectDTO.getProjectID()+projectDTO.getProjectName()+"");
        // Your logic for saving the project here
        return "done";
    }

}
