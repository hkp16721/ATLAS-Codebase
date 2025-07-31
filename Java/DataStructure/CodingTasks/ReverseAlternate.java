package DataStructure.CodingTasks;

public class ReverseAlternate {
    public static void reverseAlternateLevels(int[] tree) {
        if (tree == null || tree.length == 0) {
            return;
        }

        int level = 0;
        int levelStart = 0;

        while (levelStart < tree.length) {
            int levelSize = (int) Math.pow(2, level);
            int levelEnd = Math.min(levelStart + levelSize - 1, tree.length - 1);
            if (level % 2 == 1) {
                reverseLevel(tree, levelStart, levelEnd);
            }

            levelStart = levelEnd + 1;
            level++;
        }
    }

    private static void reverseLevel(int[] tree, int start, int end) {
        while (start < end) {
            int temp = tree[start];
            tree[start] = tree[end];
            tree[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] tree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.print("Original Tree: ");
        for (int num : tree) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseAlternateLevels(tree);

        System.out.print("After Reversing Alternate Levels: ");
        for (int num : tree) {
            System.out.print(num + " ");
        }
    }
}
