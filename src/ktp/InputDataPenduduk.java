package ktp;

import java.util.ArrayList;

import datas.penduduk;

public class InputDataPenduduk {
	ArrayList<penduduk> listpenduduk; //variabel listmahasiswa bertipe ArrayList

    public InputDataPenduduk() { //constructor
    	listpenduduk = new ArrayList (); //instansiasi dari variabel listmahasiswa
    }

    public void insertData(String NIK, String Nama, String TptLahir, String TglLahir, String JnsKelamin, String Alamat,
    		String Rt, String Desa, String Kecamatan, String Agama, String Status, String Pekerjaan, String Kwarganegaraan) { //method untuk memasukkan data NIM, Nama, dan Alamat ke dalam ArrayList
    	penduduk pdd = new penduduk(NIK, Nama, TptLahir, TglLahir, JnsKelamin, Alamat, Rt, Desa, Kecamatan, Agama, Status, Pekerjaan, Kwarganegaraan); //objek mhs yang bertipe mahasiswa
    	listpenduduk.add(pdd); //menambahkan data objek mhs ke dalam ArrayList listmahasiswa
    }

    public ArrayList<penduduk> getALL() { //method untuk mengambil data yang disimpan dalam ArrayList listmahasiswa
        return listpenduduk; //mengembalikan nilai dari variabel listmahasiswa
    }

    public void deleteData(int index) { //method untuk menghapus data di ArrayList berdasarkan index Arraynya
    	listpenduduk.remove(index);
    }

}
