package creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Meal {

  private Burger burger;
  private Soda soda;
  private Fries fries;
  private List<Ketcup> ketchups;

  @Override
  public String toString() {
    return "Meal{" +
        "burger=" + burger +
        ", soda=" + soda +
        ", fries=" + (fries != null ? fries : "NA") +
        ", ketchups=" + Arrays.toString(ketchups.toArray()) +
        '}';
  }

  private Meal(MealBuilder builder) {
    this.burger = builder.burger;
    this.soda = builder.soda;
    this.fries = builder.fries;
    this.ketchups = builder.ketchups;
  }

  public static class MealBuilder {

    // mandatory attributes for building a meal
    private Burger burger;
    private Soda soda;

    // optional attributes in a meal
    private Fries fries;
    private List<Ketcup> ketchups;

    // inorder to make a meal, a burger and a soda is must.
    public MealBuilder(Burger burger, Soda soda) {
      this.burger = burger;
      this.soda = soda;
      this.ketchups = new ArrayList<>();
    }

    // method to add fries to a meal.
    public MealBuilder addFries(Fries fries) {
      this.fries = fries;
      return this;
    }

    // method to add ketchup to a meal.
    public MealBuilder addKetcup(Ketcup ketcup) {
      this.ketchups.add(ketcup);
      return this;
    }

    // method to build the meal.
    public Meal build() {
      return new Meal(this);
    }
  }

}
