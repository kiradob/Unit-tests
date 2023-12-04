import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
// Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Company", "Model", 2023);
        Assertions.assertTrue(car instanceof Vehicle);
    }
// Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Company", "Model", 2023);
        Assertions.assertEquals(4, car.getNumWheels());
    }
// Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }
// Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarTestDriveSpeed() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }
// Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }
// Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarParkSpeed() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }
// Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleParkSpeed() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}