package com.share4happy.model;

import java.io.Serializable;

public class Ban implements Serializable {
    private String _soBan;
    private int _LinkAnh;

    public Ban(){

    }

    public Ban(String _soBan, int _LinkAnh) {
        this._soBan = _soBan;
        this._LinkAnh = _LinkAnh;
    }

    public String get_soBan() {
        return _soBan;
    }

    public void set_soBan(String _soBan) {
        this._soBan = _soBan;
    }

    public int get_LinkAnh() {
        return _LinkAnh;
    }

    public void set_LinkAnh(int _LinkAnh) {
        this._LinkAnh = _LinkAnh;
    }
}
