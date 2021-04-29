package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.operations.Operation;

import java.time.LocalTime;

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
