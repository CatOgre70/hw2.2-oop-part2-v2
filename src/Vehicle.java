public interface Vehicle {
    void check();

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    default void updateTyre(int i){
        System.out.println("Меняем покрышку " + i + " из "
                + getWheelsCount());
    }

    int getWheelsCount();
    String getModelName();

    String toString();

}
