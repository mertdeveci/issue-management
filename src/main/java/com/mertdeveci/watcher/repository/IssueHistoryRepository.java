package com.mertdeveci.watcher.repository;

import com.mertdeveci.watcher.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
