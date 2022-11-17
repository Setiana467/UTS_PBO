package UTS S3;

public class LuaSet {
    private Lingkaran lingkaran;
    
    public LuasSetengah(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void hitung(){
        this.lingkaran.hitungLuas();       
    }
    
    public void tampilkan(){
        this.lingkaran.tampilkanLuas();
    }
}
