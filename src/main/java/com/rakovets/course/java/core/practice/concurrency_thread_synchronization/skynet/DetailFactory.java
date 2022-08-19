package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public final class DetailFactory {
    private DetailFactory() {
    }

    /**
     * Creates an object of type detail.
     *
     * @param detailType enum types.
     * @return returns a new object based on enum.
     */
    public static Detail get(DetailType detailType) {
        switch (detailType) {
            case FEET:
                return new Detail(DetailType.FEET);
            case HAND:
                return new Detail(DetailType.HAND);
            case HEAD:
                return new Detail(DetailType.HEAD);
            case TORSO:
                return new Detail(DetailType.TORSO);
            default:
                return null;
        }
    }
}
