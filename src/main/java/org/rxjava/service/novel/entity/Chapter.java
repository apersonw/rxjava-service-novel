package org.rxjava.service.novel.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author happy 2019-09-16 17:20
 * 章节
 */
@Data
public class Chapter {
    private String id;
    /**
     * 小说Id
     */
    private String novelId;
    /**
     * 标题
     */
    private String title;
    /**
     * 章数
     */
    private int chapterNum;
    /**
     * 内容段落
     */
    private List<String> paragraph;
    /**
     * 创建日期
     */
    @CreatedDate
    @Indexed(direction = IndexDirection.DESCENDING)
    private LocalDateTime createDate;
}
