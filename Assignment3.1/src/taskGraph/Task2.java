package taskGraph;

public class Task2 {
    public static void main(String[] args) {
        ExtendedGraph g = new ExtendedGraph(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 6);
        g.addEdge(0, 5);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(4, 3); // not allowed
        g.addEdge(4, 6); // not allowed
        System.out.println(g.hasEdge(4, 5)); // true
        System.out.println(g.hasEdge(4, 3)); // false
    }

    private static class ExtendedGraph extends Graph {

        ExtendedGraph(int v) {
            super(v);
        }

        @Override
        public void addEdge(int v, int w) {
            if (!createsCycle(v, w)) {
                super.addEdge(v, w);
            }
        }

        private boolean createsCycle(int v, int w) {
            BreathFirstPath paths = new BreathFirstPath(v, this);
            return paths.hasPathTo(w);
        }

        private boolean hasEdge(int v, int w) {
            for (Integer i : adj(v)) {
                if (i == w)
                    return true;
            }
            return false;
        }
    }
}
