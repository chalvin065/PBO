package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");
		
		Dosen chalvin = new Dosen();
		
		chalvin.setNidn("1212");
		chalvin.setNama("Chalvin");
		chalvin.setAlamat("Panji");
		chalvin.setTanggalLahir("21 Mei 1988");
		chalvin.setJenisKelamin(false);
		chalvin.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		
		
		System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());
		
		
		System.out.println (chalvin.getNidn());
		System.out.println (chalvin.getNama());
		System.out.println (chalvin.getAlamat());
		System.out.println (chalvin.getTanggalLahir());
		System.out.println (chalvin.getJenisKelamin());
		System.out.println (chalvin.getMatakuliah());
		
		
		/*ani.nim 	="12345";
		ani.nama	= "Ani";
		ani.alamat	="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
	}
}