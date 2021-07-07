package com.ibnuwm;

import java.util.Date;

import com.ibnuwm.entity.Address;
import com.ibnuwm.entity.Person;

/**
 * DemoTanpaSpring
 */
public class DemoTanpaSpring {

    public static void main(String[] args) {
        Person ibnu = new Person();
        ibnu.setNama("Ibnu WM");
        ibnu.setTanggalLahir(new Date());

        Address kantor = new Address();
        kantor.setKota("Serang");
        kantor.setJalan("Jl. Saleh Baimin");
        kantor.setKodepos("42111");
        ibnu.setAlamat(kantor);

        System.out.println("Nama : " + ibnu.getNama());
        System.out.println("Alamat : " + ibnu.getAlamat().getJalan());
    }
}