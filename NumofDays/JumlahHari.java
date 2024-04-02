package NumofDays;

public class JumlahHari {

    public static int hitungJumlahHari(int bulan, int tahun) {
        int jumlahHari;

        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                if (kabisat(tahun)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                jumlahHari = -1;
        }

        return jumlahHari;
    }

    public static boolean kabisat(int tahun) {
        return (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0));
    }
}