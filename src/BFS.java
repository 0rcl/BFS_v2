import java.util.*;
public class BFS {
    /**
     * Durchläuft den Graphen mit der Breitensuche von einem Startknoten aus
     * und gibt die besuchten Knoten aus.
     *
     * @param graph die Adjazenzmatrix, die den Graphen repräsentiert
     * @param start der Startknoten, von dem aus die Breitensuche beginnen soll
     */
    public static void breadthFirstSearch(int[][] graph, int start) {
        // Markiere alle Knoten als unbesucht
        boolean[] visited = new boolean[graph.length];

        // Erstelle eine Warteschlange, um die zu besuchenden Knoten zu speichern
        Queue<Integer> queue = new LinkedList<>();

        // Markiere den Startknoten als besucht und füge ihn in die Warteschlange ein
        visited[start] = true;
        queue.offer(start);

        // Solange die Warteschlange nicht leer ist
        while (!queue.isEmpty()) {
            // Entnehme den nächsten Knoten aus der Warteschlange
            int current = queue.poll();
            // Gib den besuchten Knoten aus
            System.out.print(current + " ");

            // Durchlaufe alle Nachbarn des aktuellen Knotens
            for (int neighbor = 0; neighbor < graph[current].length; neighbor++) {
                // Wenn der Nachbar eine Verbindung zum aktuellen Knoten hat und noch nicht besucht wurde
                if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                    // Markiere ihn als besucht und füge ihn in die Warteschlange ein
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Erstelle eine Adjazenzmatrix für einen Graphen mit 6 Knoten
        int[][] graph = new int[][]{
                {0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0}
        };

        // Führe die Breitensuche von Knoten 2 aus und gib die besuchten Knoten aus
        System.out.print("Breitensuche: ");
        breadthFirstSearch(graph, 2);
    }
}
