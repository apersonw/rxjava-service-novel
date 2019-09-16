package org.rxjava.service.novel.repository;

import org.rxjava.common.core.mongo.PageAgent;
import org.rxjava.service.novel.entity.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author happy 2019-09-16 17:35
 */
@Repository
public interface NovelRepository extends ReactiveSortingRepository<Novel, String>, SpecialNovelRepository {
}

interface SpecialNovelRepository {

}

class SpecialNovelRepositoryImpl implements SpecialNovelRepository {
    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;

    private PageAgent<Novel> pageAgent;

    @PostConstruct
    private void init() {
        pageAgent = new PageAgent<>(reactiveMongoTemplate, Novel.class);
    }
}