package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.project_master_worker.CommonResourse;
import com.rakovets.course.java.core.practice.concurrency.common.project_master_worker.ThreadMaster;
import com.rakovets.course.java.core.practice.concurrency.common.project_master_worker.ThreadWorker;

public class WorkerMasterDemo {
    public static void main(String[] args) {
        CommonResourse commonResourse = new CommonResourse();
        Thread master = new ThreadMaster(commonResourse);
        Thread worker = new ThreadWorker(commonResourse);
        master.start();
        worker.start();
    }
}
