package com.example.kiemthu.bai2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
private List<SinhVien> danhSach = new ArrayList<>();

public String addSinhVien(SinhVien sv){
    if (sv==null){
        throw new IllegalArgumentException("khong hop le");
    }
    if (sv.getMaSV().isEmpty()||sv.getTen().isEmpty()||sv.getChuyenNghanh().isEmpty()){
        throw new IllegalArgumentException("ko duoc de trong");
    }
    if(sv.getKyHoc()<=0||sv.getDiemTB()<=0||sv.getTuoi()<=0){
        throw new IllegalArgumentException("sai so");
    }   if(danhSach.stream().anyMatch(s->s.getMaSV().equalsIgnoreCase(sv.getMaSV()))){
        throw  new IllegalArgumentException("trung ma");
    }
     danhSach.add(sv);
    return "them thanh cong";
}
public String delete(String maSV ){
  if(maSV==null||maSV.isEmpty() ){
      throw new IllegalArgumentException("koc co ma nay");
  }if(danhSach == null || danhSach.isEmpty()){
      throw new IllegalArgumentException("danh sach ko dc de trong");
  }

    boolean removed = danhSach.removeIf(sv -> sv.getMaSV().equalsIgnoreCase(maSV));
    return removed ? "xoa thanh cong" : "xoa khong thanh cong";
}

public String upadate(String maSV ,SinhVien sinh) {
    SinhVien sinhvien = danhSach.stream().filter(sv -> sv.getMaSV().equalsIgnoreCase(maSV)).findFirst().orElse(null);
    if (sinhvien==null){
        throw new IllegalArgumentException("khong hop le");
    }
     if (sinhvien.getMaSV().isEmpty()||sinhvien.getTen().isEmpty()||sinhvien.getChuyenNghanh().isEmpty()){
        throw new IllegalArgumentException("ko duoc de trong");
    }
    if(sinhvien.getKyHoc()<=0||sinhvien.getDiemTB()<=0||sinhvien.getTuoi()<=0) {
        throw new IllegalArgumentException("sai so");
    }

    return "sua thanh cong";
}
    public void setDanhSach(List<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }


}
