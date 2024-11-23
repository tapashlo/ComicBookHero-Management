public class Main {
    public static void main(String[] args) {
        // Create HeroManager
        HeroManager manager = new HeroManager();

        // Add Heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Invisible Woman", 70, Affiliation.FANTASTIC_FOUR));

        System.out.println("Original List:");
        manager.displayHeroes();

        // Sort with Bubble Sort
        manager.bubbleSort();
        System.out.println("\nBubble Sorted List:");
        manager.displayHeroes();

        // Sort with Insertion Sort
        manager.insertionSort();
        System.out.println("\nInsertion Sorted List:");
        manager.displayHeroes();

        // Remove a Hero
        manager.removeHero("Batman");
        System.out.println("\nAfter Removing Batman:");
        manager.displayHeroes();

        // Add a new Hero
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        System.out.println("\nAfter Adding Wonder Woman:");
        manager.displayHeroes();

        // Display Heroes as a 2D Array
        System.out.println("\nHeroes as 2D Array:");
        manager.displayAs2DArray();
    }
}
