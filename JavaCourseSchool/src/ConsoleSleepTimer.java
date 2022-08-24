import java.util.concurrent.TimeUnit;

public class ConsoleSleepTimer {
    public static void consoletimer() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
