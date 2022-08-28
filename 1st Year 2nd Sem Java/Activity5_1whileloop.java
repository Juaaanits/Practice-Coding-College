public class Activity5_1whileloop {
    public static void main(String[] args) {
        String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
    }
}