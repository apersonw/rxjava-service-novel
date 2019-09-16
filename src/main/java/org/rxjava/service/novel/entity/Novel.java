package org.rxjava.service.novel.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

/**
 * @author happy 2019-09-16 17:18
 */
@Data
public class Novel {
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
    @CreatedDate
    @Indexed(direction = IndexDirection.DESCENDING)
    private LocalDateTime createDate;
    /**
     * 更新日期
     */
    @LastModifiedDate
    private LocalDateTime updateDate;
}
