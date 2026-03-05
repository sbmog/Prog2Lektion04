package examples.models;

public class MeasurableArray <T extends Measurable> {
    private T[] measurables;

    public MeasurableArray(T[] measurables) {
        this.measurables = measurables;
    }

    public T max() {
        if (measurables.length == 0) {
            return null;
        }
        T max = measurables[0];
        for (T measurable : measurables) {
            if (measurable.measure() > max.measure()) {
                max = measurable;
            }
        }
        return max;
    }
}
