package com.example.kiemthu.bai1;

public class bai1 {
    public int mangSoNguyen(int []arr){
        int sum = 0;
        if(arr==null || arr.length==0){
        throw new IllegalArgumentException("khong hop le");
        }
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
}
