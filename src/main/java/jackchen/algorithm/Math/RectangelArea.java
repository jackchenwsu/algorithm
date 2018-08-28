package jackchen.algorithm.Math;

public class RectangelArea {

    /*
     * 233.  Find the total area covered by two rectilinear rectangles in a 2D plane.
     *       Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
     */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);

        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int bottom = Math.max(B, F);
        int top = Math.min(D, H);

        //If overlap
        int overlap = 0;
        if(right > left && top > bottom)
            overlap = (right - left) * (top - bottom);

        return areaA + areaB - overlap;
}
}
