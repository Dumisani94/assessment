package com.xib.assessment.mapstract.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@ToString
public class AgentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String idNumber;
    private TeamDto teamDto;

    public Long getId() {
        if (this.id != null)
            return id;
        return 0L;
    }

    public String getFirstName() {
        if (this.firstName != null)
            return firstName;
        return "";
    }

    public String getLastName() {
        if (this.lastName != null)
            return lastName;
        return "";
    }

    public String getIdNumber() {
        if (this.idNumber != null)
            return idNumber;
        return "";
    }

    public TeamDto getTeamDto() {
        return teamDto;
    }
}
