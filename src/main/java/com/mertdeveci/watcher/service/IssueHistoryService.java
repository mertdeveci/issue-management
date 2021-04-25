package com.mertdeveci.watcher.service;


import com.mertdeveci.watcher.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);
    // Veritabanına kaybdetmek için kullanacağız

    IssueHistory getById(Long id);
    // Id değerine göre ilgili IssueHistory döndür

    Page<IssueHistory> getAllPageable(Pageable pageable);
    // Pageable ile sayfa sayfa verilerin çekilmesi işlemi yapılır

    Boolean delete(IssueHistory issueHistory);

}
