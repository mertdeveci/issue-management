package com.mertdeveci.watcher.service.implementations;

import com.mertdeveci.watcher.dto.IssueDto;
import com.mertdeveci.watcher.entity.Issue;
import com.mertdeveci.watcher.repository.IssueRepository;
import com.mertdeveci.watcher.service.IssueService;
import com.mertdeveci.watcher.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;


public class IssueServiceImplement implements IssueService {
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public IssueServiceImplement(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper= modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate()==null){
            throw new IllegalArgumentException("Issue Date cannot be null");
        }
        Issue issueDb= modelMapper.map(issue,Issue.class);
        // Dışarıdan gelen issueDTO içeride kullanılan IssueDB çevir. Değişken isimlerinin aynı olmalı

        issueDb= issueRepository.save(issueDb);
        // Veritabanı nesnesine çevirdikten sonra artık kaydedebiliriz. Kaydettik.

        return modelMapper.map(issueDb,IssueDto.class);
        // Kaybettikten sonra dış tarafa dönerken yine modelMapper kullandık

    }



    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data= issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos=modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
