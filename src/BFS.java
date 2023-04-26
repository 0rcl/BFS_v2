import java.util.*;
public class BFS {
  //1
    public static void breadthFirstSearch(int[][] graph, int start) {
        //2
        boolean[] visited = new boolean[graph.length];

        // 3
        Queue<Integer> queue = new LinkedList<>();

        //4
        visited[start] = true;
        queue.offer(start);

        // 5
        while (!queue.isEmpty()) {
            // 6
            int current = queue.poll();
            // 7
            System.out.print(current + " ");

            // 8
            for (int neighbor = 0; neighbor < graph[current].length; neighbor++) {
                //9
                if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                    // 10
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 11
        int[][] graph = new int[][]{
                {0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0}
        };

        // 12
        System.out.print("Breitensuche: ");
        breadthFirstSearch(graph, 2);
    }
}
