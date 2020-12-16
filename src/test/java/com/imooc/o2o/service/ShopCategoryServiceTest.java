package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopCategoryServiceTest extends BaseTest {

    @Autowired
    private ShopCategoryService shopCategoryService;

    @Test
    public void testGetAreaList() {
        List<ShopCategory> shopCategoryList = shopCategoryService.queryShopCategory(new ShopCategory());
        assertEquals(1,shopCategoryList.size());
    }

}
