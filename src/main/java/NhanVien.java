/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phongtt
 */
public class NhanVien{ //implements Comparable {
    public LoaiNhanVien loaiNhanVien;
    public String hoTen;
    
    public void ChamCong(){
        System.out.println("Cham cong");
    }

    @Override
    public String toString() {
        return "NhanVien{hoTen=" + hoTen + '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        NhanVien doiTuongSoSanh = (NhanVien) o;
//
//        // So sanh Tên trước
//        String ten1 = layTen(); // Lấy tên của đổi tượng 1
//        String ten2 = doiTuongSoSanh.layTen(); // Lấy tên đối tượng 2
//        int ketQua = ten1.compareTo(ten2);
//
//        if (ketQua == 1) { //Tên 1 lớn hơn tên 2
//            return 1; // Trả kết quả họ tên của 1 lớn hơn họ tên 2
//        } else if (ketQua == -1) { //Tên 1 nhỏ hơn tên 2
//            return -1; // Trả kết quả họ tên của 1 nhỏ hơn họ tên 2
//        } else { // Bằng nhau thì so sánh tiếp phần Họ
//            String ho1 = layHo();
//            String ho2 = doiTuongSoSanh.layHo();
//
//            int ketQuaSoSanhHo = ho1.compareTo(ho2);
//            switch(ketQuaSoSanhHo) {
//                case 1: return 1; // Họ 1 lớn hơn họ 2
//                case -1: return -1; // Họ 1 nhỏ hơn họ 2
//                default: return 0; // Họ 1 bằng họ 2
//            }
//        }
//    }
//
//    // Hàm lấy họ trong Họ Tên
//    public String layHo() {
//        int viTriDauTien = 0;
//        return tachHoTen()[viTriDauTien];
//    }
//
//    // Hàm lấy tên trong Họ Tên
//    public String layTen() {
//        String[] hoTens = tachHoTen();
//        int viTriCuoiCung = hoTens.length - 1;
//        return hoTens[viTriCuoiCung];
//    }
//
//    private String[] tachHoTen() {
//        return hoTen.split(" ");
//    }
}

enum LoaiNhanVien {
    HanhChinh,
    TiepThi,
    TruongPhong
}
