public class House_three {
    public static void main(String[] args) {
        String tString = "this is {template} {template} is {state}";
        String[][] variables = new String[2][2];
        variables[0][0] = "template";
        variables[0][1] = "string";
        variables[1][0] = "state";
        variables[1][1] = "changed";

        String[] split = tString.split("[\\{[a-z]\\}]");

        for (String str : split)
            System.out.println(str);

    }
}
