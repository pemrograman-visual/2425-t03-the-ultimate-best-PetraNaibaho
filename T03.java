// 12S24028- Rotua Immanuela Tampubolon
// 12S24002- Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, keterangan, ultimate;
        int tahun, stok;
        double harga, margin, rating, diskon;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahun = input.nextInt();
            penerbit = input.nextLine();
            format = input.nextLine();
            harga = input.nextDouble();
            margin = input.nextDouble();
            diskon = margin * -1 / harga;
            if (diskon > 40 / 100) {
                keterangan = "Once in a lifetime";
            } else {
                if (20 / 100 < diskon && diskon < 40 / 100) {
                    keterangan = "Never come twice";
                } else {
                    if (diskon <= 20 / 100 && diskon > 0) {
                        keterangan = "No regret";
                    } else {
                        keterangan = "---";
                    }
                }
            }
            stok = input.nextInt();
            rating = input.nextDouble();
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0 && rating < 4.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (kategori.equals("Best Pick") && keterangan.equals("Once in a lifetime")) {
                ultimate = "The ultimate best";
            } else {
                ultimate = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + keterangan + "|" + ultimate);
            iSBN = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

