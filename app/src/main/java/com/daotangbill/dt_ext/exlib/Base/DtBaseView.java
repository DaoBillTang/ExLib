package com.daotangbill.dt_ext.exlib.Base;

public interface DtBaseView<T> {
    void setPresenter(T presenter);

    boolean isActive();
}
