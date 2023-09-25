class Main {
  public static void main(String[] args) {
    OrderedPair orderedPair1 = new OrderedPair(5.0, 7.0);
    System.out.println(orderedPair1.getY());
  }
}

class OrderedPair {
  double x;
  double y;
  
  public OrderedPair() {
    x = 0;
    y = 0;
  }

  public OrderedPair(double _x, double _y) {
    x = _x;
    y = _y;
  }

  public String toString() {
    return x+", "+y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}