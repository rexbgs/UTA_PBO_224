import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        System.out.println("Bismillah Jalan");
        System.out.println("--BagasDwiK/2100018224/D/UTS--");
        System.out.println("\n");

        //objek baru
        Tendik staf = new Tendik();
        Dosen isDosen = new Dosen();

        //testinput statis
        staf.setNama("nana");
        staf.setNip(1201);
        staf.setTanggalLahir("05-03-1999");
        staf.setAlamat("landofdown");
        staf.setJenisKelamin("woman");
        staf.setTahunMasuk(2018);

        isDosen.setJurusan("Informatika");
        isDosen.setNidn(220101);
        isDosen.setNama("Bamlond jung S.T");
        isDosen.setNip(2201);
        isDosen.setTanggalLahir("05-03-1976");
        isDosen.setJenisKelamin("Laki-Laki");
        isDosen.setAlamat("Wonosari GK");
        isDosen.setTahunMasuk(2015);

        //input dinamis
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);


        //tendik input
        System.out.println("--- Input Bagian Tendik ---");
        System.out.println("Masukkan Nama Tendik :");
        String nama1 = inputString.nextLine();
        System.out.println("Masukkan NIP Tendik :");
        int nip1 = inputInt.nextInt();
        System.out.println("Masukkan Tanggal Lahir : ");
        String Tgl_Lahir1 = inputString.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        String jenis_kelamin1 = inputString.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat1 = inputString.nextLine();
        System.out.println("Masukkan Tahun Masuk : ");
        int Tahun_Masuk1 = inputInt.nextInt();
        System.out.println("\n");

        //set dinamis
        staf.setNama(nama1);
        staf.setNip(nip1);
        staf.setTanggalLahir(Tgl_Lahir1);
        staf.setJenisKelamin(jenis_kelamin1);
        staf.setAlamat(alamat1);
        staf.setTahunMasuk(Tahun_Masuk1);

        //input Dosen
        System.out.println("--- Input Bagian Dosen ---");
        System.out.println("Masukkan Nama Dosen :");
        String nama2 = inputString.nextLine();
        System.out.println("Masukkan NIDN Dosen :");
        int nidn2 = inputInt.nextInt();
        System.out.println("Masukkan Jurusan :");
        String Jurusan2 = inputString.nextLine();
        System.out.println("Masukkan NIP Dosen :");
        int nip2 = inputInt.nextInt();
        System.out.println("Masukkan Tanggal Lahir : ");
        String Tgl_Lahir2 = inputString.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        String jenis_kelamin2 = inputString.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat2 = inputString.nextLine();
        System.out.println("Masukkan Tahun Masuk : ");
        int Tahun_Masuk2 = inputInt.nextInt();
        System.out.println("\n");
       

        // set dinamis
        isDosen.setNama(nama2);
        isDosen.setNidn(nidn2);
        isDosen.setJurusan(Jurusan2);
        isDosen.setNip(nip2);
        isDosen.setTanggalLahir(Tgl_Lahir2);
        isDosen.setJenisKelamin(jenis_kelamin2);
        isDosen.setAlamat(alamat2);
        isDosen.setTahunMasuk(Tahun_Masuk2);


        //output tendik
        System.out.println("Nama Tendik         : " + staf.getNama());
        System.out.println("NIP  Tendik         : " + staf.getNip());
        System.out.println("Tanggal Lahir       : " + staf.getTanggalLahir());
        System.out.println("Jenis Kelamin       : " + staf.getJenisKelamin());
        System.out.println("Alamat              : " + staf.getAlamat());
        System.out.println("Tahun masuk         : " + staf.getTahunMasuk());
        System.out.println("Gaji pokok          : " + staf.gajiTotal());
        //statis
        System.out.println("Upah lembur(20 jam) : " + staf.lembur(20));
        System.out.println("Gaji total          : " + staf.gajiTotal(20));

        //output dosen
        System.out.println("\n");
        System.out.println("Nama Dosen          : " + isDosen.getNama());
        System.out.println("NIDN                : " + isDosen.getNidn());
        System.out.println("Jurusan             : " + isDosen.getJurusan());
        System.out.println("NIP  Dosen          : " + isDosen.getNip());
        System.out.println("Tanggal Lahir       : " + isDosen.getTanggalLahir());
        System.out.println("Jenis Kelamin       : " + isDosen.getJenisKelamin());
        System.out.println("Alamat              : " + isDosen.getAlamat());
        System.out.println("Tahun masuk         : " + isDosen.getTahunMasuk());
        System.out.println("Gaji pokok          : " + isDosen.gajiTotal());
        // statis
        System.out.println("Kelas lebih (6 SKS) : " + isDosen.mengajarLebih(6));
        System.out.println("Gaji total          : " + isDosen.gajiTotal(6));

        System.out.println("\n");
        System.out.println("Jalan suksess");
    }
}
