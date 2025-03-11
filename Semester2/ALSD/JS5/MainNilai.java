class MainNilai{
    public static void main(String[] args) {
        Nilai value = new Nilai(8);

        value.nama = new String[][]{
            {"Ahmad", "220101001", "2022"},
            {"Budi", "220101002", "2022"},
            {"Cindy", "220101003", "2021"},
            {"Dian", "220101004", "2021"},
            {"Eko", "220101005", "2023"},
            {"Fajar", "220101006", "2020"},
            {"Gina", "220101007", "2023"},
            {"Hadi", "220101008", "2020"}
        };

        value.nilaiUTS = new int []{
            78,
            85,
            90,
            76,
            92,
            88,
            80,
            82,
        };

        value.nilaiUAS = new int []{
            82,
            88,
            87,
            79,
            95,
            85,
            83,
            84,
        };

        int tertinggiUTS = value.nilaiUTSTertinggiDC(value.nilaiUTS, 0, 8-1);
        int itertinggiUTS = value.cariNilai(value.nilaiUTS, tertinggiUTS);
        int terrendahUTS = value.nilaiUTSTerendahDC(value.nilaiUTS, 0, 8-1);
        int iterrendahUTS = value.cariNilai(value.nilaiUTS, terrendahUTS);
        double rata2UAS = value.rataRataUASBF(value.nilaiUAS);

        System.out.printf("Nilai UTS tertinggi adalah %s, NIM: %s dengan nilai: %d %n", value.nama[itertinggiUTS][0], value.nama[itertinggiUTS][1], tertinggiUTS);
        System.out.printf("Nilai UTS terendah adalah %s, NIM: %s dengan nilai: %d %n", value.nama[iterrendahUTS][0], value.nama[itertinggiUTS][1], terrendahUTS);
        System.out.printf("Nilai rata-rata UAS adalah: %2f", rata2UAS);
    }
}
