package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class GameWeb implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
        SparkApplication gameweb = new GameWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        gameweb.init(); 
    }

    public void init(){
        
    }
}
