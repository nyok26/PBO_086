package com.mycompany.pbo_w5;

public  class Dosen extends Person {
    private String kdDosen;
    

    // Constructor Dosen
    public Dosen(String nama, String kdDosen) {
        super(nama);
        this.kdDosen = kdDosen;
    }

    // Getter dan Setter
    public String getkdDosen() { return kdDosen; }
    public void setkdDosen(String kdDosen) { this.kdDosen = kdDosen; }
   

    // Method tambahan untuk menampilkan info dosen
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kode Dosen: " + kdDosen);
    }
}
