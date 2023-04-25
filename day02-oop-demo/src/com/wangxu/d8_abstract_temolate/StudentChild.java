package com.wangxu.d8_abstract_temolate;

import javax.print.DocFlavor;

public class StudentChild extends Student {

    @Override
    public String writeMain() {
        return "小学生正文部分";
    }
}
