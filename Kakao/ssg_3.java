public class ssg_3 {
    public static void main(String[] args) {
        String[] dates = {"2022/05/02", "2022/05/01", "2022/05/07", "2022/05/05", "2022/05/08",
                "2022/05/13~2022/05/15", "2022/05/14~2022/05/17", "2022/05/01~2022/05/02", "2022/05/16"};

        solution(dates);
    }

    public static void solution(String[] dates) {
        boolean[] check = new boolean[32];

        for (String date : dates) {
            if (date.contains("~"))
                System.out.print("contain " + date + "\n");
            else
                System.out.print(date + "\n");
        }
    }
}
