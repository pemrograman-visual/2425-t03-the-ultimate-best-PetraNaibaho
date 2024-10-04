// 12S24028- Rotua Immanuela Tampubolon
// 12S24002- Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, ket, best;
        int tahun, stok;
        double harga, margin, rate, jenisDiskon;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahun = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            format = input.nextLine();
            harga = Double.parseDouble(input.nextLine());
            margin = Double.parseDouble(input.nextLine());
            jenisDiskon = margin * -1 / harga;
            if (jenisDiskon > (double) 40 / 100) {
                ket = "Once in a lifetime";
            } else {
                if ((double) 20 / 100 < jenisDiskon && jenisDiskon < (double) 40 / 100) {
                    ket = "Never come twice";
                } else {
                    if (jenisDiskon <= (double) 20 / 100 && jenisDiskon > 0) {
                        ket = "No regret";
                    } else {
                        ket = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rate = Double.parseDouble(input.nextLine());
            if (rate >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rate >= 4.5 && rate < 4.7) {
                    kategori = "Must Read";
                } else {
                    if (rate >= 4.0 && rate < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rate >= 3.0 && rate < 4.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (kategori.equals("Best Pick") && ket.equals("Once in a lifetime")) {
                best = "The ultimate best";
            } else {
                best = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + toxifed(rate, 1) + "|" + kategori + "|" + ket + "|" + best);
            iSBN = input.nextLine();
        }
    }
}
