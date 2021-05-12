public class tamgiac {
    void tamgiac (double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("3 số đã nhập là 3 cạnh của tam giác");
        } else
            System.out.println("Không phải tam giác");

    }
}
