package STOPWHAT;

public class Bai2 {
    public static void main(String[] args) {
        int[] arrInt = new int[10000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*10000; //(int) ép từ kiểu double về kiểu số nguyên, hàm random cho từ 0-1 , 10 nghin phần tử sẽ random()*10k
        }
        //B2 Star dồng hồ để bắt đầu đếm thời gian giả thuật selection sort thực hiện

        //B3 thực hiện giải thuật selection sort để sắp xếp mảng số ngyên 10000 phần tử

        StopWatch stwatch =new StopWatch();
        stwatch.start();
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = 1; j < arrInt.length; j++) {
                if (arrInt[i]>arrInt[j]){
                    int temp =arrInt[i];
                    arrInt[i]=arrInt[j];
                    arrInt[j]=temp;
                }

            }

        }
        //b4 .stop đồng hồ để tính thời gian thực hiện giải thuật
        stwatch.stop();
        //B5 .IN RA THỜI GIAN THỰC HIỆN GIẢI THUẬT
        System.out.println(" thời gian thực hiện giải thuật là : "+stwatch.getElaspedTime());

    }
}
