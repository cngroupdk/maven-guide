package dk.cngroup.javacomp.ws;

import dk.cngroup.javacomp.Greeter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("greeting")
public class GreetingResource {

    @GET
    @Produces("text/plain")
    public String greet(){
        return new Greeter().sayHello();
    }

}
