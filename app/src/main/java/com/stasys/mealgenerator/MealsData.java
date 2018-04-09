package com.stasys.mealgenerator;

import android.os.Bundle;
import android.widget.CheckBox;

import java.util.Random;

/**
 * Created by Stasys on 4/6/2018.
 */

public class MealsData {
    //ProductListActivity prodCheck = new ProductListActivity();

    boolean eggs, flakes, dairy;

    boolean pork, beef, chicken, fish;

    boolean salad, cereal, pancakes;

    static public String _breakFast;
    static public String _lunch;
    static public String _eveningMeal;

    int _breakfastNum;
    int _lunchNum;
    int _eveningMealNum;
    int _optionNum;

    public void productChecks() {
        if (ProductListActivity._eggsCheck.isChecked()) {
            eggs = true;
        } else {
            eggs = false;
        }
        if (ProductListActivity._flakesCheck.isChecked()) {
            flakes = true;
        } else {
            flakes = false;
        }
        if (ProductListActivity._dairyCheck.isChecked()) {
            dairy = true;
        } else {
            dairy = false;
        }
        if (ProductListActivity._porkCheck.isChecked()) {
            pork = true;
        } else {
            pork = false;
        }
        if (ProductListActivity._chickenCheck.isChecked()) {
            chicken = true;
        } else {
            chicken = false;
        }
        if (ProductListActivity._beefCheck.isChecked()) {
            beef = true;
        } else {
            beef = false;
        }
        if (ProductListActivity._fishCheck.isChecked()) {
            fish = true;
        } else {
            fish = false;
        }
        if (ProductListActivity._saladCheck.isChecked()) {
            salad = true;
        } else {
            salad = false;
        }
        if (ProductListActivity._cerealCheck.isChecked()) {
            cereal = true;
        } else {
            cereal = false;
        }
        if (ProductListActivity._pancakesCheck.isChecked()) {
            pancakes = true;
        } else {
            pancakes = false;
        }

    }

    Random rand = new Random();

    public void mealsSelection() {
        productChecks();
        generateBreakfastOption();
        generateLunchOption();
        generateEveningMealOption();
    }

    private int generateOption() {
        int randNum = 0;
        randNum = rand.nextInt(7) + 1;
        return randNum;
    }

    private int generateBreakfastNumber() {
        int randNum = 0;

        randNum = rand.nextInt(3) + 1;
        return randNum;
    }

    private int generateLunchNumber() {
        int randNum = 0;

        randNum = rand.nextInt(4) + 1;
        return randNum;
    }

    private int generateEveningMealNumber() {
        int randNum = 0;

        randNum = rand.nextInt(3) + 1;
        return randNum;
    }

    private void generateBreakfastOption() {
        boolean isBreakfastOptionSeleceted = false;
        do {
            _breakfastNum = generateBreakfastNumber();
            _optionNum = generateOption();
            if (eggs && _breakfastNum == 1) {
                eggOptions();
                isBreakfastOptionSeleceted = true;
            }
            if (flakes && _breakfastNum == 2) {
                flakesOptions();
                isBreakfastOptionSeleceted = true;
            }
            if (dairy && _breakfastNum == 3) {
                dairyOptions();
                isBreakfastOptionSeleceted = true;
            }

            if (!eggs && !flakes && !dairy) {
                isBreakfastOptionSeleceted = true;
            }
        } while (!isBreakfastOptionSeleceted);

        if (!eggs && !flakes && !dairy) {
            _breakFast = "No breakfast product selected. Please go back to 'SELECT PRODUCTS' tab and select breakfast product.";
        }
    }

    private void generateLunchOption() {
        boolean isLunchOptionSeleceted = false;
        do {
            _lunchNum = generateLunchNumber();
            _optionNum = generateOption();
            if (pork && _lunchNum == 1) {
                porkOptions();
                isLunchOptionSeleceted = true;
            }
            if (beef && _lunchNum == 2) {
                beefOptions();
                isLunchOptionSeleceted = true;
            }
            if (chicken && _lunchNum == 3) {
                chickenOptions();
                isLunchOptionSeleceted = true;
            }
            if (fish && _lunchNum == 4) {
                fishOptions();
                isLunchOptionSeleceted = true;
            }
            if (!fish && !chicken && !pork && !beef) {
                isLunchOptionSeleceted = true;
            }
        } while (!isLunchOptionSeleceted);
        if (!pork && !beef && !chicken && !fish) {
            _lunch = "No lunch product selected. Please go back to 'SELECT PRODUCTS' tab and select lunch product.";
        }
    }

    private void generateEveningMealOption() {
        boolean isEveningMealOptionSeleceted = false;
        do {
            _eveningMealNum = generateEveningMealNumber();
            _optionNum = generateOption();
            if (salad && _eveningMealNum == 1) {
                saladOptions();
                isEveningMealOptionSeleceted = true;
            }
            if (pancakes && _eveningMealNum == 2) {
                pancakesOptions();
                isEveningMealOptionSeleceted = true;
            }
            if (cereal && _eveningMealNum == 3) {
                cerealOptions();
                isEveningMealOptionSeleceted = true;
            }

            if (!salad && !pancakes && !cereal) {
                isEveningMealOptionSeleceted = true;
            }
        } while (!isEveningMealOptionSeleceted);
        if (!salad && !pancakes && !cereal) {
            _eveningMeal = "No evening meal product selected. Please go back to 'SELECT PRODUCTS' tab and select evening meal product.";
        }
    }

    private void eggOptions() {
        if (_optionNum == 1) {
            _breakFast = "Ingredients\n" +
                    "3 tablespoons olive oil\n" +
                    "2 small russet potatoes (about ¾ pound), 1 small onion, thinly sliced 9 large eggs kosher salt and black pepper 1 10-ounce package frozen chopped spinach, thawed and squeezed of excess liquid 4 ounces white Cheddar, grated (1 cup) 4 ounces thinly sliced deli ham, cut into 2-inch pieces 1 tablespoon red wine vinegar 1 teaspoon Dijon mustard 1 head red leaf lettuce, torn into bite-size pieces (6 cups)\n" +
                    "\n" +
                    "Instructions\n" +
                    "Heat oven to 400° F. Heat 2 tablespoons of the oil in a large ovenproof nonstick skillet over medium heat. Add the potatoes and onion and cook, tossing occasionally, until the potatoes are tender, 12 to 15 minutes.\n" +
                    "Meanwhile, in a large bowl, whisk together the eggs, ½ teaspoon salt, and ¼ teaspoon pepper. Mix in the spinach, Cheddar, and ham.\n" +
                    "Add the egg mixture to the skillet, stir once, and transfer the skillet to oven. Cook until \n" +
                    "Meanwhile, in a large bowl, whisk together the vinegar, mustard, the remaining tablespoon of oil, and ¼ teaspoon each salt and pepper. Add the lettuce and toss to coat. Serve with the frittata.";
        }
        if (_optionNum == 2) {
            _breakFast = "Ingredients\n" +
                    "1 red onion,\n" +
                    "chopped 1 bell pepper,\n" +
                    "chopped 2 tablespoons olive oil,\n" +
                    "plus more for serving kosher salt and black pepper 8 large eggs, beaten 3 ounces Cheddar, grated (about 3/4 cup) 1 cup halved cherry tomatoes 1/3 cup finely chopped flat-leaf parsley leaves crusty bread, for serving\n" +
                    "\n" +
                    "Instructions\n" +
                    "Heat the olive oil in a large nonstick skillet over medium heat. Add the onion, bell pepper, 1 teaspoon salt, and ½ teaspoon pepper. Cook, stirring occasionally, until very tender, 12 to 14 minutes.\n" +
                    "Add the eggs and cook, stirring frequently, until the eggs are just set, 1 to 2 minutes. Add the Cheddar and cook, stirring, until just melted, 1 to 2 minutes more.\n" +
                    "Remove from heat and stir in the tomatoes and parsley.\n" +
                    "Drizzle the bread with oil and serve alongside the eggs.";
        }
        if (_optionNum == 3) {
            _breakFast = "Ingredients\n" +
                    "1 cup quinoa \n" +
                    "4 large eggs \n" +
                    "2 tablespoons olive oil kosher salt and black pepper \n" +
                    "1 avocado, chopped \n" +
                    "6 ounces smoked salmon fresh lemon juice, for serving sliced scallions, for serving\n" +
                    "\n" +
                    "Instructions\n" +
                    "Cook the quinoa according to the package directions.\n" +
                    "Meanwhile, heat the oil in a large nonstick skillet over medium heat. Add the eggs and cook, covered, 2 to 4 minutes for slightly runny yolks. Season with ¼ teaspoon each salt and pepper.\n" +
                    "Serve the quinoa topped with the fried eggs, avocado, and salmon, dividing evenly. Drizzle with the lemon juice and top with scallions.";
        }
        if (_optionNum == 4) {
            _breakFast = "Ingredients\n" +
                    "4 English muffins \n" +
                    "olive oil \n" +
                    "tomato slices \n" +
                    "2 hard-cooked eggs, \n" +
                    "sliced grated mozzarella \n" +
                    "oregano kosher salt\n" +
                    "\n" +
                    "Instructions\n" +
                    "Toast 8 English-muffin halves and place on a cookie sheet.\n" +
                    "Drizzle each with olive oil, then layer on tomato slices, hard-cooked egg slices (½ an egg each), and a little grated mozzarella. Sprinkle with oregano and kosher salt.\n" +
                    "Broil 5 minutes or until the cheese melts.";
        }
        if (_optionNum == 5) {
            _breakFast = "Ingredients\n" +
                    "6 cups low-sodium chicken broth \n" +
                    "3/4 cup long-grain rice \n" +
                    "2 cooked chicken-breast halves, \n" +
                    "skin discarded and meat shredded 2 large eggs, at room temperature \n" +
                    "1/3 cup fresh lemon juice \n" +
                    "1 lemon, thinly sliced\n" +
                    "\n" +
                    "Instructions\n" +
                    "Place the broth and the rice in a large saucepan and bring to a boil.\n" +
                    "Reduce to a simmer, cover, and cook for 15 minutes or until the rice is cooked.\n" +
                    "Add the chicken. Remove the soup from heat and cover.\n" +
                    "Whisk the eggs and lemon juice in a medium bowl until frothy.\n" +
                    "Slowly add about 1 cup hot chicken broth to the lemon and eggs, whisking continually. Slowly stir the warmed eggs into the soup.\n" +
                    "Ladle soup into bowls. Serve immediately with a slice of lemon.";
        }
        if (_optionNum == 6) {
            _breakFast = "Ingredients\n" +
                    "4 slices rustic country bread \n" +
                    "1 pound asparagus, tough ends trimmed \n" +
                    "2 tablespoons olive oil kosher salt and black pepper \n" +
                    "8 large eggs \n" +
                    "1/4 cup Parmesan (1 ounce) \n" +
                    "\n" +
                    "Instructions\n" +
                    "Heat broiler. Place the bread and asparagus on a baking sheet. Drizzle with the oil and season with 1/2 teaspoon each salt and pepper.\n" +
                    "\n" +
                    "Step 2\n" +
                    "Broil until the bread is toasted, 1 to 2 minutes per side; transfer the bread to plates. Continue broiling the asparagus, tossing once, until tender, 4 to 8 minutes more.\n" +
                    "Meanwhile, bring a large saucepan of water to a boil. Carefully lower the eggs into the water. Reduce heat and gently simmer for 6 minutes. Cool under running water and peel.\n" +
                    "Divide the asparagus among the toast, sprinkle on the Parmesan, and top with the eggs.";
        }
        if (_optionNum == 7) {
            _breakFast = "1 16-ounce jar salsa (2 cups) \n" +
                    "1 15.5-ounce can black beans, rinsed \n" +
                    "4 large eggs kosher salt and black pepper \n" +
                    "2 scallions, sliced \n" +
                    "1/4 cup chopped fresh cilantro \n" +
                    "4 small flour tortillas, warmed \n" +
                    "1/2 cup sour cream\n" +
                    "\n" +
                    "Instructions\n" +
                    "In a large skillet, combine the salsa and beans and bring to a simmer.\n" +
                    "Make 4 wells in the bean mixture. Crack each egg into a small bowl and slide it gently into a well. Season with ½ teaspoon salt and ¼ teaspoon pepper.\n" +
                    "Cook, covered, over medium heat, 3 to 5 minutes for slightly runny yolks.\n" +
                    "Sprinkle with the scallions and cilantro. Divide among plates and serve with the tortillas and sour cream.";
        }

    }

