enum Level {
  LOW("Low level"),
  MEDIUM("Medium level"),
  HIGH("High level");

  private String description;

  private Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}

public class Program_67 {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    System.out.println(myVar.getDescription());
    for (Level myVar2 : Level.values()) {
      System.out.println(myVar2 + ": " + myVar2.getDescription());
    }
  }
}