package controllers;

import com.google.inject.Singleton;

import ninja.Result;
import ninja.Results;

@Singleton
public class InfoSendController {

	
    public Result helloWorldJson() {
        
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.content = "Hello World! Hello Json!";
        
        return Results.json().render(simplePojo);
    }
    
    public static class SimplePojo {

        public String content;
        
    }
}
