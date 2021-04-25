package com.mertdeveci.watcher.repository;

import com.mertdeveci.watcher.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
    interface üzeirne koyulacak @Repository anlamı
     Spring IoC içerisine yerleştir ve autrowired edilmesi
    gereken yerlere erişimde kullan ancak bunun kullanım zporunluluğu Spring 2 ile kaldıırldı.

    @Repository
 */



public interface ProjectRepository extends JpaRepository<Project,Long> {

    // Hazır metodlar dışında ihti,yaç duyduğumuz metodlar find veya get ile başlanarak
    // isimlendiirlir.

    List<Project>  getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    @Override
    Page<Project> findAll(Pageable pageable);
    // Pageble sayfalama yapmak için kullanılır

    @Override
    List<Project> findAll(Sort sort);

}
