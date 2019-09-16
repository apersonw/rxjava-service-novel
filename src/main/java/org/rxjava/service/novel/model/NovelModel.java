package org.rxjava.service.novel.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author happy 2019-09-16 17:33
 */
@Data
public class NovelModel {
    private String id;
    /**
     * 小说名
     */
    private String name;
    /**
     * 作者
     */
    private String author;
    /**
     * 封面图Url
     */
    private String coverImageUrl;
    /**
     * 创建日期
     */
    private LocalDateTime createDate;
    /**
     * 更新日期
     */
    private LocalDateTime updateDate;
}
