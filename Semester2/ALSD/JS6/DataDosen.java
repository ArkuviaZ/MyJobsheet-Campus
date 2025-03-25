public class DataDosen {
    public Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------");
        }
    }

    public void SortingASC() {
        for (int i=0; i<idx-1; i++) {
            for (int j=0; j<idx-i-1; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i=0; i<idx-1; i++) {
            int maxIdx = i;
            for (int j=i+1; j<idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIdx];
            dataDosen[maxIdx] = temp;
        }
    }

    public void insertionSort() {
        for (int i=1; i<idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i-1;
            while (j>=0 && dataDosen[j].usia<temp.usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j+1] = temp;
        }
    }

    public int sequentialSearching(double cari) {
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].usia == cari) {
                return j;
            }
        }
        return -1;
    }

    public int perantaraBS (int x){
        return findBinarySearch(x, 0, idx - 1);
    }

    public int findBinarySearch(double cari, int left, int right){
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataDosen[mid].usia == cari) {
                return mid;
            }
            if (dataDosen[mid].usia < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    void tampilDataSearch(int x, int pos) {
        if (pos != -1) {
            System.out.printf("%nDosen yang memiliki umur %d adalah %s %n%n", x, dataDosen[pos].nama);
        } else {
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }
}
