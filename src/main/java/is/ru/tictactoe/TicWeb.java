package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*
import spark.servlet.SparkApplication;

public class TicWebb implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
        SparkApplication ticweb = new TickWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
       // chuckweb.init();
    }
}
