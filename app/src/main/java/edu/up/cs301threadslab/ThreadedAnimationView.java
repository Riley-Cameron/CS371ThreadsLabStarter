package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread{
    private AnimationView frame;

    public ThreadedAnimationView(AnimationView f) {
        this.frame = f;
    }

    @Override
    public void run() {
        while(true) {
            frame.postInvalidate();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
