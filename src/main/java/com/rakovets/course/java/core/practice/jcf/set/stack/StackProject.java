package com.rakovets.course.java.core.practice.jcf.set.stack;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StackProject<N> {
    private int capacity = 10;
    private boolean isSizeFixed;
    private final Set<N> stack = new LinkedHashSet<>(capacity);

    public StackProject(int initialCapacity, boolean isFixed) {
        if (initialCapacity > 0) {
            this.capacity = initialCapacity;
        }
        this.isSizeFixed = isFixed;
    }

    public void addToStack(N a) {
        if (!isSizeFixed || stack.size() < capacity) {
            stack.add(a);
        }
    }

    public N pollLast() {
        Iterator<N> iter = stack.iterator();
        N result = null;
        while (iter.hasNext()) {
            result = iter.next();
        }
        iter.remove();
        return result;
    }

    public int getCountOfMembers() {
        Iterator<N> iter = stack.iterator();
        int count = 0;

        while (iter.hasNext()) {
            if (iter.next() != null) {
                count += 1;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isStackFull() {
        if(isSizeFixed) {
            Iterator<N> iter = stack.iterator();
            int count = 0;

            while (iter.hasNext()) {
                if (iter.next() != null) {
                    count += 1;
                }
            }
            return count == capacity;
        } else {
            return false;
        }
    }

    public void clearStack() {
        stack.clear();
    }

    public N peekLast() {
        Iterator<N> iter = stack.iterator();
        N result = null;
        while (iter.hasNext()) {
            result = iter.next();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Stack: " + stack;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int initialCapacity) {
        this.capacity = initialCapacity;
    }

    public boolean isSizeFixed() {
        return isSizeFixed;
    }

    public void setSizeFixed(boolean isFixed) {
        isSizeFixed = isFixed;
    }

    public Set<N> getStack() {
        return stack;
    }
}
