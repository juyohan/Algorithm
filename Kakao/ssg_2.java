import java.util.*;

class Node implements Comparable<Node> {
    int problem, score;

    Node(int problem, int score) {
        this.problem = problem;
        this.score = score;
    }

    @Override
    public int compareTo(Node o) {
        return this.problem - o.problem;
    }
}

public class ssg_2 {
    public static void main(String[] args) {
        String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80",
                "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};

        String[] logs1 = {"1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100",
                "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100",
                "1903 2 100", "1903 1 100", "1101 1 95", "1101 2 100", "1101 4 100", "1101 7 100", "1101 9 100",
                "1102 1 95", "1102 2 100", "1102 4 100", "1102 7 100", "1102 9 100"};

        String[] logs2 = {"1901 10 50", "1909 10 50"};

        solution(logs);
    }

    public static void solution(String[] logs) {
        List<String> answer = new ArrayList<>();
        Map<String, List<Node>> map = new HashMap<>();

        for (String log : logs) {
            String[] data = log.split(" ");
            String name = data[0];
            int problem = Integer.parseInt(data[1]);
            int score = Integer.parseInt(data[2]);

            List<Node> list = addList(map.get(name), name, problem, score);

            map.put(data[0], list);
        }

        String[] strings1 = map.keySet().toArray(String[]::new);

        for (int i = 0; i < strings1.length - 1; i++) {
            String key1 = strings1[i];

            for (int j = i + 1; j < strings1.length; j++) {
                String key2 = strings1[j];

                if (map.get(key1).size() < 5 || map.get(key2).size() < 5) continue;
                if (map.get(key1).size() != map.get(key2).size()) continue;


                if (check(map.get(key1), map.get(key2))) {
                    if (!answer.contains(key1))
                        answer.add(key1);
                    if (!answer.contains(key2))
                        answer.add(key2);
                }
            }
        }

        Collections.sort(answer);
        if (answer.isEmpty()) {
            answer.add("None");
        }

        for (String str : answer.toArray(String[]::new)) {
            System.out.print(str + " ");
        }

//        for (String str : map.keySet()) {
//            for (Node node : map.get(str)) {
//                System.out.print(str + " " + node.problem + " " + node.score + "\n");
//            }
//        }

    }

    public static boolean check (List<Node> list1, List<Node> list2) {
        boolean check = false;

        for (int k = 0; k < list1.size(); k++) {
            if (list1.get(k).score == list2.get(k).score && list1.get(k).problem == list2.get(k).problem)
                check = true;
            else {
                return false;
            }
        }
        return check;
    }

    public static List<Node> addList(List<Node> nodes, String name, int problem, int score) {
//        List<Node> list = new ArrayList<>();

        if (nodes == null) {
            nodes = new ArrayList<>();
            nodes.add(new Node(problem, score));
        } else {
//            list = nodes;
            for (Node listData : nodes) {
                if (listData.problem == problem && listData.score < score) {
                    nodes.remove(listData);
                    break;
                }
            }
//            list.add(new Node(problem, score));
            nodes.add(new Node(problem, score));
            Collections.sort(nodes);
        }
        return nodes;
    }
}
