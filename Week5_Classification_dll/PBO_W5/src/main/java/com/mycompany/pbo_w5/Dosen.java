package com.mycompany.pbo_w5;

public  class Dosen extends Person {
    private String NIP;
    private String fakultas;
    private String jabatan;

    // Constructor Dosen
    public Dosen(String nama, String NIP, String jabatan) {
        super(nama);
        this.NIP = NIP;
        this.jabatan = jabatan;
    }

    // Getter dan Setter
    public String getNIP() { return NIP; }
    public void setNIP(String NIP) { this.NIP = NIP; }
    public String getFakultas() { return fakultas; }
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }
    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    // Method tambahan untuk menampilkan info dosen
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Jabatan: " + jabatan);
    }
}
