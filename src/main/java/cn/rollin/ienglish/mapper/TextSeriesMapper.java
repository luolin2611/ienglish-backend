package cn.rollin.ienglish.mapper;

import cn.rollin.ienglish.model.entity.TextSeries;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 课本系列 数据库访问层
 *
 * @author rollin
 * @date 2024-05-06 21:47:54
 */
public interface TextSeriesMapper extends BaseMapper<TextSeries> {
    List<TextSeries> selectSeries();
}
