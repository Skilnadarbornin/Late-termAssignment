package is.ru.tictactoe;

<<<<<<< HEAD
import javax.print.DocFlavor;
=======
>>>>>>> 1fb72ff2530d33877cbb8b9187948f2cbf9d89ff
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class GameWeb implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
<<<<<<< HEAD
        SparkApplication GameWeb = new GameWeb();
=======
        SparkApplication gameweb = new GameWeb();
>>>>>>> 1fb72ff2530d33877cbb8b9187948f2cbf9d89ff
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
<<<<<<< HEAD
        GameWeb.init(); 
    }

    public void init(){
        final Game TheGame = new Game();
	final player1 player1 = new player1("Viggi");
	final player2 player2 = new player2("Einar");
	//int counter = 0;        

        post(new Route("/Move"){
            @Override
            public Object handle(Request request, Response response){
                Integer x = Integer.valueOf(request.queryParams("column"));
                Integer y = Integer.valueOf(request.queryParams("row"));
		
		StringBuilder table = new StringBuilder();
                    table.append("<table class=\"table board table-bordered\" >\n" +
                            "                <tbody>\n" +
                            "                <tr>\n" +
                            "                    <td id=\"00\" class=\"cell\">"+ TheGame.tic[0][0] +"</td>\n" +
                            "                    <td id=\"01\"class=\"cell\">"+ TheGame.tic[0][1] +"</td>\n" +
                            "                    <td id=\"02\"class=\"cell\">"+ TheGame.tic[0][2] +"</td>\n" +
                            "                </tr>\n" +
                            "                <tr>\n" +
                            "                    <td id=\"10\"class=\"cell\">"+ TheGame.tic[1][0] +"</td>\n" +
                            "                    <td id=\"11\"class=\"cell\">"+ TheGame.tic[1][1] +"</td>\n" +
                            "                    <td id=\"12\"class=\"cell\">"+ TheGame.tic[1][2] +"</td>\n" +
                            "                </tr>\n" +
                            "                <tr>\n" +
                            "                    <td id=\"20\"class=\"cell\">"+ TheGame.tic[2][0] +"</td>\n" +
                            "                    <td id=\"21\"class=\"cell\">"+ TheGame.tic[2][1] +"</td>\n" +
                            "                    <td id=\"22\"class=\"cell\">"+ TheGame.tic[2][2] +"</td>\n" +
                            "                </tr>\n" +
                            "                </tbody>\n" +
                            "            </table>");

		if(TheGame.counter % 2 == 0)
		{
			TheGame.PlayerMove(player1.name, player1.move);
			TheGame.counter += 1;
			if(TheGame.Winner(player1.move))
			{
				table.append(" <div\" class=\"alert alert-info\">" +  player1.name + " vann! " + "</div>");
                        	return table.toString();
			}
		}
		else
		{
			TheGame.PlayerMove(player2.name, player2.move);
			TheGame.counter += 1;
			if(TheGame.Winner(player2.move))
			{
				table.append(" <div\" class=\"alert alert-info\">" +  player2.name + " vann! " + "</div>");
                                return table.toString();
			}
		}
		
		response.status(404);
                return response;
	    }	
        });
=======
        gameweb.init(); 
    }

    public void init(){
        
>>>>>>> 1fb72ff2530d33877cbb8b9187948f2cbf9d89ff
    }
}
