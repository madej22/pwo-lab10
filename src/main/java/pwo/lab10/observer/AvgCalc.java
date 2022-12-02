package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AvgCalc implements Subscriber {

    Double avg = null;
    int number = 0;

    @Override
    public void action(int x) {
        number++;
        avg = avg == null ? x : avg + x;
    }

    public Double getAvg() {
        return avg/number;
    }
}
