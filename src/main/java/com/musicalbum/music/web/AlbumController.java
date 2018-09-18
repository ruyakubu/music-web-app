package com.musicalbum.music.web;

import com.musicalbum.music.domain.Album;
import com.musicalbum.music.repositories.jpa.AlbumRepository;
import com.musicalbum.music.service.AlbumService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/albums")
public class AlbumController {
    private static final Logger logger = LoggerFactory.getLogger(AlbumController.class);

    @Autowired
    private AlbumService albumService;
    
/*    @Autowired
    public AlbumController(AlbumRepository repository) {
        this.repository = repository;
    }*/
    
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Album> getAlbums() {
        return albumService.getAllalbums();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Album add(@RequestBody @Valid Album album) {
        logger.info("Adding album " + album.getId());
        return albumService.addAlbum(album);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Album update(@RequestBody @Valid Album album) {
        logger.info("Updating album " + album.getId());
        return albumService.updateAlbum(album);
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