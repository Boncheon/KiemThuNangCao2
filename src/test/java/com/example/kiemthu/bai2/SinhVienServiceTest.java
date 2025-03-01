package com.example.kiemthu.bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService ;
    private List<SinhVien> danhsach = new ArrayList<>();
    @BeforeEach
    void setUp(){
        sinhVienService = new SinhVienService();
    }
    @Test
    void addSinhVien_TrungMa_ThrowException() {
        // Arrange: Tạo hai sinh viên có cùng mã SV
        SinhVien sv1 = new SinhVien("SV07", "Manh", 19, 8.5f, 4, "CNTT");
        SinhVien sv2 = new SinhVien("SV07", "Tuan", 20, 7.5f, 5, "AI");

        // Act: Thêm sinh viên đầu tiên
        sinhVienService.addSinhVien(sv1);
        // Assert: Thêm sinh viên thứ hai với mã trùng -> Phải ném IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.addSinhVien(sv2);
        });

        // Kiểm tra thông báo lỗi có đúng không
//        assertEquals("trung ma", exception.getMessage());
    }
@Test
    void addthanhCong(){
    SinhVien sv= new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin");

    String e ="them thanh cong";
    String a = sinhVienService.addSinhVien(sv);
    assertEquals(e,a);
}
@Test
    void addCheckSinhVien(){
        assertThrows(IllegalArgumentException.class,()->sinhVienService.addSinhVien(null));
}
    @Test
    void addCheckTrong(){
        SinhVien sv= new SinhVien("","manh",18,9.0f,4,"cong nghe thong tin");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.addSinhVien(sv));
    }
    @Test
    void addCheckSo(){
        SinhVien sv= new SinhVien("ma1","manh",-18,-9.0f,-4,"cong nghe thong tin");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.addSinhVien(sv));
    }
    @Test
    void addCheckso1(){
        SinhVien sv= new SinhVien("","",0,0,0,"");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.addSinhVien(sv));
    }
    @Test
    void deleteThanhOcong(){
        SinhVien sv= new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin");
        sinhVienService.addSinhVien(sv);
        String e ="xoa thanh cong";
        String a = sinhVienService.delete("ma1");
        assertEquals(e,a );
    }
    @Test
    void deletekoThanhOcongNull(){
        SinhVien sv= new SinhVien("","",0,0,0,"");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.delete("ma1"));
    }
    @Test
    void deletekoThanhOcongTrong(){
        SinhVien sv= new SinhVien();
        assertThrows(IllegalArgumentException.class,()->sinhVienService.delete("ma1"));
    }
    @Test
    void deletekoThanhOcong(){
        SinhVien sv= new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin");
        sinhVienService.addSinhVien(sv);
        String e ="xoa khong thanh cong";
        String a = sinhVienService.delete("ma2");
        assertEquals(e,a );
    }
    @Test
    void deletecheckMa(){
      assertThrows(IllegalArgumentException.class,()->sinhVienService.delete(null));
    }
    @Test
    void deletecheckMaTrong(){
        assertThrows(IllegalArgumentException.class,()->sinhVienService.delete(""));
    }
    @Test
    void deletecheckdanhTrong(){
        assertThrows(IllegalArgumentException.class,()->sinhVienService.delete("ma1"));
    }
    @Test
    void updatetthanhCong(){
        danhsach.add(new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin"));
        sinhVienService.setDanhSach(danhsach);
        SinhVien sv= new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin");

        String e ="sua thanh cong";
        String a = sinhVienService.upadate("ma1",sv);
        assertEquals(e,a);
    }
    @Test
    void UppCheckSinhVien(){
        SinhVien sv= new SinhVien("ma1","manh",18,9.0f,4,"cong nghe thong tin");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.upadate(null,sv));
    }
    @Test
    void UpdateCheckTrong(){
        SinhVien sv= new SinhVien("","manh",18,9.0f,4,"cong nghe thong tin");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.upadate("",sv));
    }
    @Test
    void updadteCheckSo(){
        SinhVien sv= new SinhVien("ma1","manh",-18,-9.0f,-4,"cong nghe thong tin");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.upadate("ma1",sv));
    }
    @Test
    void upadteCheckso1(){
        SinhVien sv= new SinhVien("","",0,0,0,"");
        assertThrows(IllegalArgumentException.class,()->sinhVienService.upadate("ma1",sv));
    }
}