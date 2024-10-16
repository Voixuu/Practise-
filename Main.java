package pac;
public class Main {
    public static void main(String[] args) {
        // 1) Создание переменной с любимым временем года
        Seasons myFavoriteSeason = Seasons.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        // 2) Вызов метода для любимого времени года
        Seasons.printSeasonInfo(myFavoriteSeason);

        // 6) Цикл для распечатки всех времен года
        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}