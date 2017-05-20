package datas;

public class penduduk {
	private String NIK;
    private String Nama;
    private String TptLahir;
    private String TglLahir;
    private String JnsKelamin;
    private String Alamat;
    private String Rt;
    private String Desa;
    private String Kecamatan;
    private String Agama;
    private String Status;
    private String Pekerjaan;
    private String Kwarganegaraan;
    
    public penduduk(String NIK, String Nama, String TptLahir, String TglLahir, String JnsKelamin, String Alamat,
    		String Rt, String Desa, String Kecamatan, String Agama, String Status, String Pekerjaan, String Kwarganegaraan) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.TptLahir = TptLahir;
        this.TglLahir = TglLahir;
        this.JnsKelamin = JnsKelamin;
        this.Alamat = Alamat;
        this.Rt = Rt;
        this.Desa = Desa;
        this.Kecamatan = Kecamatan;
        this.Agama = Agama;
        this.Status = Status;
        this.Pekerjaan = Pekerjaan;
        this.Kwarganegaraan = Kwarganegaraan;
    }
    
	public String getNIK() {
		return NIK;
	}
	public void setNIK(String NIK) {
		NIK = NIK;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public String getTptLahir() {
		return TptLahir;
	}
	public void setTptLahir(String tptLahir) {
		TptLahir = tptLahir;
	}
	public String getTglLahir() {
		return TglLahir;
	}
	public void setTglLahir(String tglLahir) {
		TglLahir = tglLahir;
	}
	public String getJnsKelamin() {
		return JnsKelamin;
	}
	public void setJnsKelamin(String jnsKelamin) {
		JnsKelamin = jnsKelamin;
	}
	public String getAlamat() {
		return Alamat;
	}
	public void setAlamat(String alamat) {
		Alamat = alamat;
	}
	public String getRt() {
		return Rt;
	}
	public void setRt(String rt) {
		Rt = rt;
	}
	public String getDesa() {
		return Desa;
	}
	public void setDesa(String desa) {
		Desa = desa;
	}
	public String getKecamatan() {
		return Kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		Kecamatan = kecamatan;
	}
	public String getAgama() {
		return Agama;
	}
	public void setAgama(String agama) {
		Agama = agama;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPekerjaan() {
		return Pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		Pekerjaan = pekerjaan;
	}
	public String getKwarganegaraan() {
		return Kwarganegaraan;
	}
	public void setKwarganegaraan(String kwarganegaraan) {
		Kwarganegaraan = kwarganegaraan;
	}

}
