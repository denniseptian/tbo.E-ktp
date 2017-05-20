package ktp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import datas.penduduk;
import system.InputDataPenduduk;

public class MainPenduduk {
	public static void main(String[] args) {
		InputDataPenduduk input = new InputDataPenduduk();

		HashMap masyarakat = new HashMap();

		masyarakat.put("Mudafiq Riyan Pratama",
				new penduduk("7560242", "Rudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama", "Jember",
						"07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama", "Jember",
						"07560242"));
		masyarakat.put("Mudafiq Riyan Pratama",
				new penduduk("7530242", "Mudafiq Riyan Pratama one", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242"));
		masyarakat.put("Mudafiq Riyan Pratama",
				new penduduk("7550242", "Gudafiq Riyan Pratama two", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242"));
		masyarakat.put("Mudafiq Riyan Pratama",
				new penduduk("7570242", "Mudddfiq Riyan Pratama thre", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242"));
		masyarakat.put("Mudafiq Riyan Pratama",
				new penduduk("180242", "Sudafiq Riyan Pratama four", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama",
						"Jember", "07560242"));

		HashMap lang = new HashMap();
		lang.put(0, "Java");
		lang.put(1, "Groovy");
		lang.put(2, "Ruby");
		lang.put(3, "Python");
		lang.put(4, "C#");
		lang.put(5, "C++");
		lang.put(6, "Perl");

		List keys = new ArrayList(masyarakat.keySet());

		// Sort keys by values.
		final HashMap langForComp = masyarakat;
		Collections.sort(keys, new Comparator() {
			public int compare(Object left, Object right) {
				Integer leftKey = (Integer) left;
				Integer rightKey = (Integer) right;

				String leftValue = (String) langForComp.get(leftKey);
				String rightValue = (String) langForComp.get(rightKey);
				return leftValue.compareTo(rightValue);
			}
		});

		// List the key value
		for (Iterator i = keys.iterator(); i.hasNext();) {
			Object k = i.next();
			System.out.println(k + " " + ((penduduk) masyarakat.get(k)).getNama());
		}

		input.insertData("07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama", "Jember",
				"07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama", "Jember",
				"07560242"); // menginputkan data dalam index 0
		input.insertData("07560243", "Andre Chrissandhy", "Sidoarjo", "07560242", "Mudafiq Riyan Pratama", "Jember",
				"07560242", "Mudafiq Riyan Pratama", "Jember", "07560242", "Mudafiq Riyan Pratama", "Jember",
				"07560242"); // menginputkan data dalam index 1
		// setelah input data, berarti data telah masuk dalam ArrayList

//		System.out.println("Data Mahasiswa dalam ArrayList:");
//		System.out.println("-----------------------------");
//		for (penduduk pdd : input.getALL()) { // input.getALL() berisi list data
//												// objek mahasiswa
//			System.out.println("NIK: " + pdd.getNIK());
//			System.out.println("Nama: " + pdd.getNama());
//			System.out.println("Tempat Lahir: " + pdd.getTptLahir());
//			System.out.println("Tanggal Lahir: " + pdd.getTglLahir());
//			System.out.println("Jeni Kelamin: " + pdd.getJnsKelamin());
//			System.out.println("Alamat: " + pdd.getAlamat());
//			System.out.println("RT/RW: " + pdd.getRt());
//			System.out.println("Desa/kel: " + pdd.getDesa());
//			System.out.println("Kecamatan: " + pdd.getKecamatan());
//			System.out.println("Agama: " + pdd.getAgama());
//			System.out.println("Status: " + pdd.getStatus());
//			System.out.println("Pekerjaan: " + pdd.getPekerjaan());
//			System.out.println("Kewarganegaraan: " + pdd.getKwarganegaraan());
//			System.out.println("-----------------------------");
//		}
	}

}
