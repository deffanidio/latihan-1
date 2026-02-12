package Latihan1;

public class App {
    public static void main (String[] args){
        BidangDuaDimensi lr = new lingkaran("lingkaran", 6);
        BidangDuaDimensi bs = new BujurSangkar ( " Bujur Sangkar ", 10 );

    lr.info();
    System.out.println("luas: "+lr.luas());
    bs.info();
    System.out.println("luas: "+bs.luas());
    }
}
