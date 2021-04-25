package com.mertdeveci.watcher.service.implementations;

import com.mertdeveci.watcher.entity.IssueHistory;
import com.mertdeveci.watcher.entity.Project;
import com.mertdeveci.watcher.repository.ProjectRepository;
import com.mertdeveci.watcher.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplement implements ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImplement(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        if(project.getProjectCode()==null){
            throw new IllegalArgumentException("Project code cannot be null!");
        }
        return projectRepository.save(project);
    }

    @Override
    public Project getById(Long id) {
        return projectRepository.getOne(id);
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectContains(String projectCode) {
        return null;
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        return null;
    }
}
