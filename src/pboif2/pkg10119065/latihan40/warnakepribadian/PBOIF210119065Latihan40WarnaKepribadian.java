package pboif2.pkg10119065.latihan40.warnakepribadian;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program penjelasan dari warna kepribadian
                          dengan objek
 */
public class PBOIF210119065Latihan40WarnaKepribadian {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warna warna = new Warna();
        Pengguna pengguna = new Pengguna();
        
         System.out.printf("%sYUK %sCEK %sKEPRIBADIANMU %sDARI "
            + "%sWARNA %sFAVORITMU\n\n",
            Warna.RED, Warna.GREEN, Warna.YELLOW, Warna.CYAN, Warna.MAGENTA,
            Warna.BLUE
        );
        System.out.printf("%s\tMERAH\t\t%n", (Warna.BG_RED + Warna.WHITE));
        System.out.printf("%s\tHIJAU\t\t%n", (Warna.BG_GREEN + Warna.WHITE));
        System.out.printf("%s\tKUNING\t\t%n", (Warna.BG_YELLOW + Warna.WHITE));
        System.out.printf("%s\tBIRU\t\t%n", (Warna.BG_BLUE + Warna.WHITE));
        System.out.printf("%s\tUNGU\t\t%n", (Warna.BG_MAGENTA + Warna.WHITE));
        
        System.out.print(Warna.BLACK+"\nPILIH WARNA FAVORITMU : ");
        pengguna.setWarna(sc.next().toUpperCase());
        System.out.print("NAMA KAMU : ");
        pengguna.setNama(sc.next().toUpperCase());
        
        System.out.println("\n===HASIL TEST KEPRIBADIAN "+ pengguna.getNama() + "===");
        warna.showKepribadian(pengguna.getWarna());
        
        System.out.println("\n(Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
