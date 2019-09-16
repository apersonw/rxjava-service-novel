package org.rxjava.service.novel.service;

import org.rxjava.service.novel.repository.NovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author happy 2019-09-16 17:35
 */
@Service
public class NovelService {
    @Autowired
    private NovelRepository novelRepository;

}
