import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] questions = {
                "Для какой области вы планируете использовать искусственный интеллект?",
                "Какой тип задач вы планируете решать с помощью ИИ?",
                "Какие данные у вас имеются для обучения модели?"
        };

        String[][] options = {
                {"Медицина", "Финансы", "Технологии"},
                {"Классификация", "Прогнозирование", "Распознавание образов"},
                {"Мало данных", "Умеренное количество данных", "Большое количество данных"}
        };

        String[] results = {
                "Рекомендуется использовать глубокое обучение нейронных сетей.",
                "Рекомендуется использовать временные ряды и методы прогнозирования.",
                "Рекомендуется использовать методы компьютерного зрения и обработки изображений.",
                "Рекомендуется использовать алгоритмы машинного обучения с учителем.",
                "Рекомендуется использовать методы обработки естественного языка и анализа текста."
        };

        System.out.println("Добро пожаловать в экспертную систему по выбору типа искусственного интеллекта!");
        System.out.println("Ответьте на несколько вопросов, чтобы мы могли подобрать подходящий вариант для вас.");

        String[] answers = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println("   " + (char) ('a' + j) + ") " + options[i][j]);
            }

            System.out.print("Ваш ответ: ");
            String answer = in.nextLine().toLowerCase();

            // Проверка на корректность ответа
            boolean validAnswer = false;
            for (int j = 0; j < options[i].length; j++) {
                if (answer.equals(String.valueOf((char) ('a' + j)))) {
                    validAnswer = true;
                    break;
                }
            }

            if (!validAnswer) {
                System.out.println("Ошибка: Неверный вариант ответа!");
                return;
            }

            answers[i] = answer;
        }

        // Выбор результата
        System.out.println("Результат:");
        boolean resultFound = false;
        for (int i = 0; i < results.length; i++) {
            if (answers[0].equals(String.valueOf((char) ('a' + i)))) {
                if (answers[1].equals(String.valueOf((char) ('a' + i)))) {
                    if (answers[2].equals(String.valueOf((char) ('a' + i)))) {
                        System.out.println(results[i]);
                        resultFound = true;
                        break;
                    }
                }
            }
        }

        if (!resultFound) {
            System.out.println("Извините, не можем предложить рекомендацию для введенных параметров.");
        }
    }
}