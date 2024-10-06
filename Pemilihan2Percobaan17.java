import java.util.Scanner;
class Pemilihan2Percobaan17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan tahun : ");
        tahun = scan.nextInt();

        if((tahun % 4) == 0){
            if((tahun % 100) == 0){
                System.out.println("Ini tahun kabisat");
            }
            else{
                System.out.println("Bukan tahun kabisat");
            }
        }else{
            System.out.println("Bukan tahun kabisat");
        }
    }
}