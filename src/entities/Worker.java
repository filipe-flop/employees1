package entities;

import entities.enums.WorkerLevel;

import java.util.List;

public class Worker {
    private String name;
    private Double baseSalary;
    private WorkerLevel level;

    //associations
    private Department department;
    private List<HourContract> contracts;
}
