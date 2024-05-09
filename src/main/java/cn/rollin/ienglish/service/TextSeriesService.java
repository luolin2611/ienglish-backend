package cn.rollin.ienglish.service;

import cn.rollin.ienglish.model.entity.TextSeries;

import java.util.List;

/**
 * 课本系列
 *
 * @author rollin
 * @date 2024-05-06 21:42:36
 */
public interface TextSeriesService {
    List<TextSeries> listTextSeries();
}
