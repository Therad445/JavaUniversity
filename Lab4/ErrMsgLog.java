package Lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


/** class for working with logs and errors*/
public class ErrMsgLog {

    private static ArrayList <Exception> ErrList;
    private static Logger log;

    public ErrMsgLog(String configName) throws IOException {
        ErrList = new ArrayList();
        //Читаем конфигурационный файл лога
        LogManager.getLogManager().readConfiguration(ErrMsgLog.class.getResourceAsStream(configName));
        log = Logger.getLogger(ErrMsgLog.class.getName());
    }

    //Добавляем ошибку в список ошибок
    public void addErr(Exception e) {
        ErrList.add(e);
    }

    //Добавляем ошибку в список ошибок и в лог
    public void addErrWithLog(Exception e) {
        ErrList.add(e);
        log.log(Level.FINE, e.getMessage());
    }

    //Добавляем сообщение в лог
    public void addMsgWithLog(String msg) {
        try {
            log.log(Level.FINE, msg);
        } catch(Exception e){
            addErrWithLog(e);
        }
    }

    //Получаем количество ошибок
    public int getErrCount() {
        return ErrList.size();
    }

    //Выводим информацию об ошибке
    public void showErrText(Exception e) {
        System.err.println(e.getMessage());
    }

    //Генерим (пробрасываем ошибку) с фиксацией в списке ошибок
    public Exception makeErr(Exception e) {
        addErr(e);
        return new Exception(e);
    }
}
