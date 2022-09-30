package QuadraticEquation.ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào giá trị của a");
        double a = Double.parseDouble(scanner.nextLine());
        if (a==0){
            System.out.println("không thể giải được phương trình khi a =0");
            return;
        }
        System.out.println("nhập vào giá trị của b");
        double b =Double.parseDouble(scanner.nextLine());
        System.out.println("nhập vào giá trị của c");
        double c =Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        System.out.println("delta ="+ quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiệm là :"+quadraticEquation.motNghiem());
        }else if (quadraticEquation.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm");
        }else if (quadraticEquation.getDiscriminant()>0){
            System.out.printf("phương trình có 2 nghiệm phân biệt %f,%f\n",quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        }

    }
}