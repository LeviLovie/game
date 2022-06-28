public class Game extends Canvas implements Runnable {
    private static final long serialVertionUID = 1l;

    public void start() {
        boolean running = true;
        new Thread(this).start();
    }

    @Override
    public void run() {
        long lastTime = System.currentTimeMillis();
        long delta;

        init();

        boolean running;
        while (running) {
            delta = System.currentTimeMillis() - lastTime;
            lastTime = System.currentTimeMillis();
            update();
            render();
        }
    }

    public void init() {

    }

    public void render() {
        
    }

    public void update() {
        
    }
    
    public static void main(String[] args) {
    }
}