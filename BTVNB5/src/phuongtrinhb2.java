public class phuongtrinhb2 {
    void giaiphuongtrinh (double a, double b, double c){
        double delta = b*b - 4*a*c;
        double nghiemkep = (-b)/(2*a);
        double nghiem1 = (-b + Math.sqrt(delta))/2*a;
        double nghiem2= (-b - Math.sqrt(delta))/2*a;
        if (delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta == 0){
            System.out.println("Phương trình có nghiệm kép:" + nghiemkep);
        }
        else{
            System.out.println("Phương trình có 2 nghiệm lần lượt là " +nghiem1 + " và " +nghiem2);
        }
    }
}