    private void flakesOptions() {
        if (_optionNum == 1) {
            _breakFast = "Ingredients\n" +
                    "1/3 cup quinoa flakes\n" +
                    "1 cup water\n" +
                    "1 tablespoon nut/seed butter\n" +
                    "1/2 cup frozen blueberries (fresh will work but you won’t get the same color)\n" +
                    "1/2 scoop protein powder (optional)\n" +
                    "Pinch of cinnamon\n" +
                    "Sweetener of choice (optional)\n" +
                    "\n" +
                    "Instructions\n" +
                    "Add all ingredients into a small sauce pan. Bring to a boil, reduce to simmer and cook until thickened, 60 – 90 seconds.\n" +
                    "Serve immediately.\n" +
                    "\n";
        }
        if (_optionNum == 2) {
            _breakFast = "Ingredients\n" +
                    "1 flax egg (1 tablespoon flaxseed meal + 3 tablespoons water)\n" +
                    "1/2 cup cashew butter (or nut/seed butter of choice)\n" +
                    "1/4 cup pure maple syrup\n" +
                    "1 medium banana, mashed\n" +
                    "1 teaspoon vanilla extract\n" +
                    "1/2 cup rolled oats\n" +
                    "1/2 cup quinoa flakes\n" +
                    "1 teaspoon baking powder\n" +
                    "1 teaspoon cinnamon\n" +
                    "1/2 teaspoon nutmeg\n" +
                    "1/4 teaspoon salt\n" +
                    "3/4 cup shredded carrots\n" +
                    "1/4 cup chopped walnuts (optional)\n" +
                    "\n" +
                    "Instructions\n" +
                    "Preheat oven to 350 degrees F. Line a baking sheet with parchment paper and set aside.\n" +
                    "Whisk together the flaxseed meal and water, and set aside.\n" +
                    "Beat together cashew butter, syrup, banana and vanilla in a large bowl. Add flax egg and mix to combine.\n" +
                    "Pour in oats, quinoa flakes, baking powder, spices and salt to the bowl and stir together. Fold in shredded carrots and walnuts.\n" +
                    "Drop 2 tablespoons of dough onto the baking sheet and repeat until no dough remains.\n" +
                    "Bake cookies on center rack for 15 – 18 minutes until edges are golden brown. Remove and let cool on the pan for 5 minutes then transfer to a wire rack and cool completely.\n" +
                    "Enjoy at room temp or slightly reheated in a microwave.";
        }

        if (_optionNum == 3) {
            _breakFast = "Ingredients\n" +
                    "1/2 cup cooked quinoa\n" +
                    "1/4 cup chia seeds\n" +
                    "1/4 cup hemp hearts\n" +
                    "1/2 teaspoon vanilla powder (or 1 teaspoon vanilla extract)\n" +
                    "2 dashes of stevia (or use 1/4 cup of maple syrup)\n" +
                    "Pinch of cinnamon\n" +
                    "1 1/2 cups full-fat coconut milk\n" +
                    "2 cups sliced strawberries\n" +
                    "\n" +
                    "Instructions\n" +
                    "Add all ingredients (minus strawberries) to one large jar and stir together. Tighten lid and place in the fridge overnight.\n" +
                    "Remove from fridge and arrange in two jars with sliced strawberries. Serve immediately and enjoy!";
        }
        if (_optionNum == 4) {
            _breakFast = "Ingredients\n" +
                    "1/4 cup coconut oil\n" +
                    "1/4 cup pure maple syrup\n" +
                    "1/3 cup unsweetened cocoa powder\n" +
                    "1/2 cup almond butter (or nut/seed butter of choice)\n" +
                    "1/2 cup cooked quinoa\n" +
                    "1/2 cup quinoa flakes\n" +
                    "1/2 cup coconut flakes\n" +
                    "Coarse sea salt for sprinkling (optional, but recommended!)\n" +
                    "\n" +
                    "Instructions\n" +
                    "Line baking sheet with parchment paper and set aside.\n" +
                    "In a small sauce pan over medium, melt together coconut oil, syrup and cocoa powder. Whisk until combined. Add the almond butter and stir again until smooth.\n" +
                    "Remove saucepan from the heat and fold in the quinoa, quinoa flakes and coconut flakes.\n" +
                    "Using a cookie scoop, drop the mixture onto the prepared baking sheet, shaping slightly with your hands if desired. Sprinkle with sea salt and place in the freezer to set for about 30 minutes.\n" +
                    "Store in an airtight container in the freezer for best results, but can also be stored in the fridge (they’ll just be a lot softer!).";
        }
        if (_optionNum == 5) {
            _breakFast = "Ingredients\n" +
                    "1 cup dried Turkish figs\n" +
                    "1/2 cup organic peanut butter (creamy or chunky is fine)\n" +
                    "3 – 4 tablespoons maple syrup\n" +
                    "2 – 4 tablespoons water\n" +
                    "1 1/2 cups quinoa flakes\n" +
                    "\n" +
                    "Instructions\n" +
                    "Preheat the oven to 325 degrees F. Line a square baking dish (either 8 x 8 or 9 x 9) with parchment paper and set die.\n" +
                    "Add figs to a food processor and process until they are broken down and resemble small crumbles. Add peanut butter and maple syrup (for for 4 tablespoons if you want them more on the sweet side) and process again until a dough begins to form into a large ball.\n" +
                    "Add water, 1 tablespoon at a time until the dough loosens from the ball and spreads out inside the bowl.\n" +
                    "Add quinoa flakes and pulse to combine.\n" +
                    "Transfer dough into prepared baking dish and press down firmly with your hands. You want the dough to be as uniform as possible in terms of the thickness so they bake evenly.\n" +
                    "Bake bars on center rack for 25 – 30 minutes until the edges begin to brown and they are no longer sticky.\n" +
                    "Remove and let cool completely in the pan. Transfer to a cutting board, carefully (gently) slice them into bars and transfer to a wire rack until bars have firmed up.\n" +
                    "Store bars in an airtight container in the fridge for ultimate freshness!";
        }
        if (_optionNum == 6) {
            _breakFast = "Ingredients\n" +
                    "1 tablespoon flaxseed meal\n" +
                    "3 tablespoons water\n" +
                    "1/2 cup mashed banana (1 large, 2 small)\n" +
                    "3/4 cup pumpkin puree\n" +
                    "1/4 cup non-dairy milk\n" +
                    "1/4 cup maple syrup\n" +
                    "1 1/4 cup oat flour (oats ground in a blender)\n" +
                    "1/2 cup quinoa flakes\n" +
                    "1/2 cup blanched almond flour\n" +
                    "1/4 cup coconut sugar\n" +
                    "2 teaspoons baking powder\n" +
                    "1 teaspoon cinnamon\n" +
                    "1/2 teaspoon vanilla bean powder (or 1 teaspoon extract)\n" +
                    "1/2 teaspoon nutmeg\n" +
                    "1/4 teaspoon ginger\n" +
                    "1/4 teaspoon salt\n" +
                    "\n" +
                    "Instructions\n" +
                    "Heat the oven to 350ºF. Grease a 12-cup muffin tin and set aside.\n" +
                    "Combine the flax and water and set aside to gel while you prepare the remaining ingredients.\n" +
                    "Whisk together the dry ingredients (minus vanilla extract if using) in a large mixing bowl.\n" +
                    "In a separate bowl, beat together banana, pumpkin, milk and syrup. Whisk in flax egg and pour wet ingredients into dry. Stir to thoroughly combine (the batter will be kind of thick, but still stirable and soft).\n" +
                    "Fill each cup ¾ of the way full. Add water to the ones that are unused. Sprinkle the tops of the muffins with pumpkin seeds and quinoa flakes if desired.\n" +
                    "Bake on the center rack for 23 – 25 minutes until a cake tester inserted into the center comes out clean.\n" +
                    "Cool in the pan for 5 minutes, then transfer to a wire rack and cool completely. If desired, reheat in the toaster oven or in the microwave.";
        }
        if (_optionNum == 7) {
            _breakFast = "Ingredients\n" +
                    "1 cup almond flour (you can make your own using this method)\n" +
                    "1 cup quinoa Ancient Harvest flakes\n" +
                    "1/2 cup oat flour (made from ground gluten-free oats)\n" +
                    "1/2 teaspoon baking powder\n" +
                    "1/2 teaspoon salt\n" +
                    "1/2 cup creamy peanut butter\n" +
                    "1/4 cup honey or maple syrup\n" +
                    "1/4 cup water\n" +
                    "1 batch homemade nutella (I used the Oh She Glows recipe exactly)\n" +
                    "\n" +
                    "Instructions\n" +
                    "Preheat the oven to 350 degrees F.\n" +
                    "In the bowl of a food processor, pulse together the dry ingredients.\n" +
                    "Quickly melt together the wet ingredients either on the stove or in the microwave. Stir until smooth and combined. Add to the food processor and pulse until a dough begins to form.\n" +
                    "Dump the dough onto a parchment lined surface. Lightly dust a rolling pin with oat flour and gently roll the ball out until it’s about ⅛” thick.\n" +
                    "Cut the dough into square crackers using a pizza cutter. Prick the top of each cracker with a fork or skewer (this will help them no bubble up in the oven).\n" +
                    "Bake the crackers for 12 – 14 minutes, until they’re starting to brown and feel a little crispy. Remove from the oven and let cool completely.\n" +
                    "Once cooled, smear one cracker with 1 – 2 teaspoons of nutella and layer another cracker on top. Store in an airtight container for up to 3 days.";
        }
    }

