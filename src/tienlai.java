import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interset_rate=1.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap tien:");
        money=scanner.nextDouble();
        System.out.println("nhap thang:");
        month=scanner.nextInt();
        System.out.println("tien lai:");
        interset_rate=scanner.nextDouble();
        double total_interset=0;
        for (int i=0;i<month;i++){
            total_interset+=money*(interset_rate/100)/12*month;
        }
        System.out.println("lai xuat la"+total_interset);

    }
}
