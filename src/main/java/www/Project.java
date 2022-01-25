package www;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
public class Project {

    private final Long id;
    private String projectCode;
    private String projectTitle;
    private Date startDate;
    private Date endDate;
    private Double plannedAmount;
    private Organization partner;
    private List<Organization> implementingPartners;
    private Sector sector;
    private String status;

    Project(Long id, String projectTitle) {
        this.id = id;
        this.projectTitle = projectTitle;

    }


    public Long getId() {
        return id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

}
