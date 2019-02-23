package creational.builder;

import creational.builder.Meal.MealBuilder;

public class MealBuilderTest {

  public static void main(String[] args) {

    // 1. Standard meal with chicken burger and a diet coke.
    MealBuilder builder = new Meal.MealBuilder(Burger.CHICKEN_BURGER, Soda.DIET_COKE);
    Meal standardMeal = builder.build();
    System.out.println("Standard Meal: " + standardMeal.toString());

    // 2. Meal with vegetarian burger, pepsi and garlic fries.
    builder = new Meal.MealBuilder(Burger.VEG_BURGER, Soda.PEPSI);
    Meal heavyMeal = builder.addFries(Fries.GARLIC)
        .build();
    System.out.println("Heavy Meal: " + heavyMeal.toString());

    // 3. Meal with vegetarian burger, coke, garlic fries and ketcups.
    builder = new Meal.MealBuilder(Burger.VEG_BURGER, Soda.COKE);
    Meal superMeal = builder.addFries(Fries.GARLIC)
        .addKetcup(Ketcup.RANCH)
        .addKetcup(Ketcup.TOMATO)
        .build();
    System.out.println("Super Meal: " + superMeal.toString());
  }

}
