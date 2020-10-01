package com.imooc.o2o.util;

import com.imooc.o2o.entity.Shop;

public class PathUtil {

    private static String separator = System.getProperty("file.separator");

    /**
     * 返回项目图片根路径
     * @return
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/img";
        } else {
            basePath = "/home/img";
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    /**
     * 图片保存到不同店铺下
     * 返回项目图片子路径
     * @param shopId
     * @return
     */
    public static String getShopImagePath(Long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", separator);
    }

}