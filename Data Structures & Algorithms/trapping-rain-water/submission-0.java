class Solution {
    public int trap(int[] height) {
        int gauche = 0, droite = height.length-1, totalAmount = 0,maxG=0,maxD=0;
        while (gauche < droite) {
          
            if (height[gauche] <= height[droite]) {

                   if (maxG >= height[gauche]) {
                        totalAmount += maxG - height[gauche];
                    }
                  maxG=Math.max(maxG,height[gauche] );
                gauche++;
             
            } else {
                if (maxD >= height[droite]) {
                    totalAmount+=maxD - height[droite];
                }
                  maxD=Math.max(maxD,height[droite] );
                droite--;
        
            }
        }
        return totalAmount;
    }
}
