package me.spookyhammer.blackcoffer.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * News
 */
public class News {
    
    @Id
    public ObjectId Id;

    public Integer end_year;
    public String cityLng;
    public String cityLat;
    public String section;
    public Integer intensity;
    public String topic;
    public String insight;
    public String swot;
    public String url;
    public String region;
    public Integer start_year;
    public Integer impact;
    public String added;
    public String published;
    public String city;
    public String country;
    public Integer relevance;
    public String pestle;
    public String source;
    public String title;
    public Integer likelihood;

    public News() {
    }

    public News(ObjectId id, Integer end_year, String cityLng, String cityLat, String section, Integer intensity,
            String topic, String insight, String swot, String url, String region, Integer start_year, Integer impact,
            String added, String published, String city, String country, Integer relevance, String pestle,
            String source, String title, Integer likelihood) {
        Id = id;
        this.end_year = end_year;
        this.cityLng = cityLng;
        this.cityLat = cityLat;
        this.section = section;
        this.intensity = intensity;
        this.topic = topic;
        this.insight = insight;
        this.swot = swot;
        this.url = url;
        this.region = region;
        this.start_year = start_year;
        this.impact = impact;
        this.added = added;
        this.published = published;
        this.city = city;
        this.country = country;
        this.relevance = relevance;
        this.pestle = pestle;
        this.source = source;
        this.title = title;
        this.likelihood = likelihood;
    }    
}
