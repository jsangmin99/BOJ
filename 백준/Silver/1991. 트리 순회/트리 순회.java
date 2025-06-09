import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static class Node {
        char left, right;

        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }

    }

    static Map<Character, Node> tree = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            char root = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);
            tree.put(root, new Node(left, right));
        }
        StringBuilder front = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        StringBuilder back = new StringBuilder();

        frontCycle('A', front);
        middleCycle('A', middle);
        backCycle('A', back);

        System.out.println(front);
        System.out.println(middle);
        System.out.println(back);
    }

    static void frontCycle(char node, StringBuilder sb) {
        if (node == '.') {
            return;
        }
        sb.append(node);
        frontCycle(tree.get(node).left, sb);
        frontCycle(tree.get(node).right, sb);
    }

    static void middleCycle(char node, StringBuilder sb) {
        if (node == '.') {
            return;
        }
        middleCycle(tree.get(node).left, sb);
        sb.append(node);
        middleCycle(tree.get(node).right, sb);
    }

    static void backCycle(char node, StringBuilder sb) {
        if (node == '.') {
            return;
        }
        backCycle(tree.get(node).left, sb);
        backCycle(tree.get(node).right, sb);
        sb.append(node);

    }
}
