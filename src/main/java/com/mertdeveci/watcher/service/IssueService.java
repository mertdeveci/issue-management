package com.mertdeveci.watcher.service;

import com.mertdeveci.watcher.dto.IssueDto;
import com.mertdeveci.watcher.entity.Issue;
import com.mertdeveci.watcher.entity.IssueHistory;
import com.mertdeveci.watcher.util.TPage;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);
    // Veritabanına kaybdetmek için kullanacağız

    IssueDto getById(Long id);
    // Id değerine göre ilgili issue döndür

    TPage<IssueDto> getAllPageable(Pageable pageable);
    // Pageable ile sayfa sayfa verilerin çekilmesi işlemi yapılır

    Boolean delete(IssueDto issue);
}
