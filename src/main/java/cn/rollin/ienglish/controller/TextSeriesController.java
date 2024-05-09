package cn.rollin.ienglish.controller;

import cn.rollin.ienglish.model.dto.Response;
import cn.rollin.ienglish.model.entity.TextSeries;
import cn.rollin.ienglish.service.TextSeriesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课本系列
 *
 * @author rollin
 * @date 2024-05-06 21:39:15
 */
@Tag(name = "课文系列Controller")
@RestController
@RequestMapping("/textSeries")
public class TextSeriesController {

    @Resource
    private TextSeriesService textSeriesService;

    /**
     * 查询所有课文
     *
     * @return 实例对象
     */
    @GetMapping("/list")
    @Operation(summary = "查询所有课文系列")
    public Response<List<TextSeries>> listTestSeries() {
        return Response.buildSuccess(textSeriesService.listTextSeries());
    }
}
