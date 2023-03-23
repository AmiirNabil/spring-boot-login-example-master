package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.PreApprovedPictures;
import com.bezkoder.spring.login.repository.PreApprovedPicturesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreApprovedPicturesServiceImpl implements PreApprovedPicturesService {
@Autowired
    PreApprovedPicturesRepo photo;
    @Override
    public List<PreApprovedPictures> findAll() {
        return photo.findAll();
    }

    @Override
    public PreApprovedPictures findById(Long id) {
        return photo.findAll().stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    @Override
    public PreApprovedPictures addPicture(PreApprovedPictures picture) {

        return photo.save(picture);

    }

    @Override
    public void deletePicture(Long id) {
        photo.deleteById(id);

    }
}
