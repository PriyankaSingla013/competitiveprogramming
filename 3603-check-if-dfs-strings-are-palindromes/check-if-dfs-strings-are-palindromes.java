import java.util.ArrayList;
import java.util.List;

class Solution {
    class Node {
        private long forwardHash;
        private long reverseHash;
        private int strLength;

        public Node(long forwardHash, long reverseHash, int strLength) {
            this.reverseHash = reverseHash;
            this.forwardHash = forwardHash;
            this.strLength = strLength;
        }
    }

    private final long BASE = 26L;
    private final long MOD = 1_000_000_007;

    public boolean[] findAnswer(int[] parent, String s) {
        int n = parent.length;
        List<Integer>[] graph = new List[n];
        long[] hashMultiplier = new long[n + 1];
        hashMultiplier[0] = 1;
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            hashMultiplier[i + 1] = hashMultiplier[i] * BASE % MOD;
        }

        for (int i = 1; i < n; i++) {
            graph[parent[i]].add(i);
        }


        boolean[] result = new boolean[n];
        dfs(graph, 0, result, s, hashMultiplier);
        return result;
    }

    private Node dfs(List<Integer>[] graph, int i, boolean[] result, String s, long[] hashMultiplier) {
        long forwardHash = 0;
        long reverseHash = 0;
        int strLength = 0;
        for (int j : graph[i]) {
            Node child = dfs(graph, j, result, s, hashMultiplier);
            forwardHash = (forwardHash * hashMultiplier[child.strLength] % MOD + child.forwardHash) % MOD;
            reverseHash = (child.reverseHash * hashMultiplier[strLength] % MOD + reverseHash) % MOD;
            strLength += child.strLength;
        }
        int k = s.charAt(i) - 'a' + 1;
        forwardHash = (forwardHash * BASE % MOD + k) % MOD;
        reverseHash = (k * hashMultiplier[strLength] % MOD + reverseHash) % MOD;
        strLength++;

        result[i] = forwardHash == reverseHash;
        return new Node(forwardHash, reverseHash, strLength);
    }

}