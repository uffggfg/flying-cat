package com.uffggfg.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//加载Properties文件
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建Properties对象
        Properties p = new Properties();
        try (
                InputStream in = new FileInputStream("F:\\study2\\idea-workspace\\day19-IO\\src\\db.properties");
        ) {
            //加载输入流中的数据，加载后数据都在p对象中
            p.load(in);
            System.out.println(p);
            System.out.println("用户:" + p.getProperty("username"));
            System.out.println("密码:" + p.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
