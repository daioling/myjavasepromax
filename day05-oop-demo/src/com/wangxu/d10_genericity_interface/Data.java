package com.wangxu.d10_genericity_interface;

public interface Data <E> {
    void add(E e);
    void delete(int id);
    void updata(E e);
    E queryById(int id);
}
