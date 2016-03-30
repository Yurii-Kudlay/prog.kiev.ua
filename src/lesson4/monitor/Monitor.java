package lesson4.monitor;

import java.io.File;
import java.util.Arrays;

/**
 * Created by yurge on 19.02.2016.
 */
public class Monitor {

    private String[] files;
    private IntFileEvent event;

    public Monitor(String[] files, IntFileEvent event) {
        this.files = Arrays.copyOf(files, files.length);
        this.event = event;
    }

    public void start() {
        int k = 0;
        File file;

        while (true) {
            for (int idx = 0; idx < files.length; idx++) {
                if (files != null) {
                    file = new File(files[idx]);
                    if (file.exists() && file.isFile()) {
                        event.onFileAdded(files[idx]);
                        k++;
                    }
                }
            }
            if (k == files.length) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            System.out.println("Waiting....");
        }
    }
}
