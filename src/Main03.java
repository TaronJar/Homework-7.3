import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите модель кофемашины: ");
        String model = scanner.nextLine();
        System.out.print("Введите максимальное количество молотого кофе для загрузки: ");
        int maxGroundCoffee = scanner.nextInt();
        System.out.print("Введите максимальное количество воды для загрузки: ");
        int maxWater = scanner.nextInt();
        System.out.print("Введите максимальную емкость бака с отработанным кофе: ");
        int maxWasteBin = scanner.nextInt();
        System.out.print("Введите размер встроенной емкости для молока: ");
        int milkCapacity = scanner.nextInt();
        System.out.print("Введите размер бака для немолотого кофе: ");
        int maxWholeCoffee = scanner.nextInt();

        CoffeeMachine03 coffeeMachine03 = new CoffeeMachine03(model, maxGroundCoffee, maxWater, maxWasteBin, milkCapacity, maxWholeCoffee);

        System.out.print("Введите количество молотого кофе для загрузки: ");
        int groundCoffeeAmount = scanner.nextInt();
        coffeeMachine03.fillGroundCoffee(groundCoffeeAmount);

        System.out.print("Введите количество воды для загрузки: ");
        int waterAmount = scanner.nextInt();
        coffeeMachine03.fillWater(waterAmount);

        System.out.print("Введите количество молока для загрузки: ");
        int milkAmount = scanner.nextInt();
        coffeeMachine03.fillMilk(milkAmount);

        System.out.print("Введите количество немолотого кофе для загрузки: ");
        int wholeCoffeeAmount = scanner.nextInt();
        coffeeMachine03.fillWholeCoffee(wholeCoffeeAmount);

        System.out.println("Выберите действие:");
        System.out.println("1. Приготовить американо");
        System.out.println("2. Приготовить латте");
        System.out.println("3. Очистить бак с отработанным кофе");
        int action = scanner.nextInt();

        boolean success = false;
        switch (action) {
            case 1:
                success = coffeeMachine03.makeAmericano();
                break;
            case 2:
                System.out.print("Введите количество молока для латте: ");
                int latteMilkAmount = scanner.nextInt();
                success = coffeeMachine03.makeLatte(latteMilkAmount);
                break;
            case 3:
                coffeeMachine03.emptyWasteBin();
                break;
            default:
                System.out.println("Неверное действие!");
                break;
        }

        if (success) {
            System.out.println("Кофе приготовлено!");
        } else {
            System.out.println("Ошибка при приготовлении кофе!");
        }
    }
}