    private void dairyOptions() {
        if (_optionNum == 1) {
            _breakFast = "Ingredients\n" +
                    "1 (16 ounce) package elbow macaroni \n" +
                    "1/4 cup butter \n" +
                    "1/4 cup all-purpose flour \n" +
                    "1/4 teaspoon dried thyme \n" +
                    "1/4 teaspoon cayenne pepper \n" +
                    "1/8 teaspoon white pepper\n" +
                    "3 cups milk \n" +
                    "1 pinch ground nutmeg \n" +
                    "1/4 teaspoon Worcestershire sauce \n" +
                    "1 teaspoon salt \n" +
                    "3 cups shredded sharp Cheddar cheese, divided 1 teaspoon Dijon mustard \n" +
                    "1/2 cup panko bread crumbs 1 tablespoon butter, melted\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 400 degrees F (200 degrees C).\n" +
                    "Fill a large pot with lightly salted water and bring to a rolling boil over high heat. Once the water is boiling, stir in the macaroni, and return to a boil. Cook the pasta uncovered, stirring occasionally, until the pasta is cooked through but still slightly firm, about 8 minutes. Drain well.\n" +
                    "Melt 1/4 cup butter in a large saucepan over medium heat. When the butter starts to foam and bubble, stir in the flour; cook on medium heat until flour just begins to turn pale yellow, 3 to 4 minutes. Add thyme, cayenne pepper, and white pepper; cook and stir another minute, then whisk in 1 cup of milk until smooth. Pour in remaining milk and whisk again. Bring the sauce just to a simmer.\n" +
                    "Stir in nutmeg, Worcestershire sauce, and salt; simmer on medium-low heat until thickened, about 8 minutes, whisking often. Turn heat off, then add 2 1/4 cups of Cheddar cheese; stir until melted and combined. Add Dijon mustard.\n" +
                    "Transfer the macaroni into a casserole dish, then pour in the cheese sauce; stir to thoroughly combine sauce with pasta. Mix panko bread crumbs and 1 tablespoon melted butter in a small bowl, and sprinkle crumbs on top of macaroni and cheese. Sprinkle remaining 3/4 cup of Cheddar cheese on top.\n" +
                    "Bake in the preheated oven until bread crumbs and Cheddar cheese topping are golden brown, about 20 minutes.";
        }
        if (_optionNum == 2) {
            _breakFast = "Ingridients\n" +
                    "4 Yukon Gold potatoes \n" +
                    "1 tablespoon cornmeal \n" +
                    "1 1/2 pounds prepared pizza dough \n" +
                    "1 cup prepared basil pesto sauce salt and ground black pepper to taste \n" +
                    "1 cup finely grated Parmigiano-Reggiano cheese \n" +
                    "6 ounces shredded Fontina cheese \n" +
                    "1/2 red onion, thinly sliced \n" +
                    "4 ounces crumbled feta cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "Scrub and dry potatoes, then prick several times with a fork and place onto a baking sheet. Bake in the preheated oven until the potatoes are easily pierced with a fork, 50 minutes to 1 hour. Remove, cool, and cut into slices about 1/4-inch thick.\n" +
                    "Sprinkle cornmeal over a half sheet pan. Stretch pizza dough over cornmeal to fit the pan; spread pesto sauce over dough.\n" +
                    "Lay potatoes over the pesto in a single layer; season with salt and pepper to taste and sprinkle Parmigiano-Reggiano cheese over potatoes. Sprinkle Fontina cheese, red onion slices, and feta cheese on top.\n" +
                    "Bake in the preheated oven on the bottom rack for 10 minutes. Transfer pan to the middle rack and bake until crust is light golden and crisp, 5 to 7 minutes.";
        }
        if (_optionNum == 3) {
            _breakFast = "Ingredients\n" +
                    "1 (8 ounce) package elbow macaroni \n" +
                    "1 (8 ounce) package shredded sharp Cheddar cheese \n" +
                    "1 (12 ounce) container small curd cottage cheese \n" +
                    "1 (8 ounce) container sour cream\n" +
                    "1/4 cup grated Parmesan cheese salt and pepper to taste \n" +
                    "1 cup dry bread crumbs \n" +
                    "1/4 cup butter, melted\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 350 degrees F (175 degrees C). Bring a large pot of lightly salted water to a boil, add pasta, and cook until done; drain.\n" +
                    "In 9x13 inch baking dish, stir together macaroni, shredded Cheddar cheese, cottage cheese, sour cream, Parmesan cheese, salt and pepper. In a small bowl, mix together bread crumbs and melted butter. Sprinkle topping over macaroni mixture.\n" +
                    "Bake 30 to 35 minutes, or until top is golden.";
        }
        if (_optionNum == 4) {
            _breakFast = "Ingredients\n" +
                    "5 potatoes\n" +
                    "peeled and cubed 1 small onion \n" +
                    "chopped 1 1/2 cups chive-flavored cottage cheese\n" +
                    "1 cup sour cream\n" +
                    "1 cup shredded Cheddar cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Place potatoes in a large pot of water and boil until tender when pierced with a fork.\n" +
                    "Preheat oven to 350 degrees F (175 degrees C). Butter a 9x3 inch casserole dish.\n" +
                    "In a large mixing bowl, combine potatoes, onion, cottage cheese, and sour cream. Transfer mixture to the prepared casserole dish. Top with Cheddar cheese.\n" +
                    "Bake at 350 degrees F (175 degrees C) for 30 to 40 minutes.";
        }
        if (_optionNum == 5) {
            _breakFast = "Ingredients\n" +
                    "1 (8 ounce) package large egg noodles\n" +
                    "6 tablespoons butter\n" +
                    "sliced 6 eggs, \n" +
                    "separated 1/2 cup white sugar 3/4 (8 ounce) package cream cheese,\n" +
                    " softened 4 tablespoons sour cream \n" +
                    "1 (16 ounce) package cottage cheese, creamed 1 pinch salt \n" +
                    "4 tablespoons butter, \n" +
                    "melted 1/4 cup white sugar \n" +
                    "1/3 cup graham cracker crumbs\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 350 degrees F (175 degrees C). Grease a 9x13 inch glass baking dish.\n" +
                    "Bring a large pot of lightly salted water to a boil. Add pasta and cook for 8 to 10 minutes or until al dente; drain and stir in 6 tablespoons sliced butter.\n" +
                    "In a medium bowl beat egg yolks with sugar and cream cheese; stir into noodles and add sour cream, cottage cheese and salt. Beat egg whites until stiff and fold into mixture. Transfer mixture to prepared dish.\n" +
                    "In a small bowl combine melted butter, 1/4 cup sugar, and graham cracker crumbs. Sprinkle over noodle mixture.\n" +
                    "Bake in preheated oven for 1 hour.";
        }
        if (_optionNum == 6) {
            _breakFast = "Ingredients\n" +
                    "10 eggs, beaten \n" +
                    "1/2 cup all-purpose flour \n" +
                    "1 teaspoon baking powder \n" +
                    "1 pinch salt \n" +
                    "1 (7 ounce) can diced green chile peppers, drained \n" +
                    "1 (16 ounce) container low-fat cottage cheese \n" +
                    "1 cup shredded Cheddar cheese \n" +
                    "1/4 cup melted butter\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 400 degrees F (200 degrees C). Lightly grease a 9x13 inch baking dish.\n" +
                    "In a large bowl, mix the eggs, flour, baking powder, and salt. Stir in the green chile peppers, cottage cheese, Cheddar cheese, and melted butter. Pour into the prepared baking dish.\n" +
                    "Bake 15 minutes in the preheated oven. Reduce heat to 325 degrees F (165 degrees C), and continue baking for 35 to 40 minutes. Cool slightly, and cut into small squares.";
        }
        if (_optionNum == 7) {
            _breakFast = "Ingredients\n" +
                    "1/2 cup cottage cheese\n" +
                    "2 teaspoons honey\n" +
                    "1 banana, sliced\n" +
                    "\n" +
                    "Directions\n" +
                    "In a small serving bowl, stir together the cottage cheese, honey, and banana slices. Serve or eat immediately.";
        }
    }

    private void porkOptions() {
        if (_optionNum == 1) {
            _lunch = "Ingredients\n" +
                    "2 (15 ounce) cans chicken broth \n" +
                    "1/2 cup sliced carrots \n" +
                    "2 tablespoons chicken bouillon granules \n" +
                    "3 bay leaves 1/2 teaspoon sea salt \n" +
                    "1/2 teaspoon ground black pepper \n" +
                    "1/2 teaspoon ground thyme \n" +
                    "1/2 teaspoon dried marjoram \n" +
                    "1/4 teaspoon garlic powder \n" +
                    "1 cup peeled and diced potatoes \n" +
                    "1/2 cup chopped onion \n" +
                    "1/2 cup sliced celery \n" +
                    "3 tablespoons butter \n" +
                    "3 tablespoons all-purpose flour \n" +
                    "1 1/2 cups milk \n" +
                    "1 (15 ounce) can cream-style corn \n" +
                    "1 (8 ounce) package shredded sharp Cheddar cheese 1 cup diced cooked ham\n" +
                    "\n" +
                    "Directions\n" +
                    "Stir chicken broth, carrots, chicken bouillon, bay leaves, sea salt, pepper, thyme, marjoram, and garlic powder together in a Dutch oven; bring to a boil, reduce heat to medium, and cook for 10 minutes. Add potatoes and onion; cook for 10 minutes more. Add celery; cook until all vegetables are fork tender, about 10 minutes more.\n" +
                    "Melt butter in a saucepan over low heat. Remove from heat and whisk flour into butter until smooth. Return saucepan to medium heat; gradually add milk to butter mixture, whisking constantly, and cook until mixture thickens, 6 to 7 minutes.\n" +
                    "Stir milk mixture into vegetable mixture; add corn, Cheddar cheese, and ham, reduce heat to low, and simmer until ham is heated through and cheese melts, 10 to 15 minutes.";
        }
        if (_optionNum == 2) {
            _lunch = "Ingredients\n" +
                    "5 ounces bucatini pasta \n" +
                    "1/4 cup extra-virgin olive oil \n" +
                    "3 crushed garlic cloves \n" +
                    "1 1/2 ounces guanciale (cured pork cheek), sliced \n" +
                    "1/4 cup sliced red onion \n" +
                    "1 pinch red pepper flakes \n" +
                    "1/2 (8 ounce) can crushed San Marzano tomatoes salt and ground black pepper to taste \n" +
                    "1 ounce freshly grated Pecorino Romano cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Fill a large pot with lightly salted water and bring to a rolling boil. Stir in bucatini and return to a boil. Cook, uncovered, stirring occasionally, until bucatini is tender, about 11 minutes. Drain.\n" +
                    "Heat oil in a large skillet over medium-high heat. Add garlic cloves; cook until golden brown, about 1 minute. Remove with a slotted spoon and discard. Add guanciale; cook and stir until crisp and golden, about 4 minutes. Add onion and red pepper flakes; cook and stir until onion is translucent, about 3 minutes. Stir in tomatoes, salt, and black pepper. Simmer tomato sauce until flavors combine, about 10 minutes.\n" +
                    "Stir bucatini and Pecorino Romano cheese into tomato sauce and toss until evenly coated.\n" +
                    "\n";
        }
        if (_optionNum == 3) {
            _lunch = "Ingredients\n" +
                    "3 tablespoons brown sugar \n" +
                    "3 tablespoons paprika \n" +
                    "1 1/2 tablespoons garlic powder (such as McCormick® California Style) \n" +
                    "1 1/2 tablespoons ground black pepper \n" +
                    "1 1/2 teaspoons salt \n" +
                    "1/2 cup Dijon mustard (such as Hellmann's®) 8 pounds pork shoulder roast (butt roast), rind removed \n" +
                    "1/2 cup barbeque sauce, or to taste \n" +
                    "18 large hamburger buns, split\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 250 degrees F (120 degrees C).\n" +
                    "Mix brown sugar, paprika, garlic powder, black pepper, and salt in a bowl. Spread mustard over pork roast and sprinkle with brown sugar mixture, using the entire amount. Line a shallow baking dish with aluminum foil. Place a rack in the prepared baking dish and arrange pork roast on rack.\n" +
                    "Bake in the preheated oven until very tender, 9 to 11 hours. Let pork cool, then shred into bite-size pieces. Stir barbeque sauce into pork to moisten; serve with hamburger buns.";
        }
        if (_optionNum == 4) {
            _lunch = "Ingredients\n" +
                    "4 pork chops salt and pepper to taste \n" +
                    "1 pinch garlic salt, or to taste \n" +
                    "1 onion, chopped \n" +
                    "1/2 pound fresh mushrooms, sliced \n" +
                    "1 (10.75 ounce) can condensed cream of mushroom soup\n" +
                    "\n" +
                    "Directions\n" +
                    "Season pork chops with salt, pepper, and garlic salt to taste.\n" +
                    "In a large skillet, brown the chops over medium-high heat. Add the onion and mushrooms, and saute for one minute. Pour cream of mushroom soup over chops. Cover skillet, and reduce temperature to medium-low. Simmer 20 to 30 minutes, or until chops are cooked through.";
        }
        if (_optionNum == 5) {
            _lunch = "Ingredients\n" +
                    "1 (2 pound) pork tenderloin \n" +
                    "1 (12 fluid ounce) can or bottle root beer 1 (18 ounce) bottle your favorite barbecue sauce \n" +
                    "8 hamburger buns, split and lightly toasted\n" +
                    "\n" +
                    "Directions\n" +
                    "Place the pork tenderloin in a slow cooker; pour the root beer over the meat. Cover and cook on low until well cooked and the pork shreds easily, 6 to 7 hours. Note: the actual length of time may vary according to individual slow cooker. Drain well. Stir in barbecue sauce. Serve over hamburger buns.";
        }
        if (_optionNum == 6) {
            _lunch = "Ingredients\n" +
                    "1 (12 ounce) package bow tie pasta \n" +
                    "2 tablespoons olive oil \n" +
                    "1 pound sweet Italian sausage, casings removed and crumbled \n" +
                    "1/2 teaspoon red pepper flakes \n" +
                    "1/2 cup diced onion \n" +
                    "3 cloves garlic, minced \n" +
                    "1 (28 ounce) can Italian-style plum tomatoes, drained and coarsely chopped \n" +
                    "1 1/2 cups heavy cream \n" +
                    "1/2 teaspoon salt\n" +
                    "3 tablespoons minced fresh parsley\n" +
                    "\n" +
                    "Directions\n" +
                    "Bring a large pot of lightly salted water to a boil. Cook pasta in boiling water for 8 to 10 minutes, or until al dente; drain.\n" +
                    "Heat oil in a large, deep skillet over medium heat. Cook sausage and pepper flakes until sausage is evenly brown. Stir in onion and garlic, and cook until onion is tender. Stir in tomatoes, cream, and salt. Simmer until mixture thickens, 8 to 10 minutes.\n" +
                    "Stir cooked pasta into sauce, and heat through. Sprinkle with parsley.";
        }
        if (_optionNum == 7) {
            _lunch = "Ingredients\n" +
                    "3 eggs, lightly beaten \n" +
                    "3 tablespoons milk \n" +
                    "1 1/2 cups Italian seasoned bread crumbs 1/2 cup grated Parmesan cheese \n" +
                    "2 tablespoons dried parsley \n" +
                    "2 tablespoons olive oil \n" +
                    "4 cloves garlic, peeled and chopped \n" +
                    "4 pork chops\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 325 degrees F (160 degrees C).\n" +
                    "In a small bowl, beat together the eggs and milk. In a separate small bowl, mix the bread crumbs, Parmesan cheese, and parsley.\n" +
                    "Heat the olive oil in a large, oven-proof skillet over medium heat. Stir in the garlic, and cook until lightly browned. Remove garlic, reserving for other uses.\n" +
                    "Dip each pork chop into the egg mixture, then into the bread crumb mixture, coating evenly. Place coated pork chops in the skillet, and brown abut 5 minutes on each side.\n" +
                    "Place the skillet and pork chops in the preheated oven, and cook 25 minutes, or to an internal temperature of 145 degrees F (63 degrees C).";
        }
    }

