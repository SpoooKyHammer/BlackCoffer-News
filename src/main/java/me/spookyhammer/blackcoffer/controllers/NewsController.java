package me.spookyhammer.blackcoffer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.spookyhammer.blackcoffer.entity.News;
import me.spookyhammer.blackcoffer.repository.NewsRepository;

@RestController
@RequestMapping("/news")
class NewsController {
   
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping()
    public List<News> all() {
        return newsRepository.findAll();
    }
}
