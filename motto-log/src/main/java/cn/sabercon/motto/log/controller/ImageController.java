package cn.sabercon.motto.log.controller;

import cn.sabercon.motto.common.dto.PageReq;
import cn.sabercon.motto.common.dto.PageRes;
import cn.sabercon.motto.common.dto.Result;
import cn.sabercon.motto.log.entity.Image;
import cn.sabercon.motto.log.service.ImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ywk
 * @date 2020-01-03
 */
@Api("上传和获取图片接口")
@CrossOrigin
@RestController
@RequestMapping("img")
public class ImageController {

    @Autowired
    private ImageService service;

    @ApiOperation("上传图片")
    @PostMapping
    public Result save(Image image) {
        service.save(image);
        return Result.success();
    }

    @ApiOperation("删除图片")
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Long id) {
        service.delete(id);
        return Result.success();
    }

    @ApiOperation("获取图片列表")
    @GetMapping
    public Result<PageRes<Image>> list(PageReq pageReq) {
        return Result.success(service.list(pageReq));
    }

    @ApiOperation("根据limit语法获取图片列表")
    @GetMapping("{start}/{size}")
    public Result<List<Image>> listByLimit(@PathVariable Integer start, @PathVariable Integer size) {
        return Result.success(service.listByLimit(start, size));
    }

}
