package lesson4.monitor;

import java.io.File;
import java.util.Date;

/**
 * Created by yurge on 18.02.2016.
 */
public class FileEvent implements IntFileEvent {
    @Override
    public void onFileAdded(String str) {
        System.out.println("File added: " + str);
        File file = new File(str);
        long l = file.lastModified();
        Date date = new Date(l);
        System.out.println(date.toString());
    }
}
