package com.spring.AoP;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.logging.Logger;

/**
 * Created by 张文旭 on 2019/3/11.
 */
@Aspect
public class ImageHandle {
    private  static  final org.slf4j.Logger logger =
            LoggerFactory.getLogger("ImageHandle.class");
   @Pointcut("execution(* com.spring.AoP.ImageCopy.copyImage())")
    public void handleImage(){

   }
   @Before(value = "handleImage()")
    public void pressTextOnImage(){
        logger.info("开始添加水印");
       File srcFile = new File("D:/pic.jpg");
       File destFile = new File("D:/pic1.jpg");
       Color color = new Color(211,71,38);
       Font font =new Font("微软雅黑",Font.BOLD ,150);
       ImageUtil.pressText(srcFile,destFile,"这是水印",color,font,1600,1000,1.0f);
   }
   @AfterReturning("handleImage()")
   public void grayImage(){
        logger.info( "将图片转换为黑白" );
        File srcFile = new File( "E:/pic1.jpg" );
       File destFile = new File( "E:/pic2.jpg" );
       ImageUtil.gray( srcFile,destFile );

   }
}

