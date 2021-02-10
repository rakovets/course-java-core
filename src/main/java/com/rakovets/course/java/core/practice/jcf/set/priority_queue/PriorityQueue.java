package com.rakovets.course.java.core.practice.jcf.set.priority_queue;

import java.util.*;

public class PriorityQueue<N> {
    private int capacity = 10;
    private final TreeSet<QueueMember<N>> priorityQueue = new TreeSet<>();

    public PriorityQueue(int initialCapacity) {
        if (initialCapacity > 0) {
            this.capacity = initialCapacity;
        }
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    public boolean isFull() {
        return priorityQueue.size() == capacity;
    }

    public void insertWithPriority(N a, int priority) {
        if (priorityQueue.size() < capacity) {
            QueueMember<N> member = new QueueMember<>(a, priority);
            priorityQueue.add(member);
        }
    }

    public void insertWithPriority(QueueMember<N> member) {
        if (priorityQueue.size() < capacity) {
            priorityQueue.add(member);
        }
    }

    public N pullHighestPriorityElement() {
        Iterator<QueueMember<N>> iter = priorityQueue.iterator();
        QueueMember<N> high = iter.next();
        N result = high.getValue();
        iter.remove();
        return result;
    }

    public N peek() {
        QueueMember<N> high = priorityQueue.first();
        return high.getValue();
    }

    public void show() {
        System.out.println(priorityQueue);
    }

    @Override
    public String toString() {
        return priorityQueue.toString();
    }

    public static class QueueMember<N> implements Comparable<QueueMember<N>> {
        private N value;
        private int priority;

        public QueueMember(N value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        @Override
        public int compareTo(QueueMember<N>  second) {
            if (this.priority > second.priority) {
                return -1;
            }
            return 1;
        }

        @Override
        public String toString() {
            return "{" + value + ", priority = " + priority + "}";
        }

        public N getValue() {
            return value;
        }

        public int getPriority() {
            return priority;
        }

        public void setValue(N value) {
            this.value = value;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }
}
