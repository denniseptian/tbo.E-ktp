package ktp;

public class MainPenduduk {
	public static void main(String[] args) {
		InputDataPenduduk input = new InputDataPenduduk();
        input.insertData("07560242", "Mudafiq Riyan Pratama", "Jember","07560242", "Mudafiq Riyan Pratama", "Jember","07560242", "Mudafiq Riyan Pratama", "Jember","07560242", "Mudafiq Riyan Pratama", "Jember","07560242"); //menginputkan data dalam index 0
        input.insertData("07560243", "Andre Chrissandhy", "Sidoarjo","07560242", "Mudafiq Riyan Pratama", "Jember","07560242", "Mudafiq Riyan Pratama", "Jember","07560242", "Mudafiq Riyan Pratama", "Jember","07560242"); //menginputkan data dalam index 1
        //setelah input data, berarti data telah masuk dalam ArrayList
 
        System.out.println("Data Mahasiswa dalam ArrayList:");
        System.out.println("-----------------------------");
        for (penduduk pdd : input.getALL()) { //input.getALL() berisi list data objek mahasiswa
            System.out.println("NIK: " + pdd.getNIK()); 
            System.out.println("Nama: " + pdd.getNama());
            System.out.println("Tempat Lahir: " + pdd.getTptLahir());
            System.out.println("Tanggal Lahir: " + pdd.getTglLahir()); 
            System.out.println("Jeni Kelamin: " + pdd.getJnsKelamin());
            System.out.println("Alamat: " + pdd.getAlamat());
            System.out.println("RT/RW: " + pdd.getRt()); 
            System.out.println("Desa/kel: " + pdd.getDesa());
            System.out.println("Kecamatan: " + pdd.getKecamatan());
            System.out.println("Agama: " + pdd.getAgama()); 
            System.out.println("Status: " + pdd.getStatus());
            System.out.println("Pekerjaan: " + pdd.getPekerjaan());
            System.out.println("Kewarganegaraan: " + pdd.getKwarganegaraan());
            System.out.println("-----------------------------");
        }
    }

}
