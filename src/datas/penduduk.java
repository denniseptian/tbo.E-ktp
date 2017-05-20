package datas;

public class penduduk {
	
	private String nama;
	private String jnsKelamin;
	private String tmptLahir;
	private String tglLahir;
	private String rtRw;
	private String kelDesa;
	private String agama;
	private String sttsNikah;
	private String pekerjaan;
	private String kewarganagaraan;
	
	public penduduk(String nama, String jnsKelamin, String tmptLahir, String tglLahir, String rtRw, String kelDesa,
			String agama, String sttsNikah, String pekerjaan, String kewarganagaraan) {
		this.nama = nama;
		this.jnsKelamin = jnsKelamin;
		this.tmptLahir = tmptLahir;
		this.tglLahir = tglLahir;
		this.rtRw = rtRw;
		this.kelDesa = kelDesa;
		this.agama = agama;
		this.sttsNikah = sttsNikah;
		this.pekerjaan = pekerjaan;
		this.kewarganagaraan = kewarganagaraan;
	}
	
	public penduduk(){
		
	}

	public String getNama() {
		return nama;
	}

	public String getJnsKelamin() {
		return jnsKelamin;
	}

	public String getTmptLahir() {
		return tmptLahir;
	}

	public String getTglLahir() {
		return tglLahir;
	}

	public String getRtRw() {
		return rtRw;
	}

	public String getKelDesa() {
		return kelDesa;
	}

	public String getAgama() {
		return agama;
	}

	public String getSttsNikah() {
		return sttsNikah;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public String getKewarganagaraan() {
		return kewarganagaraan;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setJnsKelamin(String jnsKelamin) {
		this.jnsKelamin = jnsKelamin;
	}

	public void setTmptLahir(String tmptLahir) {
		this.tmptLahir = tmptLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public void setRtRw(String rtRw) {
		this.rtRw = rtRw;
	}

	public void setKelDesa(String kelDesa) {
		this.kelDesa = kelDesa;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public void setSttsNikah(String sttsNikah) {
		this.sttsNikah = sttsNikah;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public void setKewarganagaraan(String kewarganagaraan) {
		this.kewarganagaraan = kewarganagaraan;
	}
	
	
}
