package org.springbootProxies.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {
    private Person person;

    public PersonInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception{
        System.out.println("Before invoking " + method.getName());
        // Invoke the original method on the actual object
        Object result = method.invoke(person, args);
        
        System.out.println("After invoking " + method.getName());
        
        return result;
    }
}
