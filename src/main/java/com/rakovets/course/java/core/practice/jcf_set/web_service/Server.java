package com.rakovets.course.java.core.practice.jcf_set.web_service;

import com.rakovets.course.java.core.practice.jcf_set.web_service.operations.Operation;
import com.rakovets.course.java.core.practice.jcf_set.web_service.operations.comaparator.OperationsComparator;
import java.time.LocalTime;
import java.util.*;

public class Server {

    private UsersDataBase dataBase;
    private List<Operation> listOperations;
    private ArrayDeque<Operation> queOperations;
    Map<Client,LocalTime> operationsLogMap;
    private ArrayDeque<Map.Entry<Client, LocalTime>> operationsLoqQue;

    public Server(UsersDataBase dataBase) {
        this.dataBase = dataBase;
        listOperations = new ArrayList<>();
        queOperations = new ArrayDeque<>();
        operationsLogMap = new HashMap<>();
        operationsLoqQue = new ArrayDeque<>();
    }

    public void addOperationToList(Operation operation, Client client) {
        listOperations.add(operation);
        LocalTime timeOfTheRequest = LocalTime.now();
        operationsLogMap.put(client,timeOfTheRequest);
    }

    public void addOperationsToQue() {
        listOperations.sort(new OperationsComparator());
        for (Operation operation : listOperations) {
            queOperations.addLast(operation);
        }
        for (Map.Entry<Client, LocalTime> key : operationsLogMap.entrySet()) {
            operationsLoqQue.addLast(key);
        }
    }

    public void executeQue() {
        for(Operation operation : queOperations) {
            operation.execute(dataBase);
        }
    }

    public void showOperationsLog() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String result = "---Operations Log---";
        for(Map.Entry<Client, LocalTime> dataForOperation : operationsLoqQue) {
            result += dataForOperation.getKey().getOperation().getName() + dataForOperation.getValue() + "\n";
        }
        return result;
    }
}