    private void fishOptions() {
        if (_optionNum == 1) {
            _lunch = "Ingredients\n" +
                    "4 (4 ounce) fillets tilapia\n" +
                    "salt and pepper to taste \n" +
                    "1 tablespoon Cajun seasoning, or to taste 1 lemon, thinly sliced \n" +
                    "1/4 cup mayonnaise \n" +
                    "1/2 cup sour cream \n" +
                    "1/8 teaspoon garlic powder \n" +
                    "1 teaspoon fresh lemon juice \n" +
                    "2 tablespoons chopped fresh dill\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat the oven to 350 degrees F (175 degrees C). Lightly grease a 9x13 inch baking dish.\n" +
                    "Season the tilapia fillets with salt, pepper and Cajun seasoning on both sides. Arrange the seasoned fillets in a single layer in the baking dish. Place a layer of lemon slices over the fish fillets. I usually use about 2 slices on each piece so that it covers most of the surface of the fish.\n" +
                    "Bake uncovered for 15 to 20 minutes in the preheated oven, or until fish flakes easily with a fork.\n" +
                    "While the fish is baking, mix together the mayonnaise, sour cream, garlic powder, lemon juice and dill in a small bowl. Serve with tilapia.";
        }
        if (_optionNum == 2) {
            _lunch = "Ingredients\n" +
                    "\n" +
                    "2 tablespoons olive oil \n" +
                    "1/2 white onion, diced \n" +
                    "3 cloves garlic, minced \n" +
                    "1 tablespoon capers \n" +
                    "1 tablespoon caper juice \n" +
                    "1 cup cherry tomatoes, halved \n" +
                    "1/3 cup pitted, sliced green olives (such as Castelvetrano) \n" +
                    "1 jalapeno pepper, seeded and chopped \n" +
                    "2 teaspoons chopped fresh oregano \n" +
                    "2 teaspoons olive oil \n" +
                    "2 (7 ounce) red snapper fillets, cut in half salt and pepper to taste \n" +
                    "1/2 teaspoon cayenne pepper, or more to taste \n" +
                    "2 limes, juiced\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "Heat olive oil in a skillet over medium heat. Stir in onion; cook and stir until onions begin to turn translucent, 6 to 7 minutes.\n" +
                    "Cook and stir in garlic until fragrant, about 30 seconds. Add capers and caper juice; stir to combine.\n" +
                    "Stir in tomatoes, olives, jalapeno pepper, . Cook and stir until jalapeno pepper softens and tomatoes begin to collapse, about 3 minutes. Remove from heat; stir in oregano.\n" +
                    "Drizzle 1 teaspoon olive oil into a small baking dish. Sprinkle in 1 tablespoon of the tomato-olive mixture. Top with 1 snapper fillet, salt, black pepper, and cayenne pepper. Top with more filling and juice from 1 lime. Repeat with remaining snapper fillet, seasoning, and lime juice in a second baking dish.\n" +
                    "Bake in the preheated oven until fish is flaky and no longer translucent, 15 to 20 minutes.";
        }
        if (_optionNum == 3) {
            _lunch = "Ingredients\n" +
                    "1/4 cup maple syrup \n" +
                    "2 tablespoons soy sauce \n" +
                    "1 clove garlic, minced \n" +
                    "1/4 teaspoon garlic salt \n" +
                    "1/8 teaspoon ground black pepper \n" +
                    "1 pound salmon\n" +
                    "\n" +
                    "Directions\n" +
                    "In a small bowl, mix the maple syrup, soy sauce, garlic, garlic salt, and pepper.\n" +
                    "Place salmon in a shallow glass baking dish, and coat with the maple syrup mixture. Cover the dish, and marinate salmon in the refrigerator 30 minutes, turning once.\n" +
                    "Preheat oven to 400 degrees F (200 degrees C).\n" +
                    "Place the baking dish in the preheated oven, and bake salmon uncovered 20 minutes, or until easily flaked with a fork.";
        }
        if (_optionNum == 4) {
            _lunch = "Ingredients\n" +
                    "1 (12 ounce) package egg noodles \n" +
                    "1/4 cup chopped onion \n" +
                    "2 cups shredded Cheddar cheese \n" +
                    "1 cup frozen green peas \n" +
                    "2 (5 ounce) cans tuna, drained \n" +
                    "2 (10.75 ounce) cans condensed cream of mushroom soup \n" +
                    "1/2 (4.5 ounce) can sliced mushrooms 1 cup crushed potato chips\n" +
                    "\n" +
                    "Directions\n" +
                    "Bring a large pot of lightly salted water to a boil. Cook pasta in boiling water for 8 to 10 minutes, or until al dente; drain.\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "In a large bowl, thoroughly mix noodles, onion, 1 cup cheese, peas, tuna, soup and mushrooms. Transfer to a 9x13 inch baking dish, and top with potato chip crumbs and remaining 1 cup cheese.\n" +
                    "Bake for 15 to 20 minutes in the preheated oven, or until cheese is bubbly.";
        }
        if (_optionNum == 5) {
            _lunch = "Ingredients\n" +
                    "6 cloves garlic, peeled, divided \n" +
                    "3/4 cup mayonnaise \n" +
                    "5 anchovy fillets, minced \n" +
                    "6 tablespoons grated Parmesan cheese, divided \n" +
                    "1 teaspoon Worcestershire sauce \n" +
                    "1 teaspoon Dijon mustard \n" +
                    "1 tablespoon lemon juice, or more to taste salt to taste ground black pepper to taste 1/4 cup olive oil \n" +
                    "4 cups day-old bread, cubed \n" +
                    "1 head romaine lettuce, torn into bite-size pieces\n" +
                    "\n" +
                    "Directions\n" +
                    "Mince 3 cloves of garlic, and combine in a small bowl with mayonnaise, anchovies, 2 tablespoons of the Parmesan cheese, Worcestershire sauce, mustard, and lemon juice. Season to taste with salt and black pepper. Refrigerate until ready to use.\n" +
                    "Heat oil in a large skillet over medium heat. Cut the remaining 3 cloves of garlic into quarters, and add to hot oil. Cook and stir until brown, and then remove garlic from pan. Add bread cubes to the hot oil. Cook, turning frequently, until lightly browned. Remove bread cubes from oil, and season with salt and pepper.\n" +
                    "Place lettuce in a large bowl. Toss with dressing, remaining Parmesan cheese, and seasoned bread cubes.";
        }
        if (_optionNum == 6) {
            _lunch = "Ingredients\n" +
                    "\n" +
                    "1/2 cup butter, divided \n" +
                    "1 (8 ounce) package uncooked medium egg noodles \n" +
                    "1/2 medium onion, finely chopped \n" +
                    "1 stalk celery, finely chopped \n" +
                    "1 clove garlic, minced \n" +
                    "8 ounces button mushrooms, sliced \n" +
                    "1/4 cup all-purpose flour \n" +
                    "2 cups milk salt and pepper to taste \n" +
                    "2 (5 ounce) cans tuna, drained and flaked \n" +
                    "1 cup frozen peas, thawed \n" +
                    "3 tablespoons bread crumbs \n" +
                    "2 tablespoons butter, melted \n" +
                    "1 cup shredded Cheddar cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 375 degrees F (190 degrees C). Butter a medium baking dish with 1 tablespoon butter.\n" +
                    "Bring a large pot of lightly salted water to a boil. Add egg noodles, cook for 8 to 10 minutes, until al dente, and drain.\n" +
                    "Melt 1 tablespoon butter in a skillet over medium-low heat. Stir in the onion, celery, and garlic, and cook 5 minutes, until tender. Increase heat to medium-high, and mix in mushrooms. Continue to cook and stir 5 minutes, or until most of the liquid has evaporated.\n" +
                    "Melt 4 tablespoons butter in a medium saucepan, and whisk in flour until smooth. Gradually whisk in milk, and continue cooking 5 minutes, until sauce is smooth and slightly thickened. Season with salt and pepper. Stir in tuna, peas, mushroom mixture, and cooked noodles. Transfer to the baking dish. Melt remaining 2 tablespoons butter in a small bowl, mix with bread crumbs, and sprinkle over the casserole. Top with cheese.\n" +
                    "Bake 25 minutes in the preheated oven, or until bubbly and lightly browned.";
        }
        if (_optionNum == 7) {
            _lunch = "Ingredients\n" +
                    "3/4 cup grated Parmesan cheese \n" +
                    "2 teaspoons paprika \n" +
                    "1 tablespoon chopped fresh parsley salt and ground black pepper to taste \n" +
                    "4 tilapia fillets olive oil\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 400 degrees F (200 degrees C). Line a baking sheet with aluminum foil.\n" +
                    "Whisk Parmesan cheese, paprika, parsley, salt, and pepper together in a shallow dish.\n" +
                    "Coat tilapia fillets with olive oil and press into the Parmesan cheese mixture. Arrange coated fillets on the prepared baking sheet.\n" +
                    "Bake in preheated oven until the fish flakes easily with a fork, 10 to 12 minutes.";
        }
    }

