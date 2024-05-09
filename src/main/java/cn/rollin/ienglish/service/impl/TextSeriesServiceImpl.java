package cn.rollin.ienglish.service.impl;

//import cn.rollin.ienglish.mapper.TextSeriesMapper;

import cn.rollin.ienglish.mapper.TextSeriesMapper;
import cn.rollin.ienglish.model.entity.TextSeries;
import cn.rollin.ienglish.service.TextSeriesService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课本系列
 *
 * @author rollin
 * @date 2024-05-06 21:47:13
 */
@Service
public class TextSeriesServiceImpl implements TextSeriesService {

    @Resource
    private TextSeriesMapper textSeriesMapper;

    @Override
    public List<TextSeries> listTextSeries() {
        List<TextSeries> textSeriesDOS = textSeriesMapper.selectSeries();
        return textSeriesMapper.selectList(null);
    }
}
