package dk.cngroup.javacomp;

import org.apache.commons.lang.StringUtils;

public class Greeter {

    public String sayHello(){
        return "Hello anonymous!";
    }


    public String sayHello(String name){

        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException();
        }

        return "Hello " + name + "!";
    }



}
