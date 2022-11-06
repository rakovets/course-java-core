package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;

public class BackupUtility {
    private boolean isCopied;

    public BackupUtility() {
        this.isCopied = true;
    }

    public boolean backupDir(String dirName) throws NullPointerException {
        String addToCopyName = "_copy";
        File dir = new File(dirName);
        File copyDir = new File(dirName.concat(addToCopyName));
        copyDir.mkdir();
        for (File item : dir.listFiles()) {
            try (BufferedReader br = new BufferedReader(new FileReader(item.getAbsolutePath()));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(item.getParent().concat(addToCopyName) + "\\" + item.getName().concat(addToCopyName)))) {
                String s;
                while ((s = br.readLine()) != null) {
                    bw.write(s);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                this.isCopied = false;
            }
        }
        return this.isCopied;
    }
}
