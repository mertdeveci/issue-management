package com.mertdeveci.watcher.repository;

import com.mertdeveci.watcher.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
