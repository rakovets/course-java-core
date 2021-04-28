package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.operations.Operation;
import com.rakovets.course.java.core.practice.jcf_set.operations.OperationsComparator;


import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
        operationsLoqQue = new ArrayDeque<>();
    }

    public void addOperationToList(Operation operation, Client client){
        listOperations.add(operation);
        operationsLogMap.put(client,client.getLocalTime());
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

    public void executeQue(){
        for(Operation operation : queOperations){
            operation.execute(dataBase);
        }
    }

    public void showOperationsLog(){
        System.out.println(operationsLoqQue.toString());
    }

    @Override
    public String toString() {
        return "OperationsLog" +
                "{" + operationsLoqQue +
                ']';
    }
}
