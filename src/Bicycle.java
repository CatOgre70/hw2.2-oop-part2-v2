public class Bicycle implements Vehicle{
    private final String modelName;
    private final int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            this.updateTyre(i+1);
        }
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return getClass().getName() +"{" +
                "modelName='" + getModelName() + '\'' +
                ", wheelsCount=" + getWheelsCount() +
                '}';
    }
}
