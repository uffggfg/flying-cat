package com.uffggfg.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//列出文件的分层结构
//期望效果：study>EDA技术>实验3 wangli
public class FileDemo4 {
    public static void main(String[] args) {
        String file = "F:\\study\\EDA技术\\实验3 wangli\\History";
        File f = new File(file);
        List<String> parentsNames = new ArrayList<>();
        listAllParent(parentsNames,f);
        System.out.println(parentsNames);
        Collections.reverse(parentsNames);//颠倒list元素顺序
        StringBuilder sb = new StringBuilder(40);
        for (String name : parentsNames){
            sb.append(name).append(">");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
    private static void listAllParent(List<String> parentsNames,File f){
        if (!"".equals(f.getParentFile().getName())){
            parentsNames.add(f.getParentFile().getName());
        }
        if (f.getParentFile().getParentFile() != null){
            listAllParent(parentsNames,f.getParentFile());
        }
    }
}
