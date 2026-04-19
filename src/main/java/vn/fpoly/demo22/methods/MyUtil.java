package vn.fpoly.demo22.methods;

public class MyUtil {
    public int tinhtongmang(int arr[]){
        if (arr==null||arr.length==0){
            throw new IllegalArgumentException("mang khong hop le");
        }
        int tong = 0;
        for (int x:arr){
            if (x<1||x>1000){
                throw new IllegalArgumentException("phan tu phai lon hon 1 va be hon 1000");
            }
            tong += x+1;
        }
        return tong;
    }
}
