
public class Warga {
    private String nama;
    private int nik;
    protected String jenis_kelamin;

    public Warga (String nama, int nik, String jenis_kelamin){
        this.nama = nama;
        this.nik = nik;
        this.jenis_kelamin = jenis_kelamin;        
    }

    public void SetNama(String nama){
        this.nama = nama;
    }

    public void SetNik(int nik){
        this.nik = nik;
    }

    public void SetJenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }

    public String GetNama(){
        return this.nama;
    }

    public int Getnik(){
        return this.nik;
    }

    public String GetJenis_kelamin(){
        return this.jenis_kelamin;
    }

    public String toString(){
        return
        "Nama :" + nama+
        "\nNik :" + nik+
        "\nJenis_kelamin :" + jenis_kelamin;
    }
}