    private void beefOptions() {
        if (_optionNum == 1) {
            _lunch = "Ingredients\n" +
                    "1 pound ground beef \n" +
                    "2 cups elbow macaroni \n" +
                    "1/2 large green bell pepper, coarsely chopped \n" +
                    "1/2 large onion, chopped \n" +
                    "1 (16 ounce) can tomato sauce \n" +
                    "1 pound tomatoes, coarsely chopped \n" +
                    "2 teaspoons Worcestershire sauce \n" +
                    "1 teaspoon soy sauce \n" +
                    "1 teaspoon salt \n" +
                    "3/4 teaspoon dried basil \n" +
                    "3/4 teaspoon dried oregano \n" +
                    "1/2 teaspoon ground black pepper \n" +
                    "1/2 teaspoon chili powder \n" +
                    "1/4 teaspoon garlic powder \n" +
                    "1/8 teaspoon hot pepper sauce (such as Tabasco®) \n" +
                    "1 cup beef broth\n" +
                    "\n" +
                    "Directions\n" +
                    "Cook beef in large skillet over medium heat, stirring occasionally, until browned, about 5 minutes. Transfer beef to a bowl.\n" +
                    "Cook macaroni, bell pepper, and onion in the same skillet over medium heat for 3 minutes. Add cooked beef, tomato sauce, tomatoes, Worcestershire sauce, soy sauce, salt, basil, oregano, ground black pepper, chili powder, garlic powder, and hot pepper sauce. Pour in beef broth. Cover skillet and simmer until macaroni is tender, about 15 minutes. Remove lid and simmer, stirring occasionally, until thickened, 5 to 10 minutes.";
        }
        if (_optionNum == 2) {
            _lunch = "Ingredients\n" +
                    "2 pounds lean ground beef \n" +
                    "1/4 cup olive oil \n" +
                    "1/2 onion, chopped \n" +
                    "1/2 green bell pepper, chopped \n" +
                    "2 tablespoons minced garlic \n" +
                    "2 (8 ounce) cans tomato sauce \n" +
                    "2 cups water \n" +
                    "1/2 cup red cooking wine \n" +
                    "3 tablespoons hot sauce (such as Louisiana®) \n" +
                    "1 (1.41 ounce) package sazon seasoning (such as Badia® Tropical®) \n" +
                    "1 tablespoon chopped fresh parsley \n" +
                    "1/2 teaspoon garlic powder \n" +
                    "1/2 teaspoon onion powder \n" +
                    "1/2 teaspoon ground cumin \n" +
                    "1/2 teaspoon ground black pepper \n" +
                    "1/4 teaspoon ground bay leaf \n" +
                    "3 ounces Spanish-style olives \n" +
                    "1 teaspoon salt, or to taste \n" +
                    "1 small butternut squash, peeled and cut into cubes\n" +
                    "\n" +
                    "Directions\n" +
                    "Cook and stir ground beef in a large stockpot until browned, 5 to 10 minutes. Drain grease.\n" +
                    "Heat olive oil in small skillet over medium heat. Add onion, green bell pepper, and garlic; cook and stir until fragrant, 2 to 3 minutes. Stir into beef in the stockpot.\n" +
                    "Pour tomato sauce, water, cooking wine, and hot sauce into the stockpot. Stir in sazon seasoning, parsley, garlic powder, onion powder, cumin, pepper, and bay leaf. Bring to a boil; reduce heat to low and simmer picadillo, uncovered, until slightly thickened, about 10 minutes.\n" +
                    "Split olives in half with your fingers and stir into the picadillo. Add squash. Simmer until liquid reduces but picadillo is not dry, 45 to 60 minutes. Season with salt.\n";
        }
        if (_optionNum == 3) {
            _lunch = "Ingredients\n" +
                    "2 pounds ground beef chuck \n" +
                    "1 pound bulk Italian sausage \n" +
                    "3 (15 ounce) cans chili beans, drained \n" +
                    "1 (15 ounce) can chili beans in spicy sauce \n" +
                    "2 (28 ounce) cans diced tomatoes with juice \n" +
                    "1 (6 ounce) can tomato paste \n" +
                    "1 large yellow onion, chopped \n" +
                    "3 stalks celery, chopped \n" +
                    "1 green bell pepper, seeded and chopped 1 red bell pepper, seeded and chopped \n" +
                    "2 green chile peppers, seeded and chopped \n" +
                    "1 tablespoon bacon bits \n" +
                    "4 cubes beef bouillon \n" +
                    "1/2 cup beer \n" +
                    "1/4 cup chili powder \n" +
                    "1 tablespoon Worcestershire sauce \n" +
                    "1 tablespoon minced garlic \n" +
                    "1 tablespoon dried oregano \n" +
                    "2 teaspoons ground cumin \n" +
                    "2 teaspoons hot pepper sauce (e.g. Tabasco™) \n" +
                    "1 teaspoon dried basil \n" +
                    "1 teaspoon salt \n" +
                    "1 teaspoon ground black pepper \n" +
                    "1 teaspoon cayenne pepper \n" +
                    "1 teaspoon paprika 1 teaspoon white sugar \n" +
                    "1 (10.5 ounce) bag corn chips such as Fritos® \n" +
                    "1 (8 ounce) package shredded Cheddar cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Heat a large stock pot over medium-high heat. Crumble the ground chuck and sausage into the hot pan, and cook until evenly browned. Drain off excess grease.\n" +
                    "Pour in the chili beans, spicy chili beans, diced tomatoes and tomato paste. Add the onion, celery, green and red bell peppers, chile peppers, bacon bits, bouillon, and beer. Season with chili powder, Worcestershire sauce, garlic, oregano, cumin, hot pepper sauce, basil, salt, pepper, cayenne, paprika, and sugar. Stir to blend, then cover and simmer over low heat for at least 2 hours, stirring occasionally.\n" +
                    "After 2 hours, taste, and adjust salt, pepper, and chili powder if necessary. The longer the chili simmers, the better it will taste. Remove from heat and serve, or refrigerate, and serve the next day.\n" +
                    "To serve, ladle into bowls, and top with corn chips and shredded Cheddar cheese.\n";
        }
        if (_optionNum == 4) {
            _lunch = "Ingredients\n" +
                    "\n" +
                    "1 1/2 pounds ground beef \n" +
                    "1 egg 1 onion, chopped \n" +
                    "1 cup milk \n" +
                    "1 cup dried bread crumbs salt and pepper to taste \n" +
                    "2 tablespoons brown sugar \n" +
                    "2 tablespoons prepared mustard \n" +
                    "1/3 cup ketchup\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 350 degrees F (175 degrees C).\n" +
                    "In a large bowl, combine the beef, egg, onion, milk and bread OR cracker crumbs. Season with salt and pepper to taste and place in a lightly greased 5x9 inch loaf pan, OR form into a loaf and place in a lightly greased 9x13 inch baking dish.\n" +
                    "In a separate small bowl, combine the brown sugar, mustard and ketchup. Mix well and pour over the meatloaf.\n" +
                    "Bake at 350 degrees F (175 degrees C) for 1 hour.";
        }
        if (_optionNum == 5) {
            _lunch = "Ingredients\n" +
                    "2 pounds ground beef \n" +
                    "1 onion, chopped \n" +
                    "2 teaspoons minced garlic \n" +
                    "1 (2 ounce) can black olives, sliced \n" +
                    "1 (4 ounce) can diced green chili peppers \n" +
                    "1 (10 ounce) can diced tomatoes with green chile peppers \n" +
                    "1 (16 ounce) jar taco sauce \n" +
                    "2 (16 ounce) cans refried beans \n" +
                    "12 (8 inch) flour tortillas \n" +
                    "9 ounces shredded Colby cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "In a large skillet over medium heat, saute the ground beef for 5 minutes. Add the onion and garlic, and saute for 5 more minutes. Drain any excess fat, if desired. Mix in the olives, green chile peppers, tomatoes with green chile peppers, taco sauce and refried beans. Stir mixture thoroughly, reduce heat to low, and let simmer for 15 to 20 minutes.\n" +
                    "Spread a thin layer of the meat mixture in the bottom of a 4 quart casserole dish. Cover with a layer of tortillas followed by more meat mixture, then a layer of cheese. Repeat tortilla, meat, cheese pattern until all the tortillas are used, topping off with a layer of meat mixture and cheese.\n" +
                    "Bake for 20 to 30 minutes in the preheated oven, or until cheese is slightly brown and bubbly.";
        }
        if (_optionNum == 6) {
            _lunch = "Ingredients\n" +
                    "MEATBALLS: \n" +
                    "1 pound lean ground beef \n" +
                    "1 cup fresh bread crumbs \n" +
                    "1 tablespoon dried parsley \n" +
                    "1 tablespoon grated Parmesan cheese \n" +
                    "1/4 teaspoon ground black pepper \n" +
                    "1/8 teaspoon garlic powder \n" +
                    "1 egg, beaten\n" +
                    "SAUCE: \n" +
                    "3/4 cup chopped onion \n" +
                    "5 cloves garlic, minced \n" +
                    "1/4 cup olive oil \n" +
                    "2 (28 ounce) cans whole peeled tomatoes 2 teaspoons salt 1 teaspoon white sugar 1 bay leaf \n" +
                    "1 (6 ounce) can tomato paste \n" +
                    "3/4 teaspoon dried basil \n" +
                    "1/2 teaspoon ground black pepper\n" +
                    "\n" +
                    "Directions\n" +
                    "In a large bowl, combine ground beef, bread crumbs, parsley, Parmesan, 1/4 teaspoon black pepper, garlic powder and beaten egg. Mix well and form into 12 balls. Store, covered, in refrigerator until needed.\n" +
                    "In a large saucepan over medium heat, saute onion and garlic in olive oil until onion is translucent. Stir in tomatoes, salt, sugar and bay leaf. Cover, reduce heat to low, and simmer 90 minutes. Stir in tomato paste, basil, 1/2 teaspoon pepper and meatballs and simmer 30 minutes more. Serve.";
        }
        if (_optionNum == 7) {
            _lunch = "Ingredients\n" +
                    "2 pounds beef sirloin, cut into \n" +
                    "2 inch strips garlic powder to taste \n" +
                    "3 tablespoons vegetable oil \n" +
                    "1 cube beef bouillon \n" +
                    "1/4 cup hot water \n" +
                    "1 tablespoon cornstarch \n" +
                    "1/2 cup chopped onion \n" +
                    "2 large green bell peppers, roughly chopped 1 (14.5 ounce) can stewed tomatoes, with liquid 3 tablespoons soy sauce \n" +
                    "1 teaspoon white sugar \n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "Directions\n" +
                    "Sprinkle strips of sirloin with garlic powder to taste. In a large skillet over medium heat, heat the vegetable oil and brown the seasoned beef strips. Transfer to a slow cooker.\n" +
                    "Mix bouillon cube with hot water until dissolved, then mix in cornstarch until dissolved. Pour into the slow cooker with meat. Stir in onion, green peppers, stewed tomatoes, soy sauce, sugar, and salt.\n" +
                    "Cover, and cook on High for 3 to 4 hours, or on Low for 6 to 8 hours.";
        }
    }

