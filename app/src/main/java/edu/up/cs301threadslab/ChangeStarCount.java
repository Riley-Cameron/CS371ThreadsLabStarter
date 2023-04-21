package edu.up.cs301threadslab;

public class ChangeStarCount extends Thread {
    private AnimationView frame;

    public ChangeStarCount(AnimationView f) {
        this.frame = f;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            frame.postInvalidate();
        }
    }

}

