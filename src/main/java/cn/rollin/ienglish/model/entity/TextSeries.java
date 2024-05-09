package cn.rollin.ienglish.model.entity;


import lombok.Data;

import java.util.Date;

/**
 * 课本系列表实体
 *
 * @author rollin
 * @date 2024-05-07 22:41:51
 */
@Data
public class TextSeries {
    /**
     * id
     */
    private Integer id;
    /**
     * 序列中文(中)
     */
    private String seriesNameZh;
    /**
     * 序列名称(英)
     */
    private String seriesNameEn;
    /**
     * 课本路径
     */
    private String pdfPath;
    /**
     * 创建人
     */
    private Integer createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;
}
