package Semester2.ALSD.JS3;

public class DataDosen01 {
    public void dataSemuaDosen(Dosen01[] arrayOfDosen){
        for (Dosen01 dosen : arrayOfDosen) {
            System.out.printf("Kode          : %s %n", dosen.kode);
            System.out.printf("Nama          : %s %n", dosen.nama);
            System.out.printf("Jenis Kelamin : %s %n", (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.printf("Usia          : %d %n", dosen.usia);
            System.out.println("------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen){
        int lk=0; int pr=0;
        for (Dosen01 dosen : arrayOfDosen){
            if (dosen.jenisKelamin == true) lk++;
            else pr++;
        }

        System.out.printf("Jumlah dosen Pria   : %d %n", lk);
        System.out.printf("Jumlah dosen Wanita : %d %n", pr);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen){
        int lk = 0; int pr = 0; int lkUsia = 0; int prUsia = 0;
        for (Dosen01 dosen : arrayOfDosen){
            if (dosen.jenisKelamin == true) {
                lk++; lkUsia += dosen.usia;
            }
            else {
                pr++; prUsia += dosen.usia;
            }
        }

        double rataPria = (lk == 0) ? 0 : (double) lkUsia / lk;
        double rataWanita = (pr == 0) ? 0 : (double) prUsia / pr;

        System.out.printf("Rata-rata usia dosen Pria  : %.2f %n", rataPria);
        System.out.printf("Rata-rata usia Wanita      : %.2f %n", rataWanita);
    }

    public void infoDosenPalingTua(Dosen01[] arrayOfDosen){
        Dosen01 tertua = arrayOfDosen[0];
        for (Dosen01 dosen : arrayOfDosen){
            if (dosen.usia > tertua.usia){
                tertua = dosen;
            } 
        }

        System.out.printf("Dosen dengan usia Tertua : %s %n", tertua.nama);
    }

    public void infoDosenPalingMuda(Dosen01[] arrayOfDosen){
        Dosen01 termuda = arrayOfDosen[0];
        for (Dosen01 dosen : arrayOfDosen){
            if (dosen.usia < termuda.usia){
                termuda = dosen;
            } 
        }

        System.out.printf("Dosen dengan usia Termuda : %s %n", termuda.nama);
    }
}
