public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare variables for room dimensions
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the calculateArea method and store the result
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Implementing the calculateArea method
    public static int calculateArea(int width, int height) {
        // Calculate the area by multiplying width and height
        int area = width * height;
        // Return the calculated area
        return area;
    }
}
