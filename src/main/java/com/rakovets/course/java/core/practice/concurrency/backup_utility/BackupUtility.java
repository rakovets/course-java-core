package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;

public class BackupUtility {
    private boolean isCopied;

    private boolean isCopiedByByte;

    public BackupUtility() {
        this.isCopied = true;
        this.isCopiedByByte = true;
    }

    public boolean getIsCopied() {
        return isCopied;
    }

    public boolean getIsCopiedByByte() { return isCopiedByByte; }

    public String backupDir(String dirName) throws NullPointerException {
        String addToCopyName = "_copy";
        File dir = new File(dirName);
        File copyDir = new File(dirName.concat(addToCopyName));
        copyDir.mkdir();
        for (File item : dir.listFiles()) {
            try (BufferedReader br = new BufferedReader(new FileReader(item.getAbsolutePath()));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(item.getParent().concat(addToCopyName) + "\\" + item.getName().concat(addToCopyName)))) {
                String s;
                while ((s = br.readLine()) != null) {
                    bw.write(s + "\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                this.isCopied = false;
            }
        }
        return copyDir.getAbsolutePath();
    }

    public String backupDirByByte(String dirName) throws NullPointerException {
        String addToCopyName = "_copy2";
        File dir = new File(dirName);
        File copyDir = new File(dirName.concat(addToCopyName));
        copyDir.mkdir();
        for (File item : dir.listFiles()) {
            try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream(item.getAbsolutePath()));
                 BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(item.getParent().concat(addToCopyName) + "\\" + item.getName().concat(addToCopyName)))) {
                byte[] buffer = new byte[fin.available()];
                fin.read(buffer, 0, buffer.length);
                fos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                this.isCopiedByByte = false;
            }
        }
        return copyDir.getAbsolutePath();
    }
}
