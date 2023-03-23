package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.PreApprovedPictures;

import java.util.List;

public interface PreApprovedPicturesService {

    List<PreApprovedPictures> findAll();

    PreApprovedPictures findById(Long id);

    PreApprovedPictures addPicture(PreApprovedPictures picture);
    void deletePicture(Long id);

}
