package com.sql.main;

import com.vcc.sdk.sql.JavaShell;

public class ImExcute {

    public static void main(String[] args) {

        String path = ImExcute.class.getClassLoader().getResource("im.yml").getPath();
        JavaShell shell = new JavaShell(path);

        shell.createSqlMd();
        shell.createJavaFile();
        shell.createMapperXML();
    }

}
