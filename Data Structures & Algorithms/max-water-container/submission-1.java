class Solution {
    public int maxArea(int[] heights) {
      int gauche = 0, droite = heights.length - 1, maxArea = 0;
        while (gauche < droite) {
            int aire = (droite - gauche) * Math.min(heights[gauche], heights[droite]);
            maxArea = Math.max(maxArea, aire);
            if (heights[gauche] < heights[droite]) {
                gauche++;
            } else {
                droite--;
            }
        }
        return maxArea;
    }
}
