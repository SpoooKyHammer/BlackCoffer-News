package me.spookyhammer.blackcoffer.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import me.spookyhammer.blackcoffer.entity.News;

/**
 * NewsRepository
 */
public interface NewsRepository extends MongoRepository<News, ObjectId> {
 
}