    private void chickenOptions() {
        if (_optionNum == 1) {
            _lunch = "Ingredients\n" +
                    "1 cup uncooked white rice \n" +
                    "2 cups water \n" +
                    "1 cup all-purpose flour salt to taste ground black pepper to taste \n" +
                    "1 pinch dried oregano to taste \n" +
                    "1 pound skinless, boneless chicken cutlets, pounded to 1/4-inch thickness \n" +
                    "1 tablespoon olive oil \n" +
                    "2 tablespoons butter, divided \n" +
                    "1 clove garlic, minced \n" +
                    "1 cup sliced fresh mushrooms salt and ground black pepper to taste \n" +
                    "1/2 cup Marsala wine \n" +
                    "1/2 cup chicken stock\n" +
                    "\n" +
                    "Directions\n" +
                    "Bring the rice and water to a boil in a saucepan over high heat. Reduce heat to medium-low, cover, and simmer until the rice is tender, and the liquid has been absorbed, 20 to 25 minutes. Set rice aside.\n" +
                    "In a large bowl, whisk the flour with salt, black pepper, and oregano. Gently press the chicken breasts into the flour mixture to coat, and shake off the excess flour.\n" +
                    "Heat the olive oil and 1 tablespoon butter in a large skillet over medium-high heat. Arrange the chicken in the skillet and cook until the chicken is no longer pink inside and golden brown outside, 5 to 8 minutes per side. Drain the cooked chicken on a paper towel-lined plate.\n" +
                    "Melt the remaining 1 tablespoon butter in the same skillet over medium heat while scraping up any brown bits with a spoon. Stir in the garlic; cook and stir until fragrant. Add the mushrooms, and cook and stir until they are tender and have released their liquid, about 10 minutes. Season with salt and black pepper, then stir in the Marsala wine and chicken stock.\n" +
                    "Transfer the chicken back to the skillet, and spoon sauce over chicken pieces. Increase heat to medium-high, and bring to a boil. Cover, reduce heat to medium-low, and simmer until the the sauce is thickened, about 5 minutes more. Serve the chicken and sauce over the cooked rice.\n";
        }
        if (_optionNum == 2) {
            _lunch = "Ingredients\n" +
                    "1/3 cup chicken broth \n" +
                    "1 tablespoon oyster sauce \n" +
                    "1 tablespoon soy sauce, or as needed \n" +
                    "2 teaspoons fish sauce \n" +
                    "1 teaspoon white sugar \n" +
                    "1 teaspoon brown sugar \n" +
                    "2 tablespoons vegetable oil \n" +
                    "1 pound skinless, boneless chicken thighs, coarsely chopped \n" +
                    "1/4 cup sliced shallots \n" +
                    "4 cloves garlic, minced \n" +
                    "2 tablespoons minced Thai chilies, Serrano, or other hot pepper \n" +
                    "1 cup very thinly sliced fresh basil leaves \n" +
                    "2 cups hot cooked rice\n" +
                    "\n" +
                    "Directions\n" +
                    "Whisk chicken broth, oyster sauce, soy sauce, fish sauce, white sugar, and brown sugar together in a bowl until well blended.\n" +
                    "Heat large skillet over high heat. Drizzle in oil. Add chicken and stir fry until it loses its raw color, 2 to 3 minutes. Stir in shallots, garlic, and sliced chilies. Continue cooking on high heat until some of the juices start to caramelize in the bottom of the pan, about 2 or 3 more minutes. Add about a tablespoon of the sauce mixture to the skillet; cook and stir until sauce begins to caramelize, about 1 minute.\n" +
                    "Pour in the rest of the sauce. Cook and stir until sauce has deglazed the bottom of the pan. Continue to cook until sauce glazes onto the meat, 1 or 2 more minutes. Remove from heat.\n" +
                    "Stir in basil. Cook and stir until basil is wilted, about 20 seconds. Serve with rice.";
        }
        if (_optionNum == 3) {
            _lunch = "Ingredients\n" +
                    "3/4 cup mayonnaise \n" +
                    "1/2 cup grated Parmesan cheese \n" +
                    "3/4 teaspoon garlic powder \n" +
                    "3/4 cup Italian seasoned bread crumbs \n" +
                    "4 skinless, boneless chicken breast halves\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "In a bowl, mix the mayonnaise, Parmesan cheese, and garlic powder. Place bread crumbs in a separate bowl. Dip chicken into the mayonnaise mixture, then into the bread crumbs to coat. Arrange coated chicken on a baking sheet.\n" +
                    "Bake 20 minutes in the preheated oven, or until chicken juices run clear and coating is golden brown.";
        }
        if (_optionNum == 4) {
            _lunch = "Ingredients\n" +
                    "1/4 cup butter \n" +
                    "1 small onion, chopped \n" +
                    "3 celery ribs, chopped \n" +
                    "3 carrots, chopped \n" +
                    "2/3 cup frozen peas \n" +
                    "3 tablespoons chopped fresh parsley \n" +
                    "1/4 teaspoon dried thyme \n" +
                    "1/4 cup all-purpose flour \n" +
                    "2 cups lower-sodium chicken broth \n" +
                    "2/3 cup half-and-half cream salt and ground black pepper to taste \n" +
                    "3 cups cooked chicken, cut into bite-size pieces \n" +
                    "1 (16.3 ounce) can refrigerated flaky-style biscuits (such as Pillsbury Grands®) \n" +
                    "1 egg yolk, beaten \n" +
                    "1 tablespoon water\n" +
                    "\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 350 degrees F (175 degrees C).\n" +
                    "Melt butter in a skillet over medium-low heat, and cook the onion, celery, and carrots until the celery and carrots are tender, about 15 minutes, stirring occasionally. Stir in peas, parsley, thyme and flour, and cook, stirring constantly, until the flour coats the vegetables and begins to fry, about 5 minutes. Whisk in chicken broth and half-and-half, and cook until the sauce is thick and bubbling. Season to taste with salt and black pepper, and mix in the chicken meat.\n" +
                    "Transfer the chicken, vegetables, and sauce into a 2-quart baking dish. Arrange biscuits on top of the filling. In a small bowl, beat egg yolk with water; brush egg yolk on the biscuits.\n" +
                    "Bake in the preheated oven until the biscuits are golden brown and the pie filling is bubbling, 20 to 25 minutes. Let rest 10 minutes before serving.\n";
        }
        if (_optionNum == 5) {
            _lunch = "Ingredients\n" +
                    "6 skinless, boneless chicken breast halves 6 slices Swiss cheese \n" +
                    "6 slices ham \n" +
                    "3 tablespoons all-purpose flour \n" +
                    "1 teaspoon paprika \n" +
                    "6 tablespoons butter \n" +
                    "1/2 cup dry white wine \n" +
                    "1 teaspoon chicken bouillon granules \n" +
                    "1 tablespoon cornstarch \n" +
                    "1 cup heavy whipping cream\n" +
                    "\n" +
                    "Directions\n" +
                    "Pound chicken breasts if they are too thick. Place a cheese and ham slice on each breast within 1/2 inch of the edges. Fold the edges of the chicken over the filling, and secure with toothpicks. Mix the flour and paprika in a small bowl, and coat the chicken pieces.\n" +
                    "Heat the butter in a large skillet over medium-high heat, and cook the chicken until browned on all sides. Add the wine and bouillon. Reduce heat to low, cover, and simmer for 30 minutes, until chicken is no longer pink and juices run clear.\n" +
                    "Remove the toothpicks, and transfer the breasts to a warm platter. Blend the cornstarch with the cream in a small bowl, and whisk slowly into the skillet. Cook, stirring until thickened, and pour over the chicken. Serve warm.";
        }
        if (_optionNum == 6) {
            _lunch = "Ingredients\n" +
                    "1 tablespoon cornstarch \n" +
                    "1 tablespoon cold water \n" +
                    "1/2 cup white sugar \n" +
                    "1/2 cup soy sauce \n" +
                    "1/4 cup cider vinegar \n" +
                    "1 clove garlic, minced \n" +
                    "1/2 teaspoon ground ginger \n" +
                    "1/4 teaspoon ground black pepper \n" +
                    "12 skinless chicken thighs\n" +
                    "\n" +
                    "Directions\n" +
                    "In a small saucepan over low heat, combine the cornstarch, cold water, sugar, soy sauce, vinegar, garlic, ginger and ground black pepper. Let simmer, stirring frequently, until sauce thickens and bubbles.\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "Place chicken pieces in a lightly greased 9x13 inch baking dish. Brush chicken with the sauce. Turn pieces over, and brush again.\n" +
                    "Bake in the preheated oven for 30 minutes. Turn pieces over, and bake for another 30 minutes, until no longer pink and juices run clear. Brush with sauce every 10 minutes during cooking.";
        }
        if (_optionNum == 7) {
            _lunch = "Ingredients\n" +
                    "1/4 cup olive oil \n" +
                    "2 cloves garlic, crushed \n" +
                    "1/4 cup Italian-seasoned bread crumbs \n" +
                    "1/4 cup grated Parmesan cheese \n" +
                    "4 skinless, boneless chicken breast halves\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 425 degrees F (220 degrees C).\n" +
                    "Heat olive oil and garlic in a small saucepan over low heat until warmed, 1 to 2 minutes. Transfer garlic and oil to a shallow bowl.\n" +
                    "Combine bread crumbs and Parmesan cheese in a separate shallow bowl.\n" +
                    "Dip chicken breasts in the olive oil-garlic mixture using tongs; transfer to bread crumb mixture and turn to evenly coat. Transfer coated chicken to a shallow baking dish.\n" +
                    "Bake in the preheated oven until no longer pink and juices run clear, 30 to 35 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).";
        }
    }

