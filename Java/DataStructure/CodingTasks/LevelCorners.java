package DataStructure.CodingTasks;
import java.util.ArrayList;
import java.util.List;

public class LevelCorners {

    public static List<Integer> getCornerNodes(int[] tree) {
        List<Integer> corners = new ArrayList<>();
        if (tree == null || tree.length == 0) {
            return corners;
        }

        int levelStart = 0;
        int level = 0;

        while (levelStart < tree.length) {
            int levelSize = (int) Math.pow(2, level);
            int levelEnd = Math.min(levelStart + levelSize - 1, tree.length - 1);

            if (levelStart == levelEnd) {
                corners.add(tree[levelStart]);
            } else {
                corners.add(tree[levelStart]);
                if (levelEnd > levelStart) {
                    corners.add(tree[levelEnd]);
                }
            }

            levelStart = levelEnd + 1;
            level++;
        }

        return corners;
    }

    public static void main(String[] args) {
        int[] tree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> cornerNodes = getCornerNodes(tree);
        System.out.println(cornerNodes);
        System.out.println(" "+cornerNodes.get(0));
        int i = 1;
        while(i<=cornerNodes.size()-2){
            System.out.println(cornerNodes.get(i)+" "+cornerNodes.get(i+1));
            i+=2;
        }
    }
}

