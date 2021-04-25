package com.mertdeveci.watcher.service;

import com.mertdeveci.watcher.entity.IssueHistory;
import com.mertdeveci.watcher.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User findByUsername(String username);
}
