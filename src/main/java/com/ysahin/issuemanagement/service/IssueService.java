package com.ysahin.issuemanagement.service;

import com.ysahin.issuemanagement.dto.IssueDto;
import com.ysahin.issuemanagement.entity.Issue;
import com.ysahin.issuemanagement.entity.IssueHistory;
import com.ysahin.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

}
