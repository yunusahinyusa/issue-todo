package com.ysahin.issuemanagement.service.impl;

import com.ysahin.issuemanagement.entity.IssueHistory;
import com.ysahin.issuemanagement.repository.IssueHistoryRepository;
import com.ysahin.issuemanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository){
        this.issueHistoryRepository=issueHistoryRepository;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if(issueHistory==null){
        throw new IllegalArgumentException("Issue cannot be null");
        }
        issueHistory = issueHistoryRepository.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepository.getById(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistoryRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}
