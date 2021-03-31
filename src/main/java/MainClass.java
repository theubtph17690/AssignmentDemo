
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author phongtt
 */
public class MainClass {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.hoTen = "trần minh sáng";
        nv1.loaiNhanVien = LoaiNhanVien.TruongPhong;

        NhanVien nv2 = new NhanVien();
        nv2.hoTen = "An văn thịnh";
        nv2.loaiNhanVien = LoaiNhanVien.TiepThi;

        NhanVien nv3 = new NhanVien();
        nv3.hoTen = "An văn an";
        nv3.loaiNhanVien = LoaiNhanVien.TiepThi;

        NhanVien nv4 = new NhanVien();
        nv4.hoTen = "An thị dung";
        nv4.loaiNhanVien = LoaiNhanVien.TiepThi;

//        ArrayList list1 = new ArrayList();
//        list1.add(nv1);
//        list1.add(nv2);

        ArrayList<NhanVien> list2 = new ArrayList();
        list2.add(nv1);
        list2.add(nv2);
        list2.add(nv3);
        list2.add(nv4);

        System.out.println("List 2 chưa sắp xếp: ");
      //  In(list2);

        System.out.println("List 2 đã sắp xếp: ");
        list2.sort(new Comparator<NhanVien>() { //dùng anonymus
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                String[] infor1 = o1.hoTen.split( " "); //tách họ tên đối tượng 1
                String[] infor2 = o2.hoTen.split(" "); //tách họ tên đối tượng 2
                int indexTen = infor1[infor1.length - 1].compareTo(infor2[infor2.length - 1]); //giá trị trả về compare tên đối tượng 1 và tên đối tượng 2
                int indexHo = infor1[0].compareTo(infor2[0]);
                if (indexTen > 0) {
                    return 1;
                } else {
                    if (indexTen < 0) {
                        return -1;
                    } else {
                        switch (indexHo) {
                            case 1:
                                return 1; // Họ 1 lớn hơn họ 2
                            case -1:
                                return -1; // Họ 1 nhỏ hơn họ 2
                            default:
                                return 0; // Họ 1 bằng họ 2
                        }
                    }
                }
            }

            ;

        });
        In(list2);

}

    public static void In (ArrayList < NhanVien > danhSachNhanVien) {
        if (danhSachNhanVien.size() == 0) {
            System.out.println("asdasd");
        } else {
            for (NhanVien nhanVien : danhSachNhanVien) {
                System.out.println(nhanVien);
            }
        }
    }
}