package com.example.kiemthu.bai2;

public class SinhVien {
    private String maSV;

    private String ten;

    private int tuoi;

    private float diemTB;

    private int kyHoc;

    private String chuyenNghanh;


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public SinhVien(String maSV, String ten, int tuoi, float diemTB, int kyHoc, String chuyenNghanh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
        this.kyHoc = kyHoc;
        this.chuyenNghanh = chuyenNghanh;
    }

    public SinhVien() {
    }
}
