public class Karyawan {

    protected int nip;
    protected String nama;
    protected String alamat;
    protected String tanggalLahir;
    protected int tahunMasuk;
    protected int gaji;
    protected int sks;
    protected int jam;
    protected String jenisKelamin;

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getJam() {
        return this.jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }


    //method set gaji
    public int gajiPokok() {
        setGajiP(2000000);
        return gaji;

    }

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getTahunMasuk() {
        return this.tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getGajiP() {
        return this.gaji;
    }

    public void setGajiP(int gaji) {
        this.gaji = gaji;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }



}