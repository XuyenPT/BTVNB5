public class ngaythang {
    void thang (int thang){
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7|| thang == 8|| thang == 10|| thang == 12){
            System.out.println("Có 31 ngày");
        }
        else if (thang == 2){
            System.out.println("Có 28 hoặc 29 ngày");
        }
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11){
            System.out.println("Có 30 ngày");
        }
        else {
            System.out.println("Không tồn tại");
        }
    }
    void switchcase (int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Tháng " +month + " có 31 ngày");
            break;
            case 2: System.out.println("Tháng " +month + " có 28 hoặc 29 ngày");
            break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Tháng " +month + " có 30 ngày");
            break;
            default: System.out.println("Không tồn tại");
            break;
        }
    }
}
