package modul_4_thread;

public class tugas {
    public static void main(String[] args) {
        Rafly roti = new Rafly("Roti");
        roti.start();
    }
}
class Rafly extends Thread{
    public Rafly (String id){
        super(id);
    }
    @Override
    public void run(){
        String rafly = getName();
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Error");
            }
            System.out.println("Thread "+ rafly + ": Posisi" +i);
        }
    }
}
