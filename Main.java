package soal2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager, Developer, dan Designer
        Manager manager = new Manager("Abi");
        Developer developer = new Developer("Umi");
        Designer designer = new Designer("Kaka");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }
}
