import java.util.Scanner;

public class BioskopWithScanner19_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris;
        int kolom;
        String nama;
        String next;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if(penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                            } else {
                                System.out.println("Kursi yang dipilih sudah terisi.");
                                System.out.println("Apakah anda ingin memilih kursi lain? (y/n)");
                                next = sc.nextLine();

                                if (next.equalsIgnoreCase("y")) {
                                    continue;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Baris/kolom kursi tidak tersedia.");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("*\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}
    