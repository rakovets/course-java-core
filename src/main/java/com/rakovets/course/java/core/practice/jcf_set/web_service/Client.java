package com.rakovets.course.java.core.practice.jcf_set.web_service;

import com.rakovets.course.java.core.practice.jcf_set.web_service.operations.Operation;

public class Client {
    private Server server;
    private Operation operation;

    public Client(Server server, Operation operation) {
        this.server = server;
        this.operation = operation;
    }

    public void executeOperation() {
        server.addOperationToList(operation, this);
    }

    public Operation getOperation() {
        return operation;
    }
}
