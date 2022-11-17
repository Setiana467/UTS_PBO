package UTS S3;

public class SetLing implements Lingkaran{
    double hasil;
    public SetLing(){
        hasil = 0;
    }
    
    @Override
    public void hitungLuas() {
        double luas1 = (PANJANG / 2 * LEBAR) - (Math.PI * (PANJANG / 2) * (PANJANG / 2) / 4);
        hasil = 2 * luas1;
    }
    
    @Override
    public void tampilkanLuas() {
        System.out.println("luas nya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    } 
}
