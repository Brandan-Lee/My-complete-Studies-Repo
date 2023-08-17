package title;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.Application.Parameters;

public class UserTitle extends Application {

    public void start(Stage window) {
        
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        
        window.setTitle(title);
        window.show();
        
    }//end start
    
}//end class