    private void saladOptions() {
        if (_optionNum == 1) {
            _eveningMeal = "Ingredients\n" +
                    "1/2 cup olive oil \n" +
                    "1/2 cup red wine vinegar \n" +
                    "1 1/2 teaspoons garlic powder \n" +
                    "1 1/2 teaspoons dried basil \n" +
                    "1 1/2 teaspoons dried oregano \n" +
                    "3/4 teaspoon ground black pepper \n" +
                    "3/4 teaspoon white sugar \n" +
                    "2 1/2 cups cooked elbow macaroni \n" +
                    "3 cups fresh sliced mushrooms \n" +
                    "15 cherry tomatoes, halved \n" +
                    "1 cup sliced red bell peppers \n" +
                    "3/4 cup crumbled feta cheese \n" +
                    "1/2 cup chopped green onions \n" +
                    "1 (4 ounce) can whole black olives \n" +
                    "3/4 cup sliced pepperoni sausage, cut into strips\n" +
                    "\n" +
                    "Directions\n" +
                    "In a large bowl, whisk together olive oil, vinegar, garlic powder, basil, oregano, black pepper, and sugar. Add cooked pasta, mushrooms, tomatoes, red peppers, feta cheese, green onions, olives, and pepperoni. Toss until evenly coated. Cover, and chill 2 hours or overnight.\n";
        }
        if (_optionNum == 2) {
            _eveningMeal = "Ingredients\n" +
                    "2 pounds potatoes \n" +
                    "1 green bell pepper, minced \n" +
                    "1 cucumber, sliced and quartered \n" +
                    "1/2 cup sliced red onion \n" +
                    "8 ounces crumbled feta cheese \n" +
                    "1 lemon, juiced \n" +
                    "1/2 cup Italian-style salad dressing salt and pepper to taste \n" +
                    "3 pita breads, cut into wedges\n" +
                    "\n" +
                    "Directions\n" +
                    "Bring a large pot of salted water to a boil. Add potatoes and cook until tender but still firm, about 15 minutes. Drain, cool and chop.\n" +
                    "In a large bowl, combine the potatoes, green peppers, cucumbers, red onion and cheese.\n" +
                    "Whisk together the lemon juice, salad dressing, salt and pepper. Pour over salad and toss to coat. Serve with pita bread wedges if desired.";
        }
        if (_optionNum == 3) {
            _eveningMeal = "Ingredients\n" +
                    "2 cups penne pasta \n" +
                    "1/4 cup red wine vinegar \n" +
                    "1 tablespoon lemon juice \n" +
                    "2 cloves garlic, crushed \n" +
                    "2 teaspoons dried oregano salt and pepper to taste \n" +
                    "2/3 cup extra-virgin olive oil \n" +
                    "10 cherry tomatoes, halved \n" +
                    "1 small red onion, chopped \n" +
                    "1 green bell pepper, chopped \n" +
                    "1 red bell pepper, chopped \n" +
                    "1/2 cucumber, sliced \n" +
                    "1/2 cup sliced black olives \n" +
                    "1/2 cup crumbled feta cheese\n" +
                    "\n" +
                    "Directions\n" +
                    "Fill a large pot with lightly salted water and bring to a rolling boil over high heat. Once the water is boiling, stir in the penne, and return to a boil. Cook the pasta uncovered, stirring occasionally, until the pasta has cooked through, but is still firm to the bite, about 11 minutes. Rinse with cold water and drain well in a colander set in the sink.\n" +
                    "Whisk together the vinegar, lemon juice, garlic, oregano, salt, pepper, and olive oil. Set aside. Combine pasta, tomatoes, onion, green and red peppers, cucumber, olives, and feta cheese in a large bowl. Pour vinaigrette over the pasta and mix together. Cover and chill for 3 hours before serving.\n";
        }
        if (_optionNum == 4) {
            _eveningMeal = "Ingredients\n" +
                    "16 ounces cheese-filled tortellini \n" +
                    "1 green bell pepper, thinly sliced\n" +
                    "1 red bell pepper, julienned \n" +
                    "1 small red onion, julienned \n" +
                    "1/2 cup sliced black olives \n" +
                    "1/2 cup crumbled feta cheese \n" +
                    "1 boneless chicken breast half, cooked and sliced into thin strips \n" +
                    "1/4 cup olive oil \n" +
                    "2 teaspoons grated lemon zest, minced \n" +
                    "1/4 cup lemon juice \n" +
                    "2 tablespoons ground walnuts \n" +
                    "1 tablespoon honey\n" +
                    "\n" +
                    "Directions\n" +
                    "Cook pasta in a large pot of boiling salted water until al dente. Drain and cool under cold water. Refrigerate until chilled.\n" +
                    "Prepare the dressing in a small bowl by whisking together the olive oil, lemon zest, lemon juice, walnuts, and honey. Refrigerate until chilled.\n" +
                    "In a salad bowl, combine pasta, peppers, red onion, olives, and chicken. Add lemon dressing and feta cheese, toss and serve.\n";
        }
        if (_optionNum == 5) {
            _eveningMeal = "Ingredients\n" +
                    "1 pound fresh asparagus, trimmed \n" +
                    "2 zucchini, ends trimmed and halved lengthwise \n" +
                    "2 yellow squash, ends trimmed and halved lengthwise \n" +
                    "1 large red onion, sliced into \n" +
                    "1/2-inch thick slices \n" +
                    "2 red bell peppers, halved and seeded \n" +
                    "1/2 cup extra-virgin olive oil \n" +
                    "1/4 cup red wine vinegar \n" +
                    "1 tablespoon Dijon mustard \n" +
                    "1 clove garlic, minced salt and ground black pepper to taste\n" +
                    "\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat grill for medium heat and lightly oil the grate.\n" +
                    "Arrange asparagus, zucchini, yellow squash, red onion, and red bell peppers on preheated grill; cook until vegetables are tender and slightly charred, 10 to 15 minutes. Remove vegetables from grill and cut into bite-sized pieces.\n" +
                    "Whisk olive oil, red wine vinegar, Dijon mustard, garlic, salt, and black pepper together in a bowl to make the dressing. Toss vegetables with dressing in a bowl. Serve warm or at room temperature.\n";
        }
        if (_optionNum == 6) {
            _eveningMeal = "Ingredients\n" +
                    "6 slices bacon \n" +
                    "3 cups chopped broccoli \n" +
                    "3 cups chopped cauliflower \n" +
                    "3 cups chopped celery \n" +
                    "1 (10 ounce) package frozen green peas, thawed \n" +
                    "1 cup sweetened dried cranberries (such as Craisins®) \n" +
                    "1 1/2 cups mayonnaise \n" +
                    "1/4 cup Parmesan cheese \n" +
                    "1/4 cup white sugar \n" +
                    "2 tablespoons grated onion \n" +
                    "1 tablespoon white wine vinegar\n" +
                    "1 teaspoon salt \n" +
                    "1 cup Spanish peanuts\n" +
                    "\n" +
                    "Directions\n" +
                    "Place bacon in a large deep skillet. Cook over medium-high heat until evenly brown, 10 to 15 minutes. Drain bacon on a paper towel-lined plate; crumble.\n" +
                    "Mix broccoli, cauliflower, celery, peas, and cranberries in a large bowl.\n" +
                    "Whisk mayonnaise, Parmesan cheese, sugar, onion, vinegar, and salt together in a bowl. Pour dressing over the salad; add nuts and bacon and toss well.";
        }
        if (_optionNum == 7) {
            _eveningMeal = "Ingredients\n" +
                    "6 roma (plum) tomatoes, diced \n" +
                    "1 small cucumber - peeled, quartered lengthwise, and chopped \n" +
                    "3 green onions, chopped \n" +
                    "1/4 cup fresh basil leaves, cut into thin strips \n" +
                    "3 tablespoons olive oil \n" +
                    "2 tablespoons balsamic vinegar\n" +
                    "3 tablespoons crumbled feta cheese salt and freshly ground black pepper to taste\n" +
                    "\n" +
                    "Directions\n" +
                    "In a large bowl, toss together the tomatoes, cucumber, green onions, basil, olive oil, balsamic vinegar, and feta cheese. Season with salt and pepper.";
        }
    }

    private void cerealOptions() {
        if (_optionNum == 1) {
            _eveningMeal = "Ingredients\n" +
                    "1 cup quinoa \n" +
                    "2 cups nonfat milk \n" +
                    "1 pinch salt \n" +
                    "3 tablespoons maple syrup \n" +
                    "1/2 lemon, zested \n" +
                    "1 cup blueberries \n" +
                    "2 teaspoons flax seed\n" +
                    "\n" +
                    "Directions\n" +
                    "Rinse quinoa in a fine strainer with cold water to remove bitterness until water runs clear and is no longer frothy.\n" +
                    "Heat milk in a saucepan over medium heat until warm, 2 to 3 minutes. Stir quinoa and salt into the milk; simmer over medium-low heat until much of the liquid has been absorbed, about 20 minutes. Remove saucepan from heat. Stir maple syrup and lemon zest into the quinoa mixture. Gently fold blueberries into the mixture.\n" +
                    "Divide quinoa mixture between 2 bowls; top each with 1 teaspoon flax seed to serve.Ingredients\n" +
                    "1 cup quinoa \n" +
                    "2 cups nonfat milk \n" +
                    "1 pinch salt \n" +
                    "3 tablespoons maple syrup \n" +
                    "1/2 lemon, zested \n" +
                    "1 cup blueberries \n" +
                    "2 teaspoons flax seed\n" +
                    "\n" +
                    "Directions\n" +
                    "Rinse quinoa in a fine strainer with cold water to remove bitterness until water runs clear and is no longer frothy.\n" +
                    "Heat milk in a saucepan over medium heat until warm, 2 to 3 minutes. Stir quinoa and salt into the milk; simmer over medium-low heat until much of the liquid has been absorbed, about 20 minutes. Remove saucepan from heat. Stir maple syrup and lemon zest into the quinoa mixture. Gently fold blueberries into the mixture.\n" +
                    "Divide quinoa mixture between 2 bowls; top each with 1 teaspoon flax seed to serve.";
        }
        if (_optionNum == 2) {
            _eveningMeal = "Ingredients\n" +
                    "4 cups rolled oats \n" +
                    "1 cup wheat germ \n" +
                    "1/2 cup flax seed meal \n" +
                    "1/2 cup brown sugar \n" +
                    "1/2 cup raw sunflower seeds \n" +
                    "1/2 cup chopped pecans \n" +
                    "1/2 cup sliced almonds \n" +
                    "1 teaspoon ground cinnamon \n" +
                    "1 1/2 teaspoons salt \n" +
                    "1/3 cup canola oil \n" +
                    "1/4 cup honey \n" +
                    "1 teaspoon vanilla extract \n" +
                    "1/2 cup water\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat the oven to 300 degrees F (150 degrees C).\n" +
                    "In a large bowl, mix together the oats, wheat germ, flax seed meal, brown sugar, sunflower seeds, pecans, almonds, cinnamon and salt. In a separate bowl, whisk together the oil, honey, vanilla and water. Pour the wet ingredients over the dry, and mix until evenly blended. Spread in a greased 9x13 or 11x7 inch baking pan.\n" +
                    "Bake for 1 hour in the preheated oven, stirring every 20 minutes, or until toasted. Let cool completely before storing in an airtight container.";
        }
        if (_optionNum == 3) {
            _eveningMeal = "Ingredients\n" +
                    "3 cups cooked brown rice \n" +
                    "1 cup soy milk \n" +
                    "1/2 cup raisins \n" +
                    "1/2 cup toasted and chopped almonds \n" +
                    "1/4 cup maple syrup \n" +
                    "1 teaspoon ground cinnamon \n" +
                    "1/2 teaspoon ground cardamom\n" +
                    "\n" +
                    "Directions\n" +
                    "Combine rice, soy milk, raisins, almonds, maple syrup, cinnamon, and cardamom in a saucepan; bring to a boil over medium-high heat. Reduce heat to low and simmer, stirring frequently to prevent scorching, until thickened, 5 to 8 minutes. Spoon into 4 bowls.";
        }
        if (_optionNum == 4) {
            _eveningMeal = "Ingredients\n" +
                    "1/2 cup vegetable oil \n" +
                    "3/4 cup white sugar \n" +
                    "2 eggs \n" +
                    "1 cup milk \n" +
                    "1/2 teaspoon salt \n" +
                    "1 tablespoon baking powder \n" +
                    "3 cups quick cooking oats \n" +
                    "/2 cup raisins \n" +
                    "2 tablespoons brown sugar \n" +
                    "1/2 teaspoon ground cinnamon\n" +
                    "\n" +
                    "Directions\n" +
                    "Beat together oil and sugar. Mix in eggs, milk, salt, baking powder, oatmeal. Beat well then stir in raisins. Pour into a lightly grease pie pan. Sprinkle with brown sugar and cinnamon. Refrigerate overnight.\n" +
                    "The next morning, preheat oven to 350 degrees F (175 degrees C).\n" +
                    "Bake in preheated oven until firm, about 35 minutes. Serve hot.";
        }
        if (_optionNum == 5) {
            _eveningMeal = "Ingredients\n" +
                    "1 tablespoon olive oil \n" +
                    "2 cups rolled oats \n" +
                    "1/3 cup butter \n" +
                    "2 tablespoons honey \n" +
                    "1/3 cup packed brown sugar \n" +
                    "1/2 cup chopped almonds \n" +
                    "1/3 cup dried cranberries\n" +
                    "\n" +
                    "Directions\n" +
                    "Heat the oil in a large skillet over medium-high heat. Add oats then cook and stir until starting to brown and crisp, about 5 minutes. Remove from heat and spread out on a cookie sheet to cool.\n" +
                    "Melt the butter in the same pan over medium heat. Stir in the honey and brown sugar; cook, stirring constantly, until bubbly. Return the oats to the pan. Cook and stir for another 5 minutes or so. Pour out onto the cookie sheet and spread to cool.\n" +
                    "Once cool, transfer to an airtight container and stir in the almonds and dried cranberries. Any additional nuts and fruit can be stirred in at this time also.";
        }
        if (_optionNum == 6) {
            _eveningMeal = "Ingredients\n" +
                    "1/4 cup water \n" +
                    "1/4 cup skim milk \n" +
                    "1 tablespoon quinoa \n" +
                    "1/2 small banana, sliced \n" +
                    "1 1/2 tablespoons rolled oats \n" +
                    "1 tablespoon oat bran \n" +
                    "1 pinch salt \n" +
                    "1 pinch ground cinnamon \n" +
                    "1 tablespoon chopped walnuts \n" +
                    "1 teaspoon brown sugar \n" +
                    "1/4 teaspoon vanilla extract\n" +
                    "\n" +
                    "Directions\n" +
                    "Stir the water, milk, and quinoa together in a saucepan; bring to a gentle boil. Reduce heat to low and simmer 5 minutes, or until the quinoa begins to soften. Stir in the banana, rolled oats, oat bran, salt, and cinnamon. Cook, stirring frequently over low heat for 2 to 5 minutes or until the mixture thickens. Remove from the heat and stir in the walnuts, brown sugar, and vanilla.";
        }
        if (_optionNum == 7) {
            _eveningMeal = "Ingredients\n" +
                    "2 cups skim milk \n" +
                    "2 tablespoons honey \n" +
                    "3 teaspoons ground cinnamon \n" +
                    "2 cups dry couscous \n" +
                    "1/3 cup chopped dried apricots \n" +
                    "1/3 cup raisins \n" +
                    "1/2 cup slivered almonds\n" +
                    "\n" +
                    "Directions\n" +
                    "In a saucepan over medium heat, combine the milk, honey and cinnamon. As soon as it comes to a boil, stir in the couscous. Turn off the heat, cover and let stand for 5 minutes. Stir in the apricots, raisins and almonds.";
        }
    }

