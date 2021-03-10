public class IdThread extends Thread {

    @Override
    public void run() {
        System.out.println(getId());
    }
}
