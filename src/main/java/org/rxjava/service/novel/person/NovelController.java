package org.rxjava.service.novel.person;

import org.rxjava.service.novel.model.NovelModel;
import org.rxjava.service.novel.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author happy 2019-09-16 17:33
 * 小说控制器
 */
@RestController
public class NovelController {
    @Autowired
    private NovelService novelService;

    /**
     * 小说列表
     */
    @GetMapping("novelList/{page}-{pageSize}")
    public Flux<NovelModel> getList(
            @PathVariable int page,
            @PathVariable int pageSize
    ) {
        return Flux.empty();
    }

    /**
     * 小说
     */
    @GetMapping("novel/{novelId}")
    public Mono<NovelModel> getList(
    ) {
        return Mono.empty();
    }
}