    private void pancakesOptions() {
        if (_optionNum == 1) {
            _eveningMeal = "Ingredients\n" +
                    "3/4 cup cold water or milk \n" +
                    "1/2 teaspoon baking soda \n" +
                    "1/2 cup ricotta cheese \n" +
                    "1 tablespoon grated lemon zest (just the yellow part of the skin) \n" +
                    "1 tablespoon vegetable oil \n" +
                    "1 tablespoon white sugar \n" +
                    "1 large egg \n" +
                    "1/8 teaspoon vanilla extract \n" +
                    "2 tablespoons melted butter \n" +
                    "1 tablespoon lemon juice \n" +
                    "1 cup self-rising flour \n" +
                    "2 tablespoons self-rising flour\n" +
                    "\n" +
                    "Directions\n" +
                    "Whisk water and baking soda together in a mixing bowl. Add ricotta cheese, lemon zest, vegetables oil, sugar, egg, and vanilla. Whisk until smooth, breaking up lumps of cheese as you mix. Add melted butter, lemon juice, and 1 cup plus 2 tablespoons self-rising flour. Whisk together, stirring until most of flour disappears into the batter.\n" +
                    "Let batter sit at room temperature about 15 minutes.\n" +
                    "Heat lightly greased cast iron skillet or griddle over medium-high heat. Portion out 1/4 cup scoops of batter onto skillet (cook in batches). When bubbles begin to form on the surface and the edges of the pancakes start to look dry (2 to 3 minutes), flip and cook other side until cooked through, 2 to 3 minutes. Transfer to a warm plate.\n";
        }
        if (_optionNum == 2) {
            _eveningMeal = "Ingredients\n" +
                    "1 1/2 cups buttermilk \n" +
                    "1 1/4 cups all-purpose flour \n" +
                    "1/3 cup white sugar \n" +
                    "1/3 cup dry farina cereal (such as Cream of Wheat®) \n" +
                    "1/4 cup vegetable oil \n" +
                    "1 egg \n" +
                    "1 teaspoon vanilla extract \n" +
                    "1 teaspoon baking powder \n" +
                    "1 teaspoon baking soda \n" +
                    "1/2 teaspoon salt\n" +
                    "\n" +
                    "Directions\n" +
                    "Combine buttermilk, flour, sugar, farina, oil, egg, vanilla extract, baking powder, baking soda, and salt in a bowl. Beat using an electric mixer on low until just combined.\n" +
                    "Heat a lightly oiled griddle over medium-low heat. Drop batter by large spoonfuls onto the griddle and cook until middle is set, about 4 minutes. Flip and cook until golden brown on the other side, 3 to 5 minutes. Repeat with remaining batter.";
        }
        if (_optionNum == 3) {
            _eveningMeal = "Ingredients\n" +
                    "3 large eggs \n" +
                    "3/4 cup whole milk \n" +
                    "1/2 teaspoon vanilla extract \n" +
                    "1/4 cup white sugar \n" +
                    "1/4 teaspoon salt \n" +
                    "1/2 cup all-purpose flour \n" +
                    "2 tablespoons unsalted butter \n" +
                    "1 cup sliced fresh strawberries\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat an oven to 425 degrees F (220 degrees C).\n" +
                    "Place the eggs, milk, vanilla extract, sugar, salt, and flour into a blender. Pulse until no dry lumps remain in the batter. Melt the butter in an 8-inch, cast iron skillet over medium-high heat. Pour in the batter, and drop in the strawberries.\n" +
                    "Place the skillet into the oven, and bake until puffed and golden, 20 to 25 minutes. Remove from the oven and serve immediately.";
        }
        if (_optionNum == 4) {
            _eveningMeal = "Ingredients\n" +
                    "1/2 cup wheat germ \n" +
                    "2 cups whole wheat flour \n" +
                    "1 teaspoon baking soda \n" +
                    "1/2 teaspoon salt \n" +
                    "3 cups buttermilk \n" +
                    "2 eggs, lightly beaten \n" +
                    "1 tablespoon canola oil cooking spray\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat oven to 350 degrees F (175 degrees C).\n" +
                    "Spread wheat germ over a baking sheet.\n" +
                    "Bake in the preheated oven until toasted, about 5 minutes. Cool slightly, then transfer wheat germ to a large bowl.\n" +
                    "Stir flour, baking soda, and salt into wheat germ. Beat buttermilk, eggs, and oil in another bowl until smooth; pour egg mixture into flour mixture and stir until batter is just blended.\n" +
                    "Heat griddle over medium-high heat and coat with cooking spray. Pour 1/4 cup portions of batter onto the griddle and cook until bubbles form and the edges are dry, about 2 minutes. Flip and cook until browned on the other side, about 3 minutes more. Repeat with remaining batter.";
        }
        if (_optionNum == 5) {
            _eveningMeal = "Ingredients\n" +
                    "3/4 cup blue cornmeal \n" +
                    "1 teaspoon salt \n" +
                    "1 tablespoon white sugar \n" +
                    "1 cup boiling water \n" +
                    "1 beaten egg \n" +
                    "1/2 cup milk \n" +
                    "2 tablespoons butter, melted \n" +
                    "3/4 cup unbleached all-purpose flour \n" +
                    "2 teaspoons baking powder \n" +
                    "1/2 cup pine nuts, toasted\n" +
                    "\n" +
                    "Directions\n" +
                    "In a medium bowl, mix together the blue cornmeal, salt and sugar. Stir in the boiling water until all of the ingredients are wet. Cover, and let stand for a few minutes.\n" +
                    "In a measuring cup, combine the milk, egg and melted butter. Stir the milk mixture into the cornmeal mixture. Combine the flour and baking powder; stir into the cornmeal mixture until just incorporated. If the batter is stiff, add a little more milk until it flows off the spoon thickly but smoothly.\n" +
                    "Heat a large cast iron skillet over medium heat, and grease it with a dab of oil or butter. Use about 2 tablespoons of batter for each pancake. Quickly sprinkle a few pignoli onto each cake. When the entire surface of the pancakes are covered with bubbles, flip them over, and cook the other side until golden. It's hard to tell when blue food is cooked through--so give them a few extra seconds if you're in doubt.\n" +
                    "Serve immediately with maple syrup of fruit preserves.";
        }
        if (_optionNum == 6) {
            _eveningMeal = "Ingredients\n" +
                    "5 eggs \n" +
                    "1 (8 ounce) package cream cheese, softened 1 tablespoon maple syrup \n" +
                    "2 teaspoons coconut flour \n" +
                    "1 teaspoon ground cinnamon cooking spray\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat an electric griddle to 225 degrees F (107 degrees C).\n" +
                    "Blend eggs and cream cheese in a blender until smooth. Add maple syrup, coconut flour, and cinnamon; blend until batter is smooth.\n" +
                    "Spray the preheated griddle with cooking spray. Pour batter onto the griddle to form small pancakes. Cook until edges set and do not tear when lifted with a spatula, 5 to 7 minutes. Flip pancakes gently with 2 rubber spatulas. Cook until second side is set, about 5 minutes. Repeat with remaining batter, spraying griddle between batches.";
        }
        if (_optionNum == 7) {
            _eveningMeal = "Ingredients\n" +
                    "5 eggs \n" +
                    "1 (8 ounce) package cream cheese, softened 1 tablespoon maple syrup \n" +
                    "2 teaspoons coconut flour \n" +
                    "1 teaspoon ground cinnamon cooking spray\n" +
                    "\n" +
                    "Directions\n" +
                    "Preheat an electric griddle to 225 degrees F (107 degrees C).\n" +
                    "Blend eggs and cream cheese in a blender until smooth. Add maple syrup, coconut flour, and cinnamon; blend until batter is smooth.\n" +
                    "Spray the preheated griddle with cooking spray. Pour batter onto the griddle to form small pancakes. Cook until edges set and do not tear when lifted with a spatula, 5 to 7 minutes. Flip pancakes gently with 2 rubber spatulas. Cook until second side is set, about 5 minutes. Repeat with remaining batter, spraying griddle between batches.";
        }
    }


}
