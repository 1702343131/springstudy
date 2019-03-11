package com.spring.AoP;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;
import java.nio.channels.NonWritableChannelException;

/**
 * Created by 张文旭 on 2019/3/11.
 */
public class Qrcode {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        Color foreColor = new Color(255,255,255);
        Color baColor = new Color(253,79,89);
                int foreColorRGB = foreColor.getRGB();
        int baColorRGB = baColor.getRGB();
// 设置前景色，既二维码颜色（青色）
        config.setForeColor(foreColorRGB);
// 设置背景色（灰色）
config.setImg("D:/log1.png");
        config.setBackColor(baColorRGB);
     QrCodeUtil.generate(//
                "https://www.jianshu.com/u/0640fefbc8bf", //二维码内容
                config,
             //附带logo
                FileUtil.file("D:/qrcodeWithLogo.jpg")//写出到的文件
        );
//        QrCodeUtil.generate("https://www.jianshu.com/u/0640fefbc8bf", config, FileUtil.file("D:/qrcode.jpg"));
    }
    }

