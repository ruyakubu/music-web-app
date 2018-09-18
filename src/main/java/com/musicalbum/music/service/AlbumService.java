package com.musicalbum.music.service;


import com.musicalbum.music.domain.Album;
import com.musicalbum.music.repositories.jpa.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AlbumService {

    private AlbumRepository repository;
    
    @Autowired
    public AlbumService(AlbumRepository repository) {
        this.repository = repository;
    }
    

    public Iterable<Album> getAllalbums() {
        return repository.findAll();
    }


    public Album addAlbum(Album album) {

        return repository.save(album);
    }


    public Album updateAlbum(Album album) {
        return repository.save(album);
    }

/*    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Album getById(@PathVariable String id) {
        logger.info("Getting album " + id);
        return repository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable String id) {
        logger.info("Deleting album " + id);
        repository.delete(id);
    }*/
	
	
}
