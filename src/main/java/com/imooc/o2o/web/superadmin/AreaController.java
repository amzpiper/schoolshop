package com.imooc.o2o.web.superadmin;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
@RequestMapping("/superadmin")
public class AreaController {

    Logger logger = LoggerFactory.getLogger(AreaController.class);
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listArea() {
        //一般用info记录方法启动与结束，用debug记录调试，调优执行时间
        logger.info("======start======");
        long startTime = System.currentTimeMillis();
        Map<String, Object> modelMap = new HashMap<String, Object>();//存放方法返回值
        List<Area> list = new ArrayList<Area>();                     //区域列表
        try {
            list = areaService.getAreaList();
            modelMap.put("rows", list);             //因为用easyUi,key值固定为rows
            modelMap.put("total", list.size());     //因为用easyUi,key值固定为total
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("error", e.toString());
        }
        logger.error("test error!");
        long endTime = System.currentTimeMillis();
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("======end======");
        return modelMap;
    }


}
