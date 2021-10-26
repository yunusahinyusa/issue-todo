package com.ysahin.issuemanagement.service;

import com.ysahin.issuemanagement.dto.ProjectDto;
import com.ysahin.issuemanagement.entity.Issue;
import com.ysahin.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    ProjectDto getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

}
