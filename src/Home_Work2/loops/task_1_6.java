package Home_Work_2.loops;

public class task_1_6 {
    public static void main(String[] args) {
        System.out.println(" Таблица умножения : ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
