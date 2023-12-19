import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите модель кофемашины: ");
        String model = scanner.nextLine();
        System.out.print("Введите максимальное количество кофе для загрузки: ");
        int maxCoffee = scanner.nextInt();
        System.out.print("Введите максимальное количество воды для загрузки: ");
        int maxWater = scanner.nextInt();
        System.out.print("Введите максимальную емкость бака с отработанным кофе: ");
        int maxWasteBin = scanner.nextInt();
        System.out.print("Введите размер встроенной емкости для молока: ");
        int milkCapacity = scanner.nextInt();

        CoffeeMachine02 coffeeMachine02 = new CoffeeMachine02(model, maxCoffee, maxWater, maxWasteBin, milkCapacity);

        System.out.print("Введите количество кофе для загрузки: ");
        int coffeeAmount = scanner.nextInt();
        coffeeMachine02.fillCoffee(coffeeAmount);

        System.out.print("Введите количество воды для загрузки: ");
        int waterAmount = scanner.nextInt();
        coffeeMachine02.fillWater(waterAmount);

        System.out.print("Введите количество молока для загрузки: ");
        int milkAmount = scanner.nextInt();
        coffeeMachine02.fillMilk(milkAmount);

        System.out.println("Выберите действие:");
        System.out.println("1. Приготовить эспрессо");
        System.out.println("2. Приготовить американо");
        System.out.println("3. Приготовить капучино");
        System.out.println("4. Приготовить латте");
        System.out.println("5. Очистить бак с отработанным кофе");
        int action = scanner.nextInt();

        boolean success = false;
        switch (action) {
            case 1:
                success = coffeeMachine02.makeEspresso();
                break;
            case 2:
                success = coffeeMachine02.makeAmericano();
                break;
            case 3:
                System.out.print("Введите количество молока для капучино: ");
                int cappuccinoMilkAmount = scanner.nextInt();
                success = coffeeMachine02.makeCappuccino(cappuccinoMilkAmount);
                break;
            case 4:
                System.out.print("Введите количество молока для латте: ");
                int latteMilkAmount = scanner.nextInt();
                success = coffeeMachine02.makeLatte(latteMilkAmount);
                break;
            case 5:
                coffeeMachine02.emptyWasteBin();
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
