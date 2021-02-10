package com.rakovets.course.java.core.practice.jcf.set.WebService;

class ClientDemo {
    public static void main(String[] args) {

        Client client = new Client();

        System.out.println("\nClient '" + client.getClientName() + "' joined Service Queue");
        System.out.println("'" + client.getClientName() + "' priority is " + client.getPriority() + "/100");
        System.out.println("'" + client.getClientName() + "' service time: " + client.getServiceTime() + " sec");
    }
}
