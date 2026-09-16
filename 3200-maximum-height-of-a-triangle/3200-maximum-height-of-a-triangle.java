class Solution {

    public int maxHeightOfTriangle(int red, int blue) {

        int blueStart = getHeight(blue, red);
        int redStart = getHeight(red, blue);

        return Math.max(blueStart, redStart);
    }

    public int getHeight(int first, int second) {

        int count = 1;

        while (true) {

            if (first >= count) {
                first -= count;
            }
            else {
                break;
            }

            count++;

            int temp = first;
            first = second;
            second = temp;
        }

        return count - 1;
    }
}