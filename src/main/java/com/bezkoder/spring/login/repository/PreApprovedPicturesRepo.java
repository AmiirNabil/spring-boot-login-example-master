package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.PreApprovedPictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PreApprovedPicturesRepo extends JpaRepository<PreApprovedPictures, Long> {
    @Override
    List<PreApprovedPictures> findAll();
}
