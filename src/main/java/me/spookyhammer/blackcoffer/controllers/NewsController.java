package me.spookyhammer.blackcoffer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.spookyhammer.blackcoffer.entity.News;
import me.spookyhammer.blackcoffer.repository.NewsRepository;

@RestController
@RequestMapping("/news")
class NewsController {
   
    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping()
    public List<News> all() {
        return newsRepository.findAll();
    }

    @GetMapping("/filter")
    public List<News> filteredNews(
        @RequestParam(required = false) Integer endYear,
        @RequestParam(required = false) String topic,
        @RequestParam(required = false) String sector,
        @RequestParam(required = false) String region,
        @RequestParam(required = false) String pestle,
        @RequestParam(required = false) String source,
        @RequestParam(required = false) String swot,
        @RequestParam(required = false) String country,
        @RequestParam(required = false) String city
    ) {
        Query dynamicQuery = new Query();
        
        if (endYear != null) dynamicQuery.addCriteria(Criteria.where("end_year").is(endYear));
        if (topic != null) dynamicQuery.addCriteria(Criteria.where("topic").is(topic));
        if (sector != null) dynamicQuery.addCriteria(Criteria.where("sector").is(sector));
        if (region != null) dynamicQuery.addCriteria(Criteria.where("region").is(region));
        if (pestle != null) dynamicQuery.addCriteria(Criteria.where("pestle").is(pestle));
        if (source != null) dynamicQuery.addCriteria(Criteria.where("source").is(source));
        if (swot != null) dynamicQuery.addCriteria(Criteria.where("swot").is(swot));
        if (country != null) dynamicQuery.addCriteria(Criteria.where("country").is(country));
        if (city != null) dynamicQuery.addCriteria(Criteria.where("city").is(city));
        
        return mongoTemplate.find(dynamicQuery, News.class);
    }
}
