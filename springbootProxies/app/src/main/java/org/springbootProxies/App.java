/*
 * This source file was generated by the Gradle 'init' task
 */
package org.springbootProxies;

import java.lang.reflect.Proxy;

import org.springbootProxies.classes.Man;
import org.springbootProxies.classes.Person;
import org.springbootProxies.classes.PersonInvocationHandler;

public class App {
    public static void main(String[] args) throws Exception {
        Man Prabhjot = new Man("Prabhjot", 23, "Bangalore", "India"); 
        ClassLoader PrabhjotClassLoader = Prabhjot.getClass().getClassLoader();
        Class[] interfaces = Prabhjot.getClass().getInterfaces();

        Person PrabhjotProxy = (Person)Proxy.newProxyInstance(PrabhjotClassLoader, interfaces, new PersonInvocationHandler(Prabhjot));
        PrabhjotProxy.introduce(Prabhjot.getName());
    }
}
