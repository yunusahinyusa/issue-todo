package com.ysahin.issuemanagement.repository;

import com.ysahin.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}
