package com.lol.sion.controller;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/8/7
 */
@RequestMapping("/test")
@RestController
public class SwaggerTestController {

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<String> getStrList() {
        List<String> strLIst = Lists.newArrayList("asda", "asd", "asd");
        return strLIst;
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getStr(@PathVariable String id) {
        return "andy"+id;
    }

}
