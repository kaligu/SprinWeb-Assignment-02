/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 10:57 PM
*/
package lk.pmc.entity;

import javax.persistence.Id;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 10:57 PM
 */
public class Project {
    @Id
    private String projectID;
    private String projectName;
    private String projectDetail;
    private int projectNumMembers;

    public Project() {
    }

    public Project(String projectID, String projectName, String projectDetail, int projectNumMembers) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDetail = projectDetail;
        this.projectNumMembers = projectNumMembers;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public int getProjectNumMembers() {
        return projectNumMembers;
    }

    public void setProjectNumMembers(int projectNumMembers) {
        this.projectNumMembers = projectNumMembers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID='" + projectID + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectDetail='" + projectDetail + '\'' +
                ", projectNumMembers=" + projectNumMembers +
                '}';
    }
}
