class Nilai{
    String nama[][];
    int nilaiUTS[], nilaiUAS[];

    Nilai(int n) {
        nama = new String [n][3];
        nilaiUTS = new int [n];
        nilaiUAS = new int [n];
    }

    public int nilaiUTSTertinggiDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int maxLeft = nilaiUTSTertinggiDC(arr, l, mid);
        int maxRight = nilaiUTSTertinggiDC(arr, mid + 1, r);

        return Math.max(maxLeft, maxRight);
    }

    public int nilaiUTSTerendahDC(int nilaiUTS[], int l, int r) {
        if (l == r) {
            return nilaiUTS[l];
        }

        int mid = (l + r) / 2;
        int minL = nilaiUTSTerendahDC(nilaiUTS, l, mid);
        int minR = nilaiUTSTerendahDC(nilaiUTS, mid + 1, r);

        return Math.min(minL, minR);
    }

    public double rataRataUASBF(int nilaiUAS[]) {
        int total = 0;

        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }

        return (double) total/nilaiUAS.length;
    }

    public int cariNilai(int nilai[], int n){
        int i = 0, index =- 1;
        for (int val:nilai){
            if (n==val){
                index = i;
            }
            i++;
        }
        return index;
    }
}