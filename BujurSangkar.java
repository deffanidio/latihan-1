package Latihan1;

public class BujurSangkar extends BidangDuaDimensi {
    public double sisi;

    public BujurSangkar(String nama, double sisi){
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas(){
        return sisi*sisi;
    }
}
