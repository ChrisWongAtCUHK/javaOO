public class OutClass { 
    // Inner class
    private class Point { 
        private int x, y; 
 
        public Point() { 
            x = 0; y = 0; 
        } 
 
        public void setPoint(int x, int y) { 
            this.x = x; 
            this.y = y; 
        } 
 
        public int getX() { 
            return x; 
        } 
 
        public int getY() { 
            return y; 
        } 
    } 
 
    private Point[] points; 
 
    public OutClass(int length) { 
        points = new Point[length]; 
        
        for(int i = 0; i < points.length; i++) { 
            points[i] = new Point(); 
            points[i].setPoint(i*5, i*5); 
        } 
    } 
 
    public void showPoints() { 
        for(int i = 0; i < points.length; i++) { 
            System.out.printf("Point[%d]: x = %d, y = %d%n",
                      i, points[i].getX(), points[i].getY());
        } 
    } 
} 