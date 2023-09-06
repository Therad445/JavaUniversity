package Lab3.Test;

import java.util.Properties;
import java.io.*;
import java.util.Objects;

public class Preloader {
    /**
     * Preloader contructor
     */
    public Preloader(String FileName, Properties props) throws IOException, Exception {
        getConfigFile(FileName, props);
        Preloader.class.getResource("config.ini");
    }

    /**
     * Method to get props from file
     */
    private static void getConfigFile(String FileName, Properties props) throws Exception {
        InputStream fs;
        try {
            File f = new File(FileName);
            if(f.exists()) {
                fs = new FileInputStream(f);
            } else {
                fs = Preloader.class.getResourceAsStream(FileName);
            }
            props.load(fs);
            Objects.requireNonNull(fs).close();
        } catch (FileNotFoundException e) {
            System.err.println("Error ->"+e);
        } catch (IOException e) {
            System.err.println("Error -> "+e);
        } catch (Exception e) {
            throw new Exception("Error -> "+e);
        }
    }
}
