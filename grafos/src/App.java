import java.util.*;

class Vertex implements Comparable<Vertex> {
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;

    public Vertex(String argName) {
        name = argName;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Vertex other) {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge {
    public final Vertex target;
    public final double weight;

    public Edge(Vertex argTarget, double argWeight) {
        target = argTarget;
        weight = argWeight;
    }
}


public class App {
    // Algoritmo de Dijkstra
    public static void computePaths(Vertex source) {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies) {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);

                    v.minDistance = distanceThroughU;
                    v.previous = u;
                    vertexQueue.add(v);
                }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        // Create vertices
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        Vertex v7 = new Vertex("7");
        Vertex v8 = new Vertex("8");
        Vertex v9 = new Vertex("9");
        Vertex v10 = new Vertex("10");
        Vertex v11 = new Vertex("11");
        Vertex v12 = new Vertex("12");
        Vertex v13 = new Vertex("13");
        Vertex v14 = new Vertex("14");
        Vertex v15 = new Vertex("15");
        Vertex v16 = new Vertex("16");
        Vertex v17 = new Vertex("17");
        Vertex v18 = new Vertex("18");
        Vertex v19 = new Vertex("19");
        Vertex v20 = new Vertex("20");
        Vertex v21 = new Vertex("21");
        Vertex v22 = new Vertex("22");
        Vertex v23 = new Vertex("23");
        Vertex v24 = new Vertex("24");
        Vertex v25 = new Vertex("25");
        Vertex v26 = new Vertex("26");
        Vertex v27 = new Vertex("27");
        Vertex v28 = new Vertex("28");
        Vertex v29 = new Vertex("29");
        Vertex v30 = new Vertex("30");
        Vertex v31 = new Vertex("31");
        Vertex v32 = new Vertex("32");

        // Create edges
        v0.adjacencies = new Edge[] { new Edge(v1, 110) };
        v1.adjacencies = new Edge[] { new Edge(v0, 110), new Edge(v2, 150), new Edge(v3, 90) };
        v2.adjacencies = new Edge[] { new Edge(v1, 150), new Edge(v4, 50), new Edge(v5, 140) };
        v3.adjacencies = new Edge[] { new Edge(v1, 90), new Edge(v10, 360) };
        v4.adjacencies = new Edge[] { new Edge(v2, 50), new Edge(v3, 160), new Edge(v8, 60) };
        v5.adjacencies = new Edge[] { new Edge(v2, 140) };
        v6.adjacencies = new Edge[] { new Edge(v4, 150) };
        v7.adjacencies = new Edge[] {};
        v8.adjacencies = new Edge[] { new Edge(v7, 140), new Edge(v4, 60) };
        v9.adjacencies = new Edge[] { new Edge(v8, 450), new Edge(v10, 100), new Edge(v20, 90) };
        v10.adjacencies = new Edge[] { new Edge(v9, 100), new Edge(v11, 80), new Edge(v18, 140) };
        v11.adjacencies = new Edge[] { new Edge(v10, 80), new Edge(v17, 80), new Edge(v12, 200) };
        v12.adjacencies = new Edge[] { new Edge(v11, 200), new Edge(v13, 200), new Edge(v14, 130) };
        v13.adjacencies = new Edge[] { new Edge(v12, 200) };
        v14.adjacencies = new Edge[] { new Edge(v12, 130), new Edge(v15, 50), new Edge(v16, 60) };
        v15.adjacencies = new Edge[] { new Edge(v14, 50) };
        v16.adjacencies = new Edge[] { new Edge(v14, 60) };
        v17.adjacencies = new Edge[] { new Edge(v11, 80) };
        v18.adjacencies = new Edge[] {};
        v19.adjacencies = new Edge[] { new Edge(v9, 200) };
        v20.adjacencies = new Edge[] { new Edge(v9, 90), new Edge(v21, 130), new Edge(v29, 120) };
        v21.adjacencies = new Edge[] { new Edge(v20, 130), new Edge(v22, 70), new Edge(v24, 330) };
        v22.adjacencies = new Edge[] { new Edge(v21, 70), new Edge(v23, 300), new Edge(v26, 240) };
        v23.adjacencies = new Edge[] { new Edge(v22, 300) };
        v24.adjacencies = new Edge[] { new Edge(v21, 330) };
        v25.adjacencies = new Edge[] { new Edge(v26, 270) };
        v26.adjacencies = new Edge[] { new Edge(v22, 240), new Edge(v25, 270), new Edge(v27, 150) };
        v27.adjacencies = new Edge[] { new Edge(v26, 150), new Edge(v28, 110), new Edge(v32, 370) };
        v28.adjacencies = new Edge[] { new Edge(v27, 110), new Edge(v31, 300), new Edge(v29, 130) };
        v29.adjacencies = new Edge[] { new Edge(v28, 130), new Edge(v30, 300), new Edge(v20, 120) };
        v30.adjacencies = new Edge[] { new Edge(v29, 300) };
        v31.adjacencies = new Edge[] { new Edge(v28, 300) };
        v32.adjacencies = new Edge[] { new Edge(v27, 370) };

        Vertex[] vertices = {
                v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10,
                v11, v12, v13, v14, v15, v16, v17, v18, v19, v20,
                v21, v22, v23, v24, v25, v26, v27, v28, v29, v30,
                v31, v32
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Existing vertices: ");
        for (Vertex v : vertices) {
            System.out.print(v.name + " ");
        }
        System.out.println();

        System.out.println("Enter the start vertex:");
        String start = scanner.next();

        System.out.println("Enter the target vertex:");
        String end = scanner.next();

        Vertex source = null;
        Vertex target = null;

        for (Vertex v : vertices) {
            if (v.name.equals(start)) {
                source = v;
            }
            if (v.name.equals(end)) {
                target = v;
            }
        }

        if (source == null || target == null) {
            System.out.println("Could not find the provided vertices.");
            System.exit(0);
        }

        computePaths(source);
        System.out.println("Distance to " + target + ": " + target.minDistance);
        List<Vertex> path = getShortestPathTo(target);
        System.out.println("Path: ");
        for (int i = 0; i < path.size() - 1; i++) {
            for (Edge e : path.get(i).adjacencies) {
                if (e.target.equals(path.get(i + 1))) {
                    System.out.println(path.get(i) + " --(" + e.weight + ")--> " + path.get(i + 1));
                    break;
                }
            }
        }
    }
}
