package test;

import preoxy.Actor;
import preoxy.Agent;

/**
 * Created by shijuan on 2019/3/27.
 */
public class StaticProxy {
    public static void main(String[] args) {
        Actor actor = new Actor("I am a famous actor!");
        Agent agent = new Agent(actor,"Hello I am an agent.", "That's all!");
        agent.speak();
    }
}
