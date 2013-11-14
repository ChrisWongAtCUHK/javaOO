public class UseInnerClass4 { 
    private class Point { 
        private int x, y; 
        public Point(int x, int y) { 
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
 
    public static void main(String[] args) { 
        UseInnerClass4 inner = new UseInnerClass4();
        Point p = inner.new Point(10, 20);
 
        System.out.printf("x = %d, y = %d%n", 
                 p.getX(), p.getY()); 
    } 
}